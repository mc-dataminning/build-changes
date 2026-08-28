import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends det {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dtb b = dta.n;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, @Nullable btb $$3, cuc $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cwq $$5 = $$4.a(kn.O, cwq.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqr $$5) {
         $$5.l();
         return bqg.a($$1.B);
      } else {
         return bqg.e;
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqr $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqr($$0, $$1);
   }

   @Override
   public boolean e_(dsk $$0) {
      return true;
   }

   @Override
   public int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      if ($$1.c_($$2) instanceof dqr $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqr $$3 && $$3.f().g() instanceof cux $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$1.c(b) ? a($$2, dpr.e, dqr::a) : null;
   }
}
