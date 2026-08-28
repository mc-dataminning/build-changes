import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtf extends dne implements dnm {
   public static final MapCodec<dtf> a = b(dtf::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fgm f = fgj.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   public dtf(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(ebg $$0, ebg $$1, jc $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (!($$3 instanceof bxw) || $$3.dw().a(this)) {
         $$3.a($$0, new ffs(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azz $$5 = $$1.G_();
            boolean $$6 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$6 && $$5.h()) {
               $$1.a(
                  lz.aN,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azq.b($$5, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azq.b($$5, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      iw $$7 = $$2.j();
      $$4.a(bxp.d, $$2x -> {
         if ($$1 instanceof aru $$3x && $$2x.bX() && ($$3x.O().c(djv.d) || $$2x instanceof crz) && $$2x.c($$3x, $$7)) {
            $$1.b($$7, false);
         }
      });
      $$4.a(bxp.a);
      $$4.a(bxp.d);
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bxw $$5) {
         bxw.a $$7 = $$5.eO();
         awq $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, bwv $$3) {
      fgm $$4 = this.b($$0, $$1, $$2, ffx.a($$3));
      return $$4.c() ? fgj.b() : $$4;
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      if (!$$3.c() && $$3 instanceof fgc $$4) {
         bwv $$5 = $$4.d();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cod;
            if ($$6 || a($$5) && $$3.a(fgj.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fgj.a();
   }

   @Override
   protected fgm c(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return fgj.a();
   }

   public static boolean a(bwv $$0) {
      if ($$0.an().a(axj.h)) {
         return true;
      } else {
         return $$0 instanceof bxw ? ((bxw)$$0).a(bxf.c).a(dae.qp) : false;
      }
   }

   @Override
   public daa a(@Nullable bxw $$0, dka $$1, iw $$2, ebg $$3) {
      $$1.a($$2, dng.a.m(), 11);
      if (!$$1.A_()) {
         $$1.c(2001, $$2, dne.j($$3));
      }

      return new daa(dae.rr);
   }

   @Override
   public Optional<awq> at_() {
      return Optional.of(awr.dn);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return true;
   }
}
