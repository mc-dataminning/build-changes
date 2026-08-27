import com.google.gson.JsonObject;
import java.util.List;
import java.util.stream.Collectors;

public class cg extends cv<cg.a> {
   static final acq a = new acq("lightning_strike");

   @Override
   public acq a() {
      return a;
   }

   public cg.a a(JsonObject $$0, ba $$1, be $$2) {
      ba $$3 = bo.a($$0, "lightning", $$2);
      ba $$4 = bo.a($$0, "bystander", $$2);
      return new cg.a($$1, $$3, $$4);
   }

   public void a(aig $$0, bfy $$1, List<bfj> $$2) {
      List<dzk> $$3 = $$2.stream().map($$1x -> bo.b($$0, $$1x)).collect(Collectors.toList());
      dzk $$4 = bo.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static class a extends ar {
      private final ba a;
      private final ba b;

      public a(ba $$0, ba $$1, ba $$2) {
         super(cg.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cg.a a(bo $$0, bo $$1) {
         return new cg.a(ba.a, bo.a($$0), bo.a($$1));
      }

      public boolean a(dzk $$0, List<dzk> $$1) {
         return !this.a.a($$0) ? false : this.b == ba.a || !$$1.stream().noneMatch(this.b::a);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("lightning", this.a.a($$0));
         $$1.add("bystander", this.b.a($$0));
         return $$1;
      }
   }
}
