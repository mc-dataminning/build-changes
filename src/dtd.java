import com.mojang.serialization.MapCodec;

public class dtd extends dno implements dnr {
   public static final MapCodec<dtd> a = b(dtd::new);

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(ebp.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (iw $$3 : iw.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axn.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iw $$6 : iw.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         ebq $$7 = $$0.a_($$6);
         if ($$7.a(dnq.oT)) {
            $$5 = true;
         }

         if ($$7.a(dnq.pc)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dnq.oT.m() : dnq.pc.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dnq.oT.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dnq.pc.m(), 3);
      }
   }

   @Override
   public dnr.a as_() {
      return dnr.a.a;
   }
}
