import com.mojang.serialization.MapCodec;

public class dmr extends dhj implements dhm {
   public static final MapCodec<dmr> a = b(dmr::new);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(dun.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (je $$3 : je.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awt.aM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (je $$6 : je.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         duo $$7 = $$0.a_($$6);
         if ($$7.a(dhl.on)) {
            $$5 = true;
         }

         if ($$7.a(dhl.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dhl.on.o() : dhl.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dhl.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dhl.ow.o(), 3);
      }
   }

   @Override
   public dhm.a ar_() {
      return dhm.a.a;
   }
}
