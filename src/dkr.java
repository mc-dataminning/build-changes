import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkr extends dis {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final dwl<dwj> b = dwe.ae;

   @Override
   public MapCodec<? extends dkr> a() {
      return a;
   }

   public dkr(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwj.b));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      dwj $$8 = $$0.c(b);
      if ($$4.o() != jm.a.b || $$8 == dwj.b != ($$4 == jm.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dwj.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dil.a.m();
      }
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      jh $$1 = $$0.a();
      dff $$2 = $$0.q();
      return $$1.v() < $$2.al() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
      jh $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dwj.a)), 3);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      if ($$0.c(b) != dwj.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dvo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dwj.b;
      }
   }

   public static void a(dfg $$0, dvo $$1, jh $$2, int $$3) {
      jh $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dwj.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dwj.a)), $$3);
   }

   public static dvo c(dfi $$0, jh $$1, dvo $$2) {
      return $$2.b(dwe.C) ? $$2.b(dwe.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      if (!$$0.C) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fc());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dff $$0, cor $$1, jh $$2, dvo $$3, @Nullable dsr $$4, cwf $$5) {
      super.a($$0, $$1, $$2, dil.a.m(), $$4, $$5);
   }

   protected static void b(dff $$0, jh $$1, dvo $$2, cor $$3) {
      dwj $$4 = $$2.c(b);
      if ($$4 == dwj.a) {
         jh $$5 = $$1.e();
         dvo $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dwj.b) {
            dvo $$7 = $$6.y().b(erp.c) ? dil.G.m() : dil.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dij.j($$6));
         }
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dvo $$0, jh $$1) {
      return azn.b($$1.u(), $$1.c($$0.c(b) == dwj.b ? 0 : 1).v(), $$1.w());
   }
}
