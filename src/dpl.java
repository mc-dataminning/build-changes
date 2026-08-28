import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpl extends djm implements dju {
   public static final MapCodec<dpl> a = b(dpl::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fbu f = fbr.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   public dpl(dww.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dwx $$0, dwx $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      if (!($$3 instanceof bvh) || $$3.dw().a(this)) {
         $$3.a($$0, new fba(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azh $$4 = $$1.H_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lt.aM,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof ard $$6) {
         if ($$3.bY() && ($$6.O().b(dge.c) || $$3 instanceof cox) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dgi $$0, dwx $$1, ji $$2, bul $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bvh $$5) {
         bvh.a $$7 = $$5.eM();
         avz $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if ($$3 instanceof fbk $$4) {
         bul $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof clb;
            if ($$6 || a($$5) && $$3.a(fbr.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fbr.a();
   }

   @Override
   protected fbu c(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return fbr.a();
   }

   public static boolean a(bul $$0) {
      if ($$0.aq().a(awt.h)) {
         return true;
      } else {
         return $$0 instanceof bvh ? ((bvh)$$0).a(but.c).a(cwt.qg) : false;
      }
   }

   @Override
   public cwp a(@Nullable cox $$0, dgj $$1, ji $$2, dwx $$3) {
      $$1.a($$2, djo.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, djm.j($$3));
      }

      return new cwp(cwt.ri);
   }

   @Override
   public Optional<avz> as_() {
      return Optional.of(awa.dn);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return true;
   }
}
