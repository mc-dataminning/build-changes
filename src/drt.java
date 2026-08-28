import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class drt extends dlu implements dmc {
   public static final MapCodec<drt> a = b(drt::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final feq f = fen.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   public drt(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dzo $$0, dzo $$1, ja $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!($$3 instanceof bwz) || $$3.dw().a(this)) {
         $$3.a($$0, new fdw(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azt $$4 = $$1.C_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lx.aN,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azk.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azk.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if ($$1 instanceof aro $$6 && $$3.bY() && ($$6.O().c(dil.c) || $$3 instanceof cqs) && $$3.c($$6, $$2)) {
         $$1.b($$2, false);
      }
   }

   @Override
   public void a(dip $$0, dzo $$1, iu $$2, bwa $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bwz $$5) {
         bwz.a $$7 = $$5.eN();
         awk $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, bwa $$3) {
      feq $$4 = this.b($$0, $$1, $$2, feb.a($$3));
      return $$4.c() ? fen.b() : $$4;
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      if ($$3 instanceof feg $$4) {
         bwa $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cmw;
            if ($$6 || a($$5) && $$3.a(fen.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fen.a();
   }

   @Override
   protected feq c(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.a();
   }

   public static boolean a(bwa $$0) {
      if ($$0.aq().a(axd.h)) {
         return true;
      } else {
         return $$0 instanceof bwz ? ((bwz)$$0).a(bwk.c).a(cyw.qk) : false;
      }
   }

   @Override
   public cys a(@Nullable bwz $$0, diq $$1, iu $$2, dzo $$3) {
      $$1.a($$2, dlw.a.m(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dlu.j($$3));
      }

      return new cys(cyw.rm);
   }

   @Override
   public Optional<awk> ao_() {
      return Optional.of(awl.dn);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return true;
   }
}
