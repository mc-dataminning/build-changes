import com.mojang.serialization.MapCodec;

public class doo extends drg implements dom {
   public static final MapCodec<doo> c = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return c;
   }

   public doo(ebp.d $$0) {
      super($$0, jc.a, q_, false);
      this.l(this.C.b().b(r_, Boolean.valueOf(false)));
   }

   @Override
   protected drh c() {
      return (drh)dnq.td;
   }

   @Override
   protected ebq a(ebq $$0, ebq $$1) {
      return $$1.b(r_, $$0.c(r_));
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
