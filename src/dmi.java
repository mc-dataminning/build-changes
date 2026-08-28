import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dmi extends deu implements dmj {
   public static final dtc f = dtb.C;
   protected static final float g = 4.0F;
   protected static final exa h = dfi.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dty a;

   protected dmi(dty $$0, dsk.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmi> a();

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return h;
   }

   @Override
   public boolean a(dsl $$0) {
      return true;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drb($$0, $$1);
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.c_($$3) instanceof drb $$7) {
         cvf $$10 = $$0.g() instanceof cvf $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gm();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avr.c.b($$0.g()));
                  $$2.a(dxh.c, $$7.az_(), dxh.a.a($$4, $$7.n()));
                  $$0.a(1, $$4);
                  return bqj.a;
               } else {
                  return bqj.d;
               }
            } else {
               return bqj.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqj.b : bqj.a;
         }
      } else {
         return bqj.e;
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.c_($$2) instanceof drb $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.az_(), $$5.d(), avi.e);
            return bqh.a;
         } else if ($$8) {
            return bqh.a;
         } else if (!this.a($$3, $$5) && $$3.gm() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqh.a;
         } else {
            return bqh.e;
         }
      } else {
         return bqh.e;
      }
   }

   private boolean b(cml $$0, drb $$1, boolean $$2) {
      drc $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Z())).allMatch($$0x -> $$0x.equals(wt.a) || $$0x.b() instanceof yb);
   }

   public abstract float g(dsl var1);

   public ewh m(dsl $$0) {
      return new ewh(0.5, 0.5, 0.5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(f) ? eok.c.a(false) : super.b_($$0);
   }

   public dty d() {
      return this.a;
   }

   public static dty a(dfi $$0) {
      dty $$1;
      if ($$0 instanceof dmi) {
         $$1 = ((dmi)$$0).d();
      } else {
         $$1 = dty.b;
      }

      return $$1;
   }

   public void a(cml $$0, drb $$1, boolean $$2) {
      $$1.a($$0.cB());
      $$0.a($$1, $$2);
   }

   private boolean a(cml $$0, drb $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cB());
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.h, drb::a);
   }
}
