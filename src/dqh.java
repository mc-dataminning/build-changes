import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqh extends dhv implements dlq {
   public static final MapCodec<dqh> a = b(dqh::new);
   public static final dwl<dwx> b = dwe.bj;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   protected dqh(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwx.b));
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dui($$0, $$1);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      dsr $$5 = $$1.c_($$2);
      if ($$5 instanceof dui) {
         return (bsh)(((dui)$$5).a($$3) ? bsh.a : bsh.e);
      } else {
         return bsh.e;
      }
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, @Nullable bve $$3, cwf $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dsr $$5 = $$0.c_($$1);
            if ($$5 instanceof dui) {
               ((dui)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if ($$1 instanceof arq) {
         if ($$1.c_($$2) instanceof dui $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arq)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arq $$0, dui $$1) {
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
