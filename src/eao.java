import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eao extends eay {
   final cpn a;
   final Set<dde<?>> b;

   eao(eck[] $$0, cpn $$1, Set<dde<?>> $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public eba b() {
      return ebb.w;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.g);
   }

   @Override
   protected cfz a(cfz $$0, dzk $$1) {
      dcb $$2 = $$1.c(ebw.g);
      if ($$2 != null) {
         qr $$3 = $$0.w();
         qr $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qr();
            $$3.a("BlockStateTag", $$4);
         }

         this.b.stream().filter($$2::b).forEach($$2x -> $$4.a($$2x.f(), a($$2, $$2x)));
      }

      return $$0;
   }

   public static eao.a a(cpn $$0) {
      return new eao.a($$0);
   }

   private static <T extends Comparable<T>> String a(dcb $$0, dde<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eay.a<eao.a> {
      private final cpn a;
      private final Set<dde<?>> b = Sets.newHashSet();

      a(cpn $$0) {
         this.a = $$0;
      }

      public eao.a a(dde<?> $$0) {
         if (!this.a.l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eao.a a() {
         return this;
      }

      @Override
      public eaz b() {
         return new eao(this.g(), this.a, this.b);
      }
   }

   public static class b extends eay.c<eao> {
      public void a(JsonObject $$0, eao $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("block", jb.f.b($$1.a).toString());
         JsonArray $$3 = new JsonArray();
         $$1.b.forEach($$1x -> $$3.add($$1x.f()));
         $$0.add("properties", $$3);
      }

      public eao a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         acq $$3 = new acq(aor.i($$0, "block"));
         cpn $$4 = jb.f.b($$3).orElseThrow(() -> new IllegalArgumentException("Can't find block " + $$3));
         dcc<cpn, dcb> $$5 = $$4.l();
         Set<dde<?>> $$6 = Sets.newHashSet();
         JsonArray $$7 = aor.a($$0, "properties", null);
         if ($$7 != null) {
            $$7.forEach($$2x -> $$6.add($$5.a(aor.a($$2x, "property"))));
         }

         return new eao($$2, $$4, $$6);
      }
   }
}
