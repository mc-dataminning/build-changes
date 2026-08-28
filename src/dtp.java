import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtp extends dno implements dnw {
   public static final MapCodec<dtp> a = b(dtp::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fgw f = fgt.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dtp> a() {
      return a;
   }

   public dtp(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(ebq $$0, ebq $$1, jc $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (!($$3 instanceof byf) || $$3.dw().a(this)) {
         $$3.a($$0, new fgc(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            bai $$5 = $$1.G_();
            boolean $$6 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$6 && $$5.h()) {
               $$1.a(
                  lz.aN,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azz.b($$5, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azz.b($$5, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      iw $$7 = $$2.j();
      $$4.a(bxy.d, $$2x -> {
         if ($$1 instanceof asb $$3x && $$2x.bX() && ($$3x.O().c(dkf.d) || $$2x instanceof csi) && $$2x.c($$3x, $$7)) {
            $$1.b($$7, false);
         }
      });
      $$4.a(bxy.a);
      $$4.a(bxy.d);
   }

   @Override
   public void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof byf $$5) {
         byf.a $$7 = $$5.eO();
         awx $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, bxe $$3) {
      fgw $$4 = this.b($$0, $$1, $$2, fgh.a($$3));
      return $$4.c() ? fgt.b() : $$4;
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      if (!$$3.c() && $$3 instanceof fgm $$4) {
         bxe $$5 = $$4.d();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof com;
            if ($$6 || a($$5) && $$3.a(fgt.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fgt.a();
   }

   @Override
   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.a();
   }

   public static boolean a(bxe $$0) {
      if ($$0.an().a(axq.h)) {
         return true;
      } else {
         return $$0 instanceof byf ? ((byf)$$0).a(bxo.c).a(dao.qp) : false;
      }
   }

   @Override
   public dak a(@Nullable byf $$0, dkk $$1, iw $$2, ebq $$3) {
      $$1.a($$2, dnq.a.m(), 11);
      if (!$$1.A_()) {
         $$1.c(2001, $$2, dno.j($$3));
      }

      return new dak(dao.rr);
   }

   @Override
   public Optional<awx> au_() {
      return Optional.of(awy.dn);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return true;
   }
}
