import com.mojang.serialization.MapCodec;

public abstract class czf extends cwj implements cze {
   public czf(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czf> a();

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbn $$4 = cbn.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cbn $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(dja $$0) {
      return $$0.i() || $$0.a(asb.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            aul.a($$1, $$2, $$3, new jp(jx.B, $$0));
         }
      }
   }

   public int b(dja $$0, cso $$1, hx $$2) {
      return -16777216;
   }
}
