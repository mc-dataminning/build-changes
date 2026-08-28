import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class drp extends djy implements drq {
   public static final dym f = dyl.D;
   protected static final float g = 4.0F;
   protected static final fcs h = dkm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dzh a;

   protected drp(dzh $$0, dxu.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends drp> a();

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return h;
   }

   @Override
   public boolean a(dxv $$0) {
      return true;
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwk($$0, $$1);
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$2.c_($$3) instanceof dwk $$7) {
         cyt $$10 = $$0.h() instanceof cyt $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(axp.c.b($$0.h()));
                  $$2.a(ecr.c, $$7.aB_(), ecr.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return btj.a;
               } else {
                  return btj.f;
               }
            } else {
               return btj.f;
            }
         } else {
            return !$$11 && !$$7.v() ? btj.c : btj.a;
         }
      } else {
         return btj.e;
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1.c_($$2) instanceof dwk $$5) {
         if ($$1.C) {
            ae.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aB_(), $$5.d(), axg.e);
            return btj.b;
         } else if ($$8) {
            return btj.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return btj.b;
         } else {
            return btj.e;
         }
      } else {
         return btj.e;
      }
   }

   private boolean b(cpx $$0, dwk $$1, boolean $$2) {
      dwl $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(xu.a) || $$0x.b() instanceof zc);
   }

   public abstract float h(dxv var1);

   public fby o(dxv $$0) {
      return new fby(0.5, 0.5, 0.5);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(f) ? ety.c.a(false) : super.b_($$0);
   }

   public dzh d() {
      return this.a;
   }

   public static dzh a(dkm $$0) {
      dzh $$1;
      if ($$0 instanceof drp) {
         $$1 = ((drp)$$0).d();
      } else {
         $$1 = dzh.b;
      }

      return $$1;
   }

   public void a(cpx $$0, dwk $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cpx $$0, dwk $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.h, dwk::a);
   }
}
