import java.util.List;

public class cyg extends cur {
   public cyg(cwm.a $$0) {
      super($$0);
   }

   @Override
   public cwq n() {
      cwq $$0 = super.n();
      $$0.b(kv.Q, new cyp(cyq.C));
      return $$0;
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      cyp $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public wp a(cwq $$0) {
      cyp $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }
}
