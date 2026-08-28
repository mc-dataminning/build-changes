import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dly extends dek implements dlz {
   public static final dss f = dsr.C;
   protected static final float g = 4.0F;
   protected static final ewj h = dey.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dto a;

   protected dly(dto $$0, dsa.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dly> a();

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return h;
   }

   @Override
   public boolean a(dsb $$0) {
      return true;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqq($$0, $$1);
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$2.c_($$3) instanceof dqq $$7) {
         cvq $$10 = $$0.g() instanceof cvq $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awj.c.b($$0.g()));
                  $$2.a(dwu.c, $$7.ay_(), dwu.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqv.a;
               } else {
                  return bqv.d;
               }
            } else {
               return bqv.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqv.b : bqv.a;
         }
      } else {
         return bqv.e;
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.c_($$2) instanceof dqq $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.ay_(), $$5.d(), awa.e);
            return bqt.a;
         } else if ($$8) {
            return bqt.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqt.a;
         } else {
            return bqt.e;
         }
      } else {
         return bqt.e;
      }
   }

   private boolean b(cmw $$0, dqq $$1, boolean $$2) {
      dqr $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(xn.a) || $$0x.b() instanceof yv);
   }

   public abstract float g(dsb var1);

   public evq m(dsb $$0) {
      return new evq(0.5, 0.5, 0.5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(f) ? env.c.a(false) : super.b_($$0);
   }

   public dto d() {
      return this.a;
   }

   public static dto a(dey $$0) {
      dto $$1;
      if ($$0 instanceof dly) {
         $$1 = ((dly)$$0).d();
      } else {
         $$1 = dto.b;
      }

      return $$1;
   }

   public void a(cmw $$0, dqq $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cmw $$0, dqq $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.h, dqq::a);
   }
}
