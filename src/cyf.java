import java.util.List;

public class cyf extends cuq {
   public cyf(cwl.a $$0) {
      super($$0);
   }

   @Override
   public cwp n() {
      cwp $$0 = super.n();
      $$0.b(kv.Q, new cyo(cyp.C));
      return $$0;
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      cyo $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public wo a(cwp $$0) {
      cyo $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }
}
