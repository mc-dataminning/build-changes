import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class don extends dgy implements doo {
   public static final dvj f = dvi.C;
   protected static final float g = 4.0F;
   protected static final ezq h = dhm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dwf a;

   protected don(dwf $$0, dur.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends don> a();

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return h;
   }

   @Override
   public boolean a(dus $$0) {
      return true;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dth($$0, $$1);
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$2.c_($$3) instanceof dth $$7) {
         cww $$10 = $$0.h() instanceof cww $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gp();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awq.c.b($$0.h()));
                  $$2.a(dzp.c, $$7.aC_(), dzp.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return brs.a;
               } else {
                  return brs.f;
               }
            } else {
               return brs.f;
            }
         } else {
            return !$$11 && !$$7.v() ? brs.c : brs.a;
         }
      } else {
         return brs.e;
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$1.c_($$2) instanceof dth $$5) {
         if ($$1.B) {
            ad.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aC_(), $$5.d(), awh.e);
            return brs.b;
         } else if ($$8) {
            return brs.b;
         } else if (!this.a($$3, $$5) && $$3.gp() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return brs.b;
         } else {
            return brs.e;
         }
      } else {
         return brs.e;
      }
   }

   private boolean b(cnx $$0, dth $$1, boolean $$2) {
      dti $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.ab())).allMatch($$0x -> $$0x.equals(xd.a) || $$0x.b() instanceof yl);
   }

   public abstract float h(dus var1);

   public eyw o(dus $$0) {
      return new eyw(0.5, 0.5, 0.5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(f) ? equ.c.a(false) : super.b_($$0);
   }

   public dwf d() {
      return this.a;
   }

   public static dwf a(dhm $$0) {
      dwf $$1;
      if ($$0 instanceof don) {
         $$1 = ((don)$$0).d();
      } else {
         $$1 = dwf.b;
      }

      return $$1;
   }

   public void a(cnx $$0, dth $$1, boolean $$2) {
      $$1.a($$0.cD());
      $$0.a($$1, $$2);
   }

   private boolean a(cnx $$0, dth $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cD());
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.h, dth::a);
   }
}
