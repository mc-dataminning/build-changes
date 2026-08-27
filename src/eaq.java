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

public class eaq extends eay {
   final ecy a;
   final List<eaq.b> b;

   eaq(eck[] $$0, ecy $$1, List<eaq.b> $$2) {
      super($$0);
      this.a = $$1;
      this.b = ImmutableList.copyOf($$2);
   }

   @Override
   public eba b() {
      return ebb.v;
   }

   static eh.g a(String $$0) {
      try {
         return new eh().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         throw new IllegalArgumentException("Failed to parse path " + $$0, var2);
      }
   }

   @Override
   public Set<ebt<?>> a() {
      return this.a.b();
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      rk $$2 = this.a.a($$1);
      if ($$2 != null) {
         this.b.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static eaq.a a(ecy $$0) {
      return new eaq.a($$0);
   }

   public static eaq.a a(dzk.b $$0) {
      return new eaq.a(ecw.a($$0));
   }

   public static class a extends eay.a<eaq.a> {
      private final ecy a;
      private final List<eaq.b> b = Lists.newArrayList();

      a(ecy $$0) {
         this.a = $$0;
      }

      public eaq.a a(String $$0, String $$1, eaq.c $$2) {
         this.b.add(new eaq.b($$0, $$1, $$2));
         return this;
      }

      public eaq.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eaq.c.a);
      }

      protected eaq.a a() {
         return this;
      }

      @Override
      public eaz b() {
         return new eaq(this.g(), this.a, this.b);
      }
   }

   static class b {
      private final String a;
      private final eh.g b;
      private final String c;
      private final eh.g d;
      private final eaq.c e;

      b(String $$0, String $$1, eaq.c $$2) {
         this.a = $$0;
         this.b = eaq.a($$0);
         this.c = $$1;
         this.d = eaq.a($$1);
         this.e = $$2;
      }

      public void a(Supplier<rk> $$0, rk $$1) {
         try {
            List<rk> $$2 = this.b.a($$1);
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

      public static eaq.b a(JsonObject $$0) {
         String $$1 = aor.i($$0, "source");
         String $$2 = aor.i($$0, "target");
         eaq.c $$3 = eaq.c.a(aor.i($$0, "op"));
         return new eaq.b($$1, $$2, $$3);
      }
   }

   public static enum c {
      a("replace") {
         @Override
         public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
            $$1.a($$0, (rk)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
            List<rk> $$3 = $$1.a($$0, qx::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qx) {
                  $$2.forEach($$1xx -> ((qx)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
            List<rk> $$3 = $$1.a($$0, qr::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qr) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof qr) {
                        ((qr)$$1x).a((qr)$$1xx);
                     }
                  });
               }
            });
         }
      };

      final String d;

      public abstract void a(rk var1, eh.g var2, List<rk> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.d = $$0;
      }

      public static eaq.c a(String $$0) {
         for (eaq.c $$1 : values()) {
            if ($$1.d.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid merge strategy" + $$0);
      }
   }

   public static class d extends eay.c<eaq> {
      public void a(JsonObject $$0, eaq $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("source", $$2.serialize($$1.a));
         JsonArray $$3 = new JsonArray();
         $$1.b.stream().map(eaq.b::a).forEach($$3::add);
         $$0.add("ops", $$3);
      }

      public eaq a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         ecy $$3 = aor.a($$0, "source", $$1, ecy.class);
         List<eaq.b> $$4 = Lists.newArrayList();

         for (JsonElement $$6 : aor.v($$0, "ops")) {
            JsonObject $$7 = aor.m($$6, "op");
            $$4.add(eaq.b.a($$7));
         }

         return new eaq($$2, $$3, $$4);
      }
   }
}
