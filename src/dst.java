import com.mojang.serialization.MapCodec;

public class dst extends dne implements dnh {
   public static final MapCodec<dst> a = b(dst::new);

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   public dst(ebf.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (iw $$3 : iw.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axg.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iw $$6 : iw.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         ebg $$7 = $$0.a_($$6);
         if ($$7.a(dng.oT)) {
            $$5 = true;
         }

         if ($$7.a(dng.pc)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dng.oT.m() : dng.pc.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dng.oT.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dng.pc.m(), 3);
      }
   }

   @Override
   public dnh.a ar_() {
      return dnh.a.a;
   }
}
