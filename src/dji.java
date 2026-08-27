import com.mojang.serialization.MapCodec;

public class dji extends dea implements ded {
   public static final MapCodec<dji> a = b(dji::new);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(drc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      if (!$$0.a_($$1.c()).a((daf)$$0, $$1)) {
         return false;
      } else {
         for (io $$3 : io.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(avx.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (io $$6 : io.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         drd $$7 = $$0.a_($$6);
         if ($$7.a(dec.on)) {
            $$5 = true;
         }

         if ($$7.a(dec.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dec.on.n() : dec.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dec.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dec.ow.n(), 3);
      }
   }

   @Override
   public ded.a ar_() {
      return ded.a.a;
   }
}
