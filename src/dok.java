import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dok extends dgv implements dol {
   public static final dvf f = dve.C;
   protected static final float g = 4.0F;
   protected static final ezm h = dhj.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dwb a;

   protected dok(dwb $$0, dun.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dok> a();

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return h;
   }

   @Override
   public boolean a(duo $$0) {
      return true;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dte($$0, $$1);
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$2.c_($$3) instanceof dte $$7) {
         cwt $$10 = $$0.h() instanceof cwt $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awo.c.b($$0.h()));
                  $$2.a(dzl.c, $$7.aB_(), dzl.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return brp.a;
               } else {
                  return brp.f;
               }
            } else {
               return brp.f;
            }
         } else {
            return !$$11 && !$$7.v() ? brp.c : brp.a;
         }
      } else {
         return brp.e;
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$1.c_($$2) instanceof dte $$5) {
         if ($$1.B) {
            ad.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aB_(), $$5.d(), awf.e);
            return brp.b;
         } else if ($$8) {
            return brp.b;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return brp.b;
         } else {
            return brp.e;
         }
      } else {
         return brp.e;
      }
   }

   private boolean b(cnu $$0, dte $$1, boolean $$2) {
      dtf $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.ab())).allMatch($$0x -> $$0x.equals(xc.a) || $$0x.b() instanceof yk);
   }

   public abstract float h(duo var1);

   public eys o(duo $$0) {
      return new eys(0.5, 0.5, 0.5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(f) ? eqq.c.a(false) : super.b_($$0);
   }

   public dwb d() {
      return this.a;
   }

   public static dwb a(dhj $$0) {
      dwb $$1;
      if ($$0 instanceof dok) {
         $$1 = ((dok)$$0).d();
      } else {
         $$1 = dwb.b;
      }

      return $$1;
   }

   public void a(cnu $$0, dte $$1, boolean $$2) {
      $$1.a($$0.cD());
      $$0.a($$1, $$2);
   }

   private boolean a(cnu $$0, dte $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cD());
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.h, dte::a);
   }
}
