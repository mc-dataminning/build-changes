import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhe extends dhv {
   public static final dwl<jm> a = dme.aF;
   public static final dwf b = dwe.r;

   protected dhe(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dhe> a();

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsh.a;
   }

   protected abstract void a(dff var1, jh var2, cor var3);

   @Override
   public dvo a(czw $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsr $$5 = $$1.c_($$2);
         if ($$5 instanceof dsf) {
            if ($$1 instanceof arq) {
               bsd.a($$1, $$2, (dsf)$$5);
               ((dsf)$$5).a((arq)$$1, ezr.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return crs.a($$1.c_($$2));
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dsr> dss<T> a(dff $$0, dst<T> $$1, dst<? extends dsf> $$2) {
      return $$0.C ? null : a($$1, $$2, dsf::a);
   }
}
