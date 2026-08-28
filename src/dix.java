import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dix extends deg {
   public static final MapCodec<dix> a = b(dix::new);
   public static final dso b = dsn.n;

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   protected dix(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, @Nullable btk $$3, cuk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cwz $$5 = $$4.a(km.N, cwz.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqd $$5) {
         $$5.l();
         return bqp.a($$1.B);
      } else {
         return bqp.e;
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqd $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqd($$0, $$1);
   }

   @Override
   public boolean e_(drx $$0) {
      return true;
   }

   @Override
   public int a(drx $$0, daz $$1, iz $$2, je $$3) {
      if ($$1.c_($$2) instanceof dqd $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqd $$3 && $$3.f().g() instanceof cvf $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$1.c(b) ? a($$2, dpe.e, dqd::a) : null;
   }
}
