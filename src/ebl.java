import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ebl extends eay {
   final boolean a;
   final List<sw> b;
   @Nullable
   final dzk.b c;

   public ebl(eck[] $$0, boolean $$1, List<sw> $$2, @Nullable dzk.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = ImmutableList.copyOf($$2);
      this.c = $$3;
   }

   @Override
   public eba b() {
      return ebb.t;
   }

   @Override
   public Set<ebt<?>> a() {
      return this.c != null ? ImmutableSet.of(this.c.a()) : ImmutableSet.of();
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      qx $$2 = this.a($$0, !this.b.isEmpty());
      if ($$2 != null) {
         if (this.a) {
            $$2.clear();
         }

         UnaryOperator<sw> $$3 = ebm.a($$1, this.c);
         this.b.stream().map($$3).map(sw.a::a).map(ri::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private qx a(cfz $$0, boolean $$1) {
      qr $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new qr();
         $$0.c($$2);
      }

      qr $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new qr();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         qx $$8 = new qx();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static ebl.a c() {
      return new ebl.a();
   }

   public static class a extends eay.a<ebl.a> {
      private boolean a;
      private dzk.b b;
      private final List<sw> c = Lists.newArrayList();

      public ebl.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ebl.a a(dzk.b $$0) {
         this.b = $$0;
         return this;
      }

      public ebl.a a(sw $$0) {
         this.c.add($$0);
         return this;
      }

      protected ebl.a a() {
         return this;
      }

      @Override
      public eaz b() {
         return new ebl(this.g(), this.a, this.c, this.b);
      }
   }

   public static class b extends eay.c<ebl> {
      public void a(JsonObject $$0, ebl $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("replace", $$1.a);
         JsonArray $$3 = new JsonArray();

         for (sw $$4 : $$1.b) {
            $$3.add(sw.a.c($$4));
         }

         $$0.add("lore", $$3);
         if ($$1.c != null) {
            $$0.add("entity", $$2.serialize($$1.c));
         }
      }

      public ebl a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         boolean $$3 = aor.a($$0, "replace", false);
         List<sw> $$4 = Streams.stream(aor.v($$0, "lore")).map(sw.a::a).collect(ImmutableList.toImmutableList());
         dzk.b $$5 = aor.a($$0, "entity", null, $$1, dzk.b.class);
         return new ebl($$2, $$3, $$4, $$5);
      }
   }
}
