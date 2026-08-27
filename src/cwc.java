import com.mojang.serialization.MapCodec;

public class cwc extends cyu implements cvi, cwb {
   public static final MapCodec<cwc> c = b(cwc::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cwc> a() {
      return c;
   }

   public cwc(dhm.d $$0) {
      super($$0, ib.a, r_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(atw $$0) {
      return 1;
   }

   @Override
   protected boolean g(dhn $$0) {
      return $$0.i();
   }

   @Override
   protected cvf b() {
      return cvh.sw;
   }

   @Override
   protected dhn a(dhn $$0, dhn $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dhn a(dhn $$0, atw $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(clr.wi);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      return cwb.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
