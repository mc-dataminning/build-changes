import com.mojang.serialization.MapCodec;

public class dro extends dma implements dmd {
   public static final MapCodec<dro> a = b(dro::new);

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   public dro(dzy.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (iu $$3 : iu.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axc.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iu $$6 : iu.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dzz $$7 = $$0.a_($$6);
         if ($$7.a(dmc.oQ)) {
            $$5 = true;
         }

         if ($$7.a(dmc.oZ)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dmc.oQ.m() : dmc.oZ.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dmc.oQ.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dmc.oZ.m(), 3);
      }
   }

   @Override
   public dmd.a am_() {
      return dmd.a.a;
   }
}
