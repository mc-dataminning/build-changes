import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dlx extends dej implements dly {
   public static final dsr f = dsq.C;
   protected static final float g = 4.0F;
   protected static final ewi h = dex.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dtn a;

   protected dlx(dtn $$0, drz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dlx> a();

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return h;
   }

   @Override
   public boolean a(dsa $$0) {
      return true;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqp($$0, $$1);
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$2.c_($$3) instanceof dqp $$7) {
         cvp $$10 = $$0.g() instanceof cvp $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awj.c.b($$0.g()));
                  $$2.a(dwt.c, $$7.az_(), dwt.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqu.a;
               } else {
                  return bqu.d;
               }
            } else {
               return bqu.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqu.b : bqu.a;
         }
      } else {
         return bqu.e;
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.c_($$2) instanceof dqp $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.az_(), $$5.d(), awa.e);
            return bqs.a;
         } else if ($$8) {
            return bqs.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqs.a;
         } else {
            return bqs.e;
         }
      } else {
         return bqs.e;
      }
   }

   private boolean b(cmv $$0, dqp $$1, boolean $$2) {
      dqq $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(xn.a) || $$0x.b() instanceof yv);
   }

   public abstract float g(dsa var1);

   public evp m(dsa $$0) {
      return new evp(0.5, 0.5, 0.5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(f) ? enu.c.a(false) : super.b_($$0);
   }

   public dtn d() {
      return this.a;
   }

   public static dtn a(dex $$0) {
      dtn $$1;
      if ($$0 instanceof dlx) {
         $$1 = ((dlx)$$0).d();
      } else {
         $$1 = dtn.b;
      }

      return $$1;
   }

   public void a(cmv $$0, dqp $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cmv $$0, dqp $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.h, dqp::a);
   }
}
