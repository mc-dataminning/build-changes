import com.mojang.serialization.MapCodec;

public class dkt extends dfc {
   private static final exn b = dfc.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn c = dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final exn d = dfc.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final exn e = exk.a(b, d, c);
   public static final MapCodec<dkt> a = b(dkt::new);

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return e;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2) {
      return e;
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$0.a(cuk.vT) && $$2.a_($$3.c()).r() && $$2 instanceof aqt $$7 && $$2.E_().j()) {
         $$2.a($$3.c(), dfe.eS.n(), 3);
         $$0.a(1, $$4);
         $$7.a(lb.aU, (double)$$3.u() + 0.5, (double)$$3.v() + 1.5, (double)$$3.w() + 0.5, 100, 0.5, 0.5, 0.5, 0.2);
         $$7.a(null, $$3, avo.hP, avq.e, 1.0F, 1.0F);
         if (!$$4.d("portal_opened")) {
            $$4.c("portal_opened");
         }

         return bqc.a;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }
}
