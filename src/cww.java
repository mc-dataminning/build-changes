import com.mojang.serialization.MapCodec;

public class cww extends czo implements cwc, cwv {
   public static final MapCodec<cww> c = b(cww::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cww> a() {
      return c;
   }

   public cww(dio.d $$0) {
      super($$0, ia.a, r_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(auf $$0) {
      return 1;
   }

   @Override
   protected boolean g(dip $$0) {
      return $$0.i();
   }

   @Override
   protected cvz b() {
      return cwb.sw;
   }

   @Override
   protected dip a(dip $$0, dip $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dip a(dip $$0, auf $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(cmk.wj);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      return cwv.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
