import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtd extends dnc implements dnk {
   public static final MapCodec<dtd> a = b(dtd::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fgk f = fgh.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(ebe $$0, ebe $$1, jb $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (!($$3 instanceof bxu) || $$3.dw().a(this)) {
         $$3.a($$0, new ffq(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azx $$5 = $$1.G_();
            boolean $$6 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$6 && $$5.h()) {
               $$1.a(
                  ly.aN,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azo.b($$5, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azo.b($$5, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      iv $$7 = $$2.j();
      $$4.a(bxn.d, $$2x -> {
         if ($$1 instanceof ars $$3x && $$2x.bX() && ($$3x.O().c(djt.d) || $$2x instanceof crx) && $$2x.c($$3x, $$7)) {
            $$1.b($$7, false);
         }
      });
      $$4.a(bxn.a);
      $$4.a(bxn.d);
   }

   @Override
   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bxu $$5) {
         bxu.a $$7 = $$5.eO();
         awo $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, bwt $$3) {
      fgk $$4 = this.b($$0, $$1, $$2, ffv.a($$3));
      return $$4.c() ? fgh.b() : $$4;
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      if (!$$3.c() && $$3 instanceof fga $$4) {
         bwt $$5 = $$4.d();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cob;
            if ($$6 || a($$5) && $$3.a(fgh.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fgh.a();
   }

   @Override
   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.a();
   }

   public static boolean a(bwt $$0) {
      if ($$0.an().a(axh.h)) {
         return true;
      } else {
         return $$0 instanceof bxu ? ((bxu)$$0).a(bxd.c).a(dac.qp) : false;
      }
   }

   @Override
   public czy a(@Nullable bxu $$0, djy $$1, iv $$2, ebe $$3) {
      $$1.a($$2, dne.a.m(), 11);
      if (!$$1.A_()) {
         $$1.c(2001, $$2, dnc.j($$3));
      }

      return new czy(dac.rr);
   }

   @Override
   public Optional<awo> at_() {
      return Optional.of(awp.dn);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return true;
   }
}
