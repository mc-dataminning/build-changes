import com.mojang.serialization.MapCodec;

public class doi extends dgv {
   public static final MapCodec<doi> a = b(doi::new);
   protected static final eyx b = dgv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      return eyu.b();
   }

   @Override
   protected eyx c(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return eyu.b();
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      dhb.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.b && $$2.a(dgx.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   protected float c(dua $$0, dcx $$1, je $$2) {
      return 0.2F;
   }
}
