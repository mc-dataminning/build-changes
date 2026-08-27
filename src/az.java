import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonObject;

public class az extends cv<az.a> {
   static final acq a = new acq("consume_item");

   @Override
   public acq a() {
      return a;
   }

   public az.a a(JsonObject $$0, ba $$1, be $$2) {
      return new az.a($$1, bz.a($$0.get("item")));
   }

   public void a(aig $$0, cfz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final bz a;

      public a(ba $$0, bz $$1) {
         super(az.a, $$0);
         this.a = $$1;
      }

      public static az.a c() {
         return new az.a(ba.a, bz.a);
      }

      public static az.a a(bz $$0) {
         return new az.a(ba.a, $$0);
      }

      public static az.a a(cml $$0) {
         return new az.a(ba.a, new bz(null, ImmutableSet.of($$0.k()), cj.d.e, cj.d.e, bj.b, bj.b, null, cl.a));
      }

      public boolean a(cfz $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         return $$1;
      }
   }
}
