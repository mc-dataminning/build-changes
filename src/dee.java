import com.mojang.serialization.MapCodec;

public class dee extends dfc implements dff {
   public static final MapCodec<dee> a = b(dee::new);
   protected static final float b = 4.0F;
   protected static final exn c = dfc.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      ewu $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.d()).a(awe.av);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfe.a.n();
      } else {
         if ($$1 == iw.b && $$2.a(dfe.nX)) {
            $$3.a($$4, dfe.nX.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(cuk.eZ);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dtc $$0, cly $$1, dbg $$2, ir $$3) {
      return $$1.fg().f() instanceof cwc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dca $$0, ir $$1) {
      $$0.a($$1.c(), dfe.nX.n().a(def.i, dto.b), 3);
   }
}
