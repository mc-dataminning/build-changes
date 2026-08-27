import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class cm extends cv<cm.a> {
   private final acq a;

   public cm(acq $$0) {
      this.a = $$0;
   }

   @Override
   public acq a() {
      return this.a;
   }

   protected cm.a a(JsonObject $$0, ba $$1, be $$2) {
      bz $$3 = bz.a($$0.get("item"));
      ba $$4 = bo.a($$0, "entity", $$2);
      return new cm.a(this.a, $$1, $$3, $$4);
   }

   public void a(aig $$0, cfz $$1, @Nullable bfj $$2) {
      dzk $$3 = bo.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static class a extends ar {
      private final bz a;
      private final ba b;

      public a(acq $$0, ba $$1, bz $$2, ba $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static cm.a a(ba $$0, bz $$1, ba $$2) {
         return new cm.a(ai.O.a(), $$0, $$1, $$2);
      }

      public static cm.a b(ba $$0, bz $$1, ba $$2) {
         return new cm.a(ai.P.a(), $$0, $$1, $$2);
      }

      public boolean a(aig $$0, cfz $$1, dzk $$2) {
         return !this.a.a($$1) ? false : this.b.a($$2);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         $$1.add("entity", this.b.a($$0));
         return $$1;
      }
   }
}
