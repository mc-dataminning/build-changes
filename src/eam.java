import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eam extends eae {
   @Override
   public eaf d() {
      return eah.b;
   }

   @Override
   public eaf e() {
      return eah.c;
   }

   @Override
   public cjg a() {
      return cjo.pL;
   }

   @Override
   public void a(cqb $$0, gw $$1, eag $$2, ash $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apg.zQ, aph.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(iv.af, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public it h() {
      return iv.m;
   }

   @Override
   protected boolean a(cqb $$0) {
      return $$0.X().b(cpx.Q);
   }

   @Override
   protected void a(cqc $$0, gw $$1, dfd $$2) {
      dcz $$3 = $$2.t() ? $$0.c_($$1) : null;
      ctc.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cqe $$0) {
      return 4;
   }

   @Override
   public dfd b(eag $$0) {
      return cte.G.o().a(cxq.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eaf $$0) {
      return $$0 == eah.c || $$0 == eah.b;
   }

   @Override
   public int c(cqe $$0) {
      return 1;
   }

   @Override
   public int a(cqe $$0) {
      return 5;
   }

   @Override
   public boolean a(eag $$0, cph $$1, gw $$2, eaf $$3, ha $$4) {
      return $$4 == ha.a && !$$3.a(aqa.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<apf> j() {
      return Optional.of(apg.cB);
   }

   public static class a extends eam {
      @Override
      protected void a(dfe.a<eaf, eag> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eag $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eag $$0) {
         return false;
      }
   }

   public static class b extends eam {
      @Override
      public int d(eag $$0) {
         return 8;
      }

      @Override
      public boolean c(eag $$0) {
         return true;
      }
   }
}
