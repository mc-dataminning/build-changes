import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class edn extends edv {
   final efv a;
   final List<edn.b> b;

   edn(efh[] $$0, efv $$1, List<edn.b> $$2) {
      super($$0);
      this.a = $$1;
      this.b = ImmutableList.copyOf($$2);
   }

   @Override
   public edx b() {
      return edy.v;
   }

   static ei.g a(String $$0) {
      try {
         return new ei().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         throw new IllegalArgumentException("Failed to parse path " + $$0, var2);
      }
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.b();
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      rl $$2 = this.a.a($$1);
      if ($$2 != null) {
         this.b.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static edn.a a(efv $$0) {
      return new edn.a($$0);
   }

   public static edn.a a(ech.b $$0) {
      return new edn.a(eft.a($$0));
   }

   public static class a extends edv.a<edn.a> {
      private final efv a;
      private final List<edn.b> b = Lists.newArrayList();

      a(efv $$0) {
         this.a = $$0;
      }

      public edn.a a(String $$0, String $$1, edn.c $$2) {
         this.b.add(new edn.b($$0, $$1, $$2));
         return this;
      }

      public edn.a a(String $$0, String $$1) {
         return this.a($$0, $$1, edn.c.a);
      }

      protected edn.a a() {
         return this;
      }

      @Override
      public edw b() {
         return new edn(this.g(), this.a, this.b);
      }
   }

   static class b {
      private final String a;
      private final ei.g b;
      private final String c;
      private final ei.g d;
      private final edn.c e;

      b(String $$0, String $$1, edn.c $$2) {
         this.a = $$0;
         this.b = edn.a($$0);
         this.c = $$1;
         this.d = edn.a($$1);
         this.e = $$2;
      }

      public void a(Supplier<rl> $$0, rl $$1) {
         try {
            List<rl> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.e.a($$0.get(), this.d, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public JsonObject a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("source", this.a);
         $$0.addProperty("target", this.c);
         $$0.addProperty("op", this.e.d);
         return $$0;
      }

      public static edn.b a(JsonObject $$0) {
         String $$1 = arf.i($$0, "source");
         String $$2 = arf.i($$0, "target");
         edn.c $$3 = edn.c.a(arf.i($$0, "op"));
         return new edn.b($$1, $$2, $$3);
      }
   }

   public static enum c {
      a("replace") {
         @Override
         public void a(rl $$0, ei.g $$1, List<rl> $$2) throws CommandSyntaxException {
            $$1.a($$0, (rl)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(rl $$0, ei.g $$1, List<rl> $$2) throws CommandSyntaxException {
            List<rl> $$3 = $$1.a($$0, qy::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qy) {
                  $$2.forEach($$1xx -> ((qy)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(rl $$0, ei.g $$1, List<rl> $$2) throws CommandSyntaxException {
            List<rl> $$3 = $$1.a($$0, qs::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qs) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof qs) {
                        ((qs)$$1x).a((qs)$$1xx);
                     }
                  });
               }
            });
         }
      };

      final String d;

      public abstract void a(rl var1, ei.g var2, List<rl> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.d = $$0;
      }

      public static edn.c a(String $$0) {
         for (edn.c $$1 : values()) {
            if ($$1.d.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid merge strategy" + $$0);
      }
   }

   public static class d extends edv.c<edn> {
      public void a(JsonObject $$0, edn $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("source", $$2.serialize($$1.a));
         JsonArray $$3 = new JsonArray();
         $$1.b.stream().map(edn.b::a).forEach($$3::add);
         $$0.add("ops", $$3);
      }

      public edn a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         efv $$3 = arf.a($$0, "source", $$1, efv.class);
         List<edn.b> $$4 = Lists.newArrayList();

         for (JsonElement $$6 : arf.v($$0, "ops")) {
            JsonObject $$7 = arf.m($$6, "op");
            $$4.add(edn.b.a($$7));
         }

         return new edn($$2, $$3, $$4);
      }
   }
}
