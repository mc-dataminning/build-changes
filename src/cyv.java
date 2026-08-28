import java.util.List;

public class cyv extends cvj {
   public cyv(cxd.a $$0) {
      super($$0);
   }

   @Override
   public cxh n() {
      cxh $$0 = super.n();
      $$0.b(kv.R, new cze(czf.C));
      return $$0;
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      cze $$4 = $$0.a(kv.R);
      if ($$4 != null) {
         $$4.a($$2::add, $$0.a(kv.S, 1.0F), $$1.b());
      }
   }

   @Override
   public wp a(cxh $$0) {
      cze $$1 = $$0.a(kv.R);
      return $$1 != null ? $$1.a(this.m + ".effect.") : super.a($$0);
   }
}
