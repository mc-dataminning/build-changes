import com.mojang.serialization.MapCodec;

public class dlc extends dfc {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final dtt b = dts.p;
   protected static final exn c = dfc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$3.gz()) {
         if ($$1.C) {
            return bqa.a;
         } else {
            dtc $$5 = $$0.a(b);
            $$1.a($$2, $$5, 3);
            $$1.a(dxv.c, $$2, dxv.a.a($$3, $$5));
            return bqa.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$3 instanceof bso $$4 && $$0.c(b) && $$1 instanceof aqt $$5) {
         $$4.a($$1.aj().q(), 0.5F);

         for (float $$6 = 0.2F; $$6 < 0.8F; $$6 += 0.1F) {
            $$5.a(lb.aU, (double)((float)$$2.u() + $$6), (double)$$2.v() + 0.35, (double)((float)$$2.w() + $$6), 1, 0.05, 0.05, 0.05, 0.1);
         }

         $$5.a(null, $$2, avo.Es, avq.e, 0.5F, 2.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
