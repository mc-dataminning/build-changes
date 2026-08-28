import com.mojang.serialization.MapCodec;

public class don extends drh implements dom {
   public static final MapCodec<don> c = b(don::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<don> a() {
      return c;
   }

   public don(ebp.d $$0) {
      super($$0, jc.a, q_, false, 0.1);
      this.l(this.C.b().b(e, Integer.valueOf(0)).b(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(bai $$0) {
      return 1;
   }

   @Override
   protected boolean h(ebq $$0) {
      return $$0.l();
   }

   @Override
   protected dno b() {
      return dnq.te;
   }

   @Override
   protected ebq a(ebq $$0, ebq $$1) {
      return $$1.b(r_, $$0.c(r_));
   }

   @Override
   protected ebq a(ebq $$0, bai $$1) {
      return super.a($$0, $$1).b(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(dao.xH);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      return dom.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      $$0.a($$2, $$3.b(r_, Boolean.valueOf(true)), 2);
   }
}
