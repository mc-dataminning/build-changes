import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ehx extends ehp {
   @Override
   public ehq d() {
      return ehs.b;
   }

   @Override
   public ehq e() {
      return ehs.c;
   }

   @Override
   public cpl a() {
      return cpt.qy;
   }

   @Override
   public void a(cwe $$0, ib $$1, ehr $$2, awt $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atp.Bu, atq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(kb.ai, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jz h() {
      return kb.m;
   }

   @Override
   protected boolean a(cwe $$0) {
      return $$0.Z().b(cwa.U);
   }

   @Override
   protected void a(cwf $$0, ib $$1, dme $$2) {
      djl $$3 = $$2.t() ? $$0.c_($$1) : null;
      czf.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cwh $$0) {
      return 4;
   }

   @Override
   public dme b(ehr $$0) {
      return czh.G.o().a(ddu.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ehq $$0) {
      return $$0 == ehs.c || $$0 == ehs.b;
   }

   @Override
   public int c(cwh $$0) {
      return 1;
   }

   @Override
   public int a(cwh $$0) {
      return 5;
   }

   @Override
   public boolean a(ehr $$0, cvk $$1, ib $$2, ehq $$3, ih $$4) {
      return $$4 == ih.a && !$$3.a(auj.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ato> j() {
      return Optional.of(atp.da);
   }

   public static class a extends ehx {
      @Override
      protected void a(dmf.a<ehq, ehr> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ehr $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ehr $$0) {
         return false;
      }
   }

   public static class b extends ehx {
      @Override
      public int d(ehr $$0) {
         return 8;
      }

      @Override
      public boolean c(ehr $$0) {
         return true;
      }
   }
}
