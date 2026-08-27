import com.mojang.serialization.MapCodec;

public class djg extends ddy implements deb {
   public static final MapCodec<djg> a = b(djg::new);

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dra.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      if (!$$0.a_($$1.c()).a((dad)$$0, $$1)) {
         return false;
      } else {
         for (io $$3 : io.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(avw.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (io $$6 : io.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         drb $$7 = $$0.a_($$6);
         if ($$7.a(dea.on)) {
            $$5 = true;
         }

         if ($$7.a(dea.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dea.on.n() : dea.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dea.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dea.ow.n(), 3);
      }
   }

   @Override
   public deb.a aq_() {
      return deb.a.a;
   }
}
