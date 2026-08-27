import com.mojang.serialization.MapCodec;

public class ddx extends czf {
   public static final MapCodec<ddx> a = b(ddx::new);
   private static final int b = 20;

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public ddx(dmd.d $$0) {
      super($$0);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, bof $$3) {
      if (!$$3.bQ() && $$3 instanceof box && !cua.j((box)$$3)) {
         $$3.a($$0.ah().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      czl.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(czh.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
