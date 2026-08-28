import java.util.List;

public class cyd extends cuo {
   public cyd(cwj.a $$0) {
      super($$0);
   }

   @Override
   public cwn n() {
      cwn $$0 = super.n();
      $$0.b(kv.Q, new cym(cyn.C));
      return $$0;
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      cym $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public wo a(cwn $$0) {
      cym $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }
}
