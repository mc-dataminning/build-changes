import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dma extends dem implements dmb {
   public static final dsu f = dst.C;
   protected static final float g = 4.0F;
   protected static final ewl h = dfa.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dtq a;

   protected dma(dtq $$0, dsc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dma> a();

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return h;
   }

   @Override
   public boolean a(dsd $$0) {
      return true;
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqs($$0, $$1);
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.c_($$3) instanceof dqs $$7) {
         cvs $$10 = $$0.g() instanceof cvs $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awk.c.b($$0.g()));
                  $$2.a(dww.c, $$7.ay_(), dww.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqx.a;
               } else {
                  return bqx.d;
               }
            } else {
               return bqx.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqx.b : bqx.a;
         }
      } else {
         return bqx.e;
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.c_($$2) instanceof dqs $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.ay_(), $$5.d(), awb.e);
            return bqv.a;
         } else if ($$8) {
            return bqv.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqv.a;
         } else {
            return bqv.e;
         }
      } else {
         return bqv.e;
      }
   }

   private boolean b(cmy $$0, dqs $$1, boolean $$2) {
      dqt $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(xo.a) || $$0x.b() instanceof yw);
   }

   public abstract float g(dsd var1);

   public evs m(dsd $$0) {
      return new evs(0.5, 0.5, 0.5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(f) ? enx.c.a(false) : super.b_($$0);
   }

   public dtq d() {
      return this.a;
   }

   public static dtq a(dfa $$0) {
      dtq $$1;
      if ($$0 instanceof dma) {
         $$1 = ((dma)$$0).d();
      } else {
         $$1 = dtq.b;
      }

      return $$1;
   }

   public void a(cmy $$0, dqs $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cmy $$0, dqs $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.h, dqs::a);
   }
}
