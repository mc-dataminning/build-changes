import com.mojang.serialization.MapCodec;

public class dbv extends cwy implements cxb {
   public static final MapCodec<dbv> a = b(dbv::new);

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   public dbv(djo.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      $$0.I_().c(ke.aw).flatMap($$0x -> $$0x.b(qi.n)).ifPresent($$3x -> ((drp)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public cxb.a av_() {
      return cxb.a.a;
   }
}
