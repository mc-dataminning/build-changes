import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsm extends djx implements dnu {
   public static final MapCodec<dsm> a = b(dsm::new);
   public static final dyr<dzd> b = dyk.bk;

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   protected dsm(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dzd.b));
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwo($$0, $$1);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      duw $$5 = $$1.c_($$2);
      if ($$5 instanceof dwo) {
         return (bti)(((dwo)$$5).a($$3) ? bti.a : bti.e);
      } else {
         return bti.e;
      }
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, @Nullable bwf $$3, cxo $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            duw $$5 = $$0.c_($$1);
            if ($$5 instanceof dwo) {
               ((dwo)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if ($$1 instanceof ash) {
         if ($$1.c_($$2) instanceof dwo $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ash)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ash $$0, dwo $$1) {
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
