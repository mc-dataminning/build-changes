import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enw extends eno {
   @Override
   public enp d() {
      return enr.b;
   }

   @Override
   public enp e() {
      return enr.c;
   }

   @Override
   public cuf a() {
      return cun.qz;
   }

   @Override
   public void a(dbt $$0, iz $$1, enq $$2, azc $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avw.BY, avx.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lj.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lh h() {
      return lj.l;
   }

   @Override
   protected boolean a(dbt $$0) {
      return $$0.ab().b(dbp.U);
   }

   @Override
   protected void a(dbu $$0, iz $$1, drx $$2) {
      dpc $$3 = $$2.t() ? $$0.c_($$1) : null;
      deu.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dbw $$0) {
      return 4;
   }

   @Override
   public drx b(enq $$0) {
      return dew.G.n().a(djk.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(enp $$0) {
      return $$0 == enr.c || $$0 == enr.b;
   }

   @Override
   public int c(dbw $$0) {
      return 1;
   }

   @Override
   public int a(dbw $$0) {
      return 5;
   }

   @Override
   public boolean a(enq $$0, daz $$1, iz $$2, enp $$3, je $$4) {
      return $$4 == je.a && !$$3.a(awr.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avv> j() {
      return Optional.of(avw.di);
   }

   public static class a extends enw {
      @Override
      protected void a(dry.a<enp, enq> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(enq $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(enq $$0) {
         return false;
      }
   }

   public static class b extends enw {
      @Override
      public int d(enq $$0) {
         return 8;
      }

      @Override
      public boolean c(enq $$0) {
         return true;
      }
   }
}
