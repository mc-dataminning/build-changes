import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dlz extends del implements dma {
   public static final dst f = dss.C;
   protected static final float g = 4.0F;
   protected static final ewk h = dez.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dtp a;

   protected dlz(dtp $$0, dsb.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dlz> a();

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return h;
   }

   @Override
   public boolean a(dsc $$0) {
      return true;
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqr($$0, $$1);
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.c_($$3) instanceof dqr $$7) {
         cvr $$10 = $$0.g() instanceof cvr $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awk.c.b($$0.g()));
                  $$2.a(dwv.c, $$7.ay_(), dwv.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqw.a;
               } else {
                  return bqw.d;
               }
            } else {
               return bqw.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqw.b : bqw.a;
         }
      } else {
         return bqw.e;
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.c_($$2) instanceof dqr $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.ay_(), $$5.d(), awb.e);
            return bqu.a;
         } else if ($$8) {
            return bqu.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqu.a;
         } else {
            return bqu.e;
         }
      } else {
         return bqu.e;
      }
   }

   private boolean b(cmx $$0, dqr $$1, boolean $$2) {
      dqs $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(xo.a) || $$0x.b() instanceof yw);
   }

   public abstract float g(dsc var1);

   public evr m(dsc $$0) {
      return new evr(0.5, 0.5, 0.5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(f) ? enw.c.a(false) : super.b_($$0);
   }

   public dtp d() {
      return this.a;
   }

   public static dtp a(dez $$0) {
      dtp $$1;
      if ($$0 instanceof dlz) {
         $$1 = ((dlz)$$0).d();
      } else {
         $$1 = dtp.b;
      }

      return $$1;
   }

   public void a(cmx $$0, dqr $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cmx $$0, dqr $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.h, dqr::a);
   }
}
