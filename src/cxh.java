import com.mojang.serialization.MapCodec;

public class cxh extends czx implements cwm, cxf {
   public static final MapCodec<cxh> c = b(cxh::new);

   @Override
   public MapCodec<cxh> a() {
      return c;
   }

   public cxh(diz.d $$0) {
      super($$0, ic.a, s_, false);
      this.k(this.E.b().a(t_, Boolean.valueOf(false)));
   }

   @Override
   protected czy c() {
      return (czy)cwl.sv;
   }

   @Override
   protected dja a(dja $$0, dja $$1) {
      return $$1.a(t_, $$0.c(t_));
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
