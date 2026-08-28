import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dms extends dij implements dpk {
   public static final MapCodec<dms> b = b(dms::new);
   public static final int c = 7;
   public static final dwn d = dwe.aC;
   public static final dwf e = dwe.v;
   public static final dwf f = dwe.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dms> a() {
      return b;
   }

   public dms(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      return fai.a();
   }

   @Override
   protected boolean f(dvo $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dvo $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dvo $$0) {
      return 1;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(d) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dvo a(dvo $$0, dfg $$1, jh $$2) {
      int $$3 = 7;
      jh.a $$4 = new jh.a();

      for (jm $$5 : jm.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(d, Integer.valueOf($$3));
   }

   private static int r(dvo $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dvo $$0) {
      if ($$0.a(axd.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(f) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jh $$4 = $$2.e();
            dvo $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jm.b)) {
               azr.a($$1, $$2, $$3, ls.l);
            }
         }
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      dvo $$2 = this.m().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == erp.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
