import com.mojang.serialization.MapCodec;

public abstract class dlx extends dne {
   protected static final int a = 4;
   private static final fgm c = dne.b(12.0, 4.0, 16.0);
   private static final fgm d = ag.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fgj.a(fgj.b(), fgj.a(dne.a(16.0, 8.0, 0.0, 3.0), dne.a(8.0, 16.0, 0.0, 3.0), dne.b(12.0, 0.0, 3.0), c), ffw.e);
   });
   protected final kd.a b;

   @Override
   protected abstract MapCodec<? extends dlx> a();

   public dlx(ebf.d $$0, kd.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(ebg $$0) {
      return 0.0;
   }

   protected boolean a(ebg $$0, iw $$1, bwv $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      kd $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2) {
      return c;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   public abstract boolean d(ebg var1);

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      iw $$4 = dtc.a((djz)$$1, $$2);
      if ($$4 != null) {
         exp $$5 = dtc.a($$1, $$4);
         if ($$5 != exr.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(exp $$0) {
      return false;
   }

   protected void a(ebg $$0, djz $$1, iw $$2, exp $$3) {
   }
}
