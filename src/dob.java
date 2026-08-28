import com.mojang.serialization.MapCodec;

public class dob extends dqv implements doa {
   public static final MapCodec<dob> c = b(dob::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dob> a() {
      return c;
   }

   public dob(ebd.d $$0) {
      super($$0, jb.a, q_, false, 0.1);
      this.l(this.C.b().b(e, Integer.valueOf(0)).b(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azx $$0) {
      return 1;
   }

   @Override
   protected boolean h(ebe $$0) {
      return $$0.l();
   }

   @Override
   protected dnc b() {
      return dne.te;
   }

   @Override
   protected ebe a(ebe $$0, ebe $$1) {
      return $$1.b(r_, $$0.c(r_));
   }

   @Override
   protected ebe a(ebe $$0, azx $$1) {
      return super.a($$0, $$1).b(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dac.xH);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      return doa.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      $$0.a($$2, $$3.b(r_, Boolean.valueOf(true)), 2);
   }
}
