import com.mojang.serialization.MapCodec;

public class dlo extends dgv {
   public static final MapCodec<dlo> a = b(dlo::new);
   private static final int b = 20;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dtz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, btj $$3) {
      if (!$$3.cb() && $$3 instanceof buf) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
