import com.mojang.serialization.MapCodec;

public class dnf extends dhy implements dib {
   public static final MapCodec<dnf> a = b(dnf::new);

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   public dnf(dvc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jg $$3 : jg.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awz.aM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jg $$6 : jg.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dvd $$7 = $$0.a_($$6);
         if ($$7.a(dia.on)) {
            $$5 = true;
         }

         if ($$7.a(dia.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dia.on.m() : dia.ow.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dia.on.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dia.ow.m(), 3);
      }
   }

   @Override
   public dib.a as_() {
      return dib.a.a;
   }
}
