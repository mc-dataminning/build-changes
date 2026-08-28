import java.util.List;

public class cye extends cup {
   public cye(cwk.a $$0) {
      super($$0);
   }

   @Override
   public cwo n() {
      cwo $$0 = super.n();
      $$0.b(kv.Q, new cyn(cyo.C));
      return $$0;
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      cyn $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public wp a(cwo $$0) {
      cyn $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }
}
