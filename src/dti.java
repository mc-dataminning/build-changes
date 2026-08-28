import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dti extends dkg implements doe {
   public static final MapCodec<dti> a = b(dti::new);
   public static final dzk<dzx> b = dzc.bF;

   public dti(dyl.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxf($$0, $$1);
   }

   @Override
   public dym a(dbn $$0) {
      czx $$1 = $$0.n().a(kx.ao);
      dym $$2 = this.m();
      if ($$1 != null) {
         dzx $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.c_($$2) instanceof dxf $$6) {
         if (!$$3.gF()) {
            return btq.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return btq.a;
         }
      } else {
         return btq.e;
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      dxf $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      dxf $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != dzx.a) {
            boolean $$7 = $$1.C($$2);
            boolean $$8 = $$6.c();
            if ($$7 && !$$8) {
               $$6.a(true);
               $$6.j();
            } else if (!$$7 && $$8) {
               $$6.a(false);
            }
         }
      }
   }

   @Nullable
   private static dxf a(dhp $$0, jj $$1) {
      if ($$0 instanceof arn $$2) {
         dvl var4 = $$2.c_($$1);
         if (var4 instanceof dxf) {
            return (dxf)var4;
         }
      }

      return null;
   }

   @Override
   public int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      if ($$0.c(b) != dzx.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dxf $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      cxy $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static cxy a(cxy $$0, dzx $$1) {
      $$0.b(kx.ao, $$0.a(kx.ao, czx.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dti> a() {
      return a;
   }
}
