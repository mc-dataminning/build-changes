import com.mojang.serialization.MapCodec;

public class dhs extends dkk implements dhr {
   public static final MapCodec<dhs> c = b(dhs::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dhs> a() {
      return c;
   }

   public dhs(dtz.d $$0) {
      super($$0, jj.a, u_, false, 0.1);
      this.l(this.E.b().b(e, Integer.valueOf(0)).b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azk $$0) {
      return 1;
   }

   @Override
   protected boolean h(dua $$0) {
      return $$0.l();
   }

   @Override
   protected dgv b() {
      return dgx.sw;
   }

   @Override
   protected dua a(dua $$0, dua $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   protected dua a(dua $$0, azk $$1) {
      return super.a($$0, $$1).b(v_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(cvo.wy);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      return dhr.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      super.a($$0);
      $$0.a(v_);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return !$$2.c(v_);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      $$0.a($$2, $$3.b(v_, Boolean.valueOf(true)), 2);
   }
}
