import com.mojang.serialization.MapCodec;

public abstract class czl extends cwp implements czk {
   public czl(djf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czl> a();

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbs $$4 = cbs.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cbs $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(djg $$0) {
      return $$0.i() || $$0.a(asg.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            auq.a($$1, $$2, $$3, new jp(jx.B, $$0));
         }
      }
   }

   public int b(djg $$0, csu $$1, hx $$2) {
      return -16777216;
   }
}
