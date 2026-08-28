import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dma extends dhk {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dvu b = dvt.n;

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   protected dma(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, @Nullable buv $$3, cvx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyg $$5 = $$4.a(kt.X, cyg.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dtj $$5) {
         $$5.t();
         return bry.a;
      } else {
         return bry.e;
      }
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$1.c(b)) {
         return bry.f;
      } else {
         cvx $$7 = $$4.b($$5);
         bry $$8 = cwc.a($$2, $$3, $$7, $$4);
         return (bry)(!$$8.a() ? bry.f : $$8);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dtj $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtj($$0, $$1);
   }

   @Override
   public boolean f_(dvd $$0) {
      return true;
   }

   @Override
   public int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      if ($$1.c_($$2) instanceof dtj $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return $$1.c_($$2) instanceof dtj $$3 ? $$3.u() : 0;
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$1.c(b) ? a($$2, dsi.e, dtj::a) : null;
   }
}
