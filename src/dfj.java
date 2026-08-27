import com.mojang.serialization.MapCodec;

public class dfj extends dac implements daf {
   public static final MapCodec<dfj> a = b(dfj::new);

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   public dfj(dna.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      if (!$$0.a_($$1.c()).a((cwh)$$0, $$1)) {
         return false;
      } else {
         for (ib $$3 : ib.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(aun.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ib $$6 : ib.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dnb $$7 = $$0.a_($$6);
         if ($$7.a(dae.on)) {
            $$5 = true;
         }

         if ($$7.a(dae.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dae.on.o() : dae.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dae.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dae.ow.o(), 3);
      }
   }

   @Override
   public daf.a at_() {
      return daf.a.a;
   }
}
