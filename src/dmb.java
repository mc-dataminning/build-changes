import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dmb extends den implements dmc {
   public static final dsv f = dsu.C;
   protected static final float g = 4.0F;
   protected static final ewm h = dfb.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dtr a;

   protected dmb(dtr $$0, dsd.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmb> a();

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return h;
   }

   @Override
   public boolean a(dse $$0) {
      return true;
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqt($$0, $$1);
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$2.c_($$3) instanceof dqt $$7) {
         cvt $$10 = $$0.g() instanceof cvt $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awk.c.b($$0.g()));
                  $$2.a(dwx.c, $$7.ay_(), dwx.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqy.a;
               } else {
                  return bqy.d;
               }
            } else {
               return bqy.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqy.b : bqy.a;
         }
      } else {
         return bqy.e;
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.c_($$2) instanceof dqt $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.ay_(), $$5.d(), awb.e);
            return bqw.a;
         } else if ($$8) {
            return bqw.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqw.a;
         } else {
            return bqw.e;
         }
      } else {
         return bqw.e;
      }
   }

   private boolean b(cmz $$0, dqt $$1, boolean $$2) {
      dqu $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(xo.a) || $$0x.b() instanceof yw);
   }

   public abstract float g(dse var1);

   public evt m(dse $$0) {
      return new evt(0.5, 0.5, 0.5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(f) ? eny.c.a(false) : super.b_($$0);
   }

   public dtr d() {
      return this.a;
   }

   public static dtr a(dfb $$0) {
      dtr $$1;
      if ($$0 instanceof dmb) {
         $$1 = ((dmb)$$0).d();
      } else {
         $$1 = dtr.b;
      }

      return $$1;
   }

   public void a(cmz $$0, dqt $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cmz $$0, dqt $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.h, dqt::a);
   }
}
