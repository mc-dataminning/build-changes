import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsa extends dma implements dmi {
   public static final MapCodec<dsa> a = b(dsa::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ffc f = fez.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dzz $$0, dzz $$1, ja $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (!($$3 instanceof bxc) || $$3.dw().a(this)) {
         $$3.a($$0, new fei(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azv $$4 = $$1.C_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lx.aN,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azm.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azm.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if ($$1 instanceof arq $$6 && $$3.bY() && ($$6.O().c(dir.c) || $$3 instanceof cqy) && $$3.c($$6, $$2)) {
         $$1.b($$2, false);
      }
   }

   @Override
   public void a(div $$0, dzz $$1, iu $$2, bwd $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bxc $$5) {
         bxc.a $$7 = $$5.eN();
         awm $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, bwd $$3) {
      ffc $$4 = this.b($$0, $$1, $$2, fen.a($$3));
      return $$4.c() ? fez.b() : $$4;
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      if ($$3 instanceof fes $$4) {
         bwd $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cnc;
            if ($$6 || a($$5) && $$3.a(fez.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fez.a();
   }

   @Override
   protected ffc c(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.a();
   }

   public static boolean a(bwd $$0) {
      if ($$0.aq().a(axf.h)) {
         return true;
      } else {
         return $$0 instanceof bxc ? ((bxc)$$0).a(bwn.c).a(czc.qm) : false;
      }
   }

   @Override
   public cyy a(@Nullable bxc $$0, diw $$1, iu $$2, dzz $$3) {
      $$1.a($$2, dmc.a.m(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dma.j($$3));
      }

      return new cyy(czc.ro);
   }

   @Override
   public Optional<awm> ao_() {
      return Optional.of(awn.dn);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return true;
   }
}
