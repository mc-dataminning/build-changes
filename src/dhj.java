import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dhj extends dlp implements deb {
   public static final MapCodec<dhj> a = b(dhj::new);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(dra.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      io $$4 = $$2.c();
      drb $$5 = dea.bt.n();
      Optional<ix.c<egn>> $$6 = $$0.H_().d(lf.aI).b(sk.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         io $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         drb $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((deb)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ix<egn> $$12;
            if ($$1.a(8) == 0) {
               List<dzk<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eco)$$11.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$12 = $$6.get();
            }

            $$12.a().a($$0, $$0.l().g(), $$1, $$8);
         }
      }
   }

   @Override
   public deb.a aq_() {
      return deb.a.a;
   }
}
