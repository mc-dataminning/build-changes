import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dlu extends deg implements dlv {
   public static final dso f = dsn.C;
   protected static final float g = 4.0F;
   protected static final ewf h = deu.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dtk a;

   protected dlu(dtk $$0, drw.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dlu> a();

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return h;
   }

   @Override
   public boolean a(drx $$0) {
      return true;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqm($$0, $$1);
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.c_($$3) instanceof dqm $$7) {
         cvm $$10 = $$0.g() instanceof cvm $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awg.c.b($$0.g()));
                  $$2.a(dwq.c, $$7.aA_(), dwq.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqr.a;
               } else {
                  return bqr.d;
               }
            } else {
               return bqr.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqr.b : bqr.a;
         }
      } else {
         return bqr.e;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.c_($$2) instanceof dqm $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aA_(), $$5.d(), avx.e);
            return bqp.a;
         } else if ($$8) {
            return bqp.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqp.a;
         } else {
            return bqp.e;
         }
      } else {
         return bqp.e;
      }
   }

   private boolean b(cms $$0, dqm $$1, boolean $$2) {
      dqn $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(xk.a) || $$0x.b() instanceof ys);
   }

   public abstract float g(drx var1);

   public evm m(drx $$0) {
      return new evm(0.5, 0.5, 0.5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(f) ? enr.c.a(false) : super.b_($$0);
   }

   public dtk d() {
      return this.a;
   }

   public static dtk a(deu $$0) {
      dtk $$1;
      if ($$0 instanceof dlu) {
         $$1 = ((dlu)$$0).d();
      } else {
         $$1 = dtk.b;
      }

      return $$1;
   }

   public void a(cms $$0, dqm $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cms $$0, dqm $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.h, dqm::a);
   }
}
