import com.mojang.serialization.MapCodec;

public class dgz extends dch {
   public static final MapCodec<dgz> a = b(dgz::new);
   private static final int b = 20;

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgz(dph.d $$0) {
      super($$0);
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqa $$3) {
      if (!$$3.bT() && $$3 instanceof bqt && !cxa.j((bqt)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      dcn.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.b && $$2.a(dcj.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
