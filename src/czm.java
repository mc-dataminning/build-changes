import com.mojang.serialization.MapCodec;

public abstract class czm extends cwq implements czl {
   public czm(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czm> a();

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbt $$4 = cbt.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cbt $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(djh $$0) {
      return $$0.i() || $$0.a(ash.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            aur.a($$1, $$2, $$3, new jp(jx.B, $$0));
         }
      }
   }

   public int b(djh $$0, csv $$1, hx $$2) {
      return -16777216;
   }
}
