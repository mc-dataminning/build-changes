import com.mojang.serialization.MapCodec;

public class cxg extends czy implements cwm, cxf {
   public static final MapCodec<cxg> c = b(cxg::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cxg> a() {
      return c;
   }

   public cxg(diz.d $$0) {
      super($$0, ic.a, s_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(aup $$0) {
      return 1;
   }

   @Override
   protected boolean g(dja $$0) {
      return $$0.i();
   }

   @Override
   protected cwj b() {
      return cwl.sw;
   }

   @Override
   protected dja a(dja $$0, dja $$1) {
      return $$1.a(t_, $$0.c(t_));
   }

   @Override
   protected dja a(dja $$0, aup $$1) {
      return super.a($$0, $$1).a(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(cmu.wj);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      return cxf.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      $$0.a($$2, $$3.a(t_, Boolean.valueOf(true)), 2);
   }
}
