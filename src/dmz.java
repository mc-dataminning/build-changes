import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmz extends den implements dij {
   public static final MapCodec<dmz> a = b(dmz::new);
   public static final dtc<dto> b = dsu.bj;

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dto.b));
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqy($$0, $$1);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      dpj $$5 = $$1.c_($$2);
      if ($$5 instanceof dqy) {
         return ((dqy)$$5).a($$3) ? bqw.a($$1.B) : bqw.e;
      } else {
         return bqw.e;
      }
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, @Nullable btr $$3, cur $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpj $$5 = $$0.c_($$1);
            if ($$5 instanceof dqy) {
               ((dqy)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof arf) {
         if ($$1.c_($$2) instanceof dqy $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arf)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arf $$0, dqy $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
