import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dmf extends der implements dmg {
   public static final dsy f = dsx.C;
   protected static final float g = 4.0F;
   protected static final ews h = dff.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dtu a;

   protected dmf(dtu $$0, dsg.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmf> a();

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return h;
   }

   @Override
   public boolean a(dsh $$0) {
      return true;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqx($$0, $$1);
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.c_($$3) instanceof dqx $$7) {
         cvc $$10 = $$0.g() instanceof cvc $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gk();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avp.c.b($$0.g()));
                  $$2.a(dxa.c, $$7.az_(), dxa.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bqf.a;
               } else {
                  return bqf.d;
               }
            } else {
               return bqf.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqf.b : bqf.a;
         }
      } else {
         return bqf.e;
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.c_($$2) instanceof dqx $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.az_(), $$5.d(), avg.e);
            return bqd.a;
         } else if ($$8) {
            return bqd.a;
         } else if (!this.a($$3, $$5) && $$3.gk() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqd.a;
         } else {
            return bqd.e;
         }
      } else {
         return bqd.e;
      }
   }

   private boolean b(cmh $$0, dqx $$1, boolean $$2) {
      dqy $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(wt.a) || $$0x.b() instanceof yb);
   }

   public abstract float g(dsh var1);

   public evz m(dsh $$0) {
      return new evz(0.5, 0.5, 0.5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(f) ? eoc.c.a(false) : super.b_($$0);
   }

   public dtu d() {
      return this.a;
   }

   public static dtu a(dff $$0) {
      dtu $$1;
      if ($$0 instanceof dmf) {
         $$1 = ((dmf)$$0).d();
      } else {
         $$1 = dtu.b;
      }

      return $$1;
   }

   public void a(cmh $$0, dqx $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cmh $$0, dqx $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.h, dqx::a);
   }
}
