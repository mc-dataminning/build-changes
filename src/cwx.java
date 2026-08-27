import com.mojang.serialization.MapCodec;

public class cwx extends czn implements cwc, cwv {
   public static final MapCodec<cwx> c = b(cwx::new);

   @Override
   public MapCodec<cwx> a() {
      return c;
   }

   public cwx(dio.d $$0) {
      super($$0, ia.a, r_, false);
      this.k(this.E.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected czo c() {
      return (czo)cwb.sv;
   }

   @Override
   protected dip a(dip $$0, dip $$1) {
      return $$1.a(s_, $$0.c(s_));
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
