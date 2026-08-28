import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dpe extends dhq implements dpf {
   public static final dwa f = dvz.C;
   protected static final float g = 4.0F;
   protected static final fah h = die.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dww a;

   protected dpe(dww $$0, dvi.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dpe> a();

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return h;
   }

   @Override
   public boolean a(dvj $$0) {
      return true;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dty($$0, $$1);
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$2.c_($$3) instanceof dty $$7) {
         cxf $$10 = $$0.h() instanceof cxf $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gw();
         if (!$$2.C) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awv.c.b($$0.h()));
                  $$2.a(eag.c, $$7.aB_(), eag.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bsd.a;
               } else {
                  return bsd.f;
               }
            } else {
               return bsd.f;
            }
         } else {
            return !$$11 && !$$7.v() ? bsd.c : bsd.a;
         }
      } else {
         return bsd.e;
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$1.c_($$2) instanceof dty $$5) {
         if ($$1.C) {
            ae.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aB_(), $$5.d(), awm.e);
            return bsd.b;
         } else if ($$8) {
            return bsd.b;
         } else if (!this.a($$3, $$5) && $$3.gw() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bsd.b;
         } else {
            return bsd.e;
         }
      } else {
         return bsd.e;
      }
   }

   private boolean b(com $$0, dty $$1, boolean $$2) {
      dtz $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.ab())).allMatch($$0x -> $$0x.equals(xh.a) || $$0x.b() instanceof yp);
   }

   public abstract float h(dvj var1);

   public ezn o(dvj $$0) {
      return new ezn(0.5, 0.5, 0.5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(f) ? erl.c.a(false) : super.b_($$0);
   }

   public dww d() {
      return this.a;
   }

   public static dww a(die $$0) {
      dww $$1;
      if ($$0 instanceof dpe) {
         $$1 = ((dpe)$$0).d();
      } else {
         $$1 = dww.b;
      }

      return $$1;
   }

   public void a(com $$0, dty $$1, boolean $$2) {
      $$1.a($$0.cH());
      $$0.a($$1, $$2);
   }

   private boolean a(com $$0, dty $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cH());
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.h, dty::a);
   }
}
