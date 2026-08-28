import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmh extends dma implements dmi {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final eaq b = eap.h;
   private static final int c = 5;

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      dzz $$4 = $$1.a_($$2.d());
      boolean $$5 = $$4.g($$1, $$2).c() && $$4.y().c();
      if ($$5) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected ewg b_(dzz $$0) {
      return ewh.c.a(false);
   }

   public static void b(diw $$0, iu $$1, dzz $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(diw $$0, iu $$1, dzz $$2, dzz $$3) {
      if (o($$2)) {
         dzz $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         iu.a $$5 = $$1.k().c(ja.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ja.b);
         }
      }
   }

   private static boolean o(dzz $$0) {
      return $$0.a(dmc.nG) || $$0.a(dmc.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dzz q(dzz $$0) {
      if ($$0.a(dmc.nG)) {
         return $$0;
      } else if ($$0.a(dmc.ek)) {
         return dmc.nG.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dmc.lm) ? dmc.nG.m().b(b, Boolean.valueOf(true)) : dmc.J.m();
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lx.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.da, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lx.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lx.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.cY, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      $$2.a($$3, ewh.c, ewh.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == ja.a || $$4 == ja.b && !$$6.a(dmc.nG) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.e());
      return $$3.a(dmc.nG) || $$3.a(dmc.lm) || $$3.a(dmc.ek);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.a();
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   public cyy a(@Nullable bxc $$0, diw $$1, iu $$2, dzz $$3) {
      $$1.a($$2, dmc.a.m(), 11);
      return new cyy(czc.rm);
   }

   @Override
   public Optional<awm> ao_() {
      return ewh.c.j();
   }
}
