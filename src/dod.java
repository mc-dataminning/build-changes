import com.mojang.serialization.MapCodec;

public class dod extends dqx implements doc {
   public static final MapCodec<dod> c = b(dod::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dod> a() {
      return c;
   }

   public dod(ebf.d $$0) {
      super($$0, jc.a, q_, false, 0.1);
      this.l(this.C.b().b(e, Integer.valueOf(0)).b(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azz $$0) {
      return 1;
   }

   @Override
   protected boolean h(ebg $$0) {
      return $$0.l();
   }

   @Override
   protected dne b() {
      return dng.te;
   }

   @Override
   protected ebg a(ebg $$0, ebg $$1) {
      return $$1.b(r_, $$0.c(r_));
   }

   @Override
   protected ebg a(ebg $$0, azz $$1) {
      return super.a($$0, $$1).b(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(dae.xH);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      return doc.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      $$0.a($$2, $$3.b(r_, Boolean.valueOf(true)), 2);
   }
}
