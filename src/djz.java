import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djz extends dfi {
   public static final MapCodec<djz> a = b(djz::new);
   public static final dtr b = dtq.n;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   protected djz(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, @Nullable btl $$3, cuo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxf $$5 = $$4.a(kq.O, cxf.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof drh $$5) {
         $$5.l();
         return bqq.a($$1.B);
      } else {
         return bqq.e;
      }
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$1.c(b)) {
         return bqs.d;
      } else {
         cuo $$7 = $$4.b($$5);
         bqs $$8 = cus.a($$2, $$3, $$7, $$4);
         return !$$8.a() ? bqs.d : $$8;
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof drh $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drh($$0, $$1);
   }

   @Override
   public boolean e_(dta $$0) {
      return true;
   }

   @Override
   public int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      if ($$1.c_($$2) instanceof drh $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return $$1.c_($$2) instanceof drh $$3 ? $$3.j().d() : 0;
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$1.c(b) ? a($$2, dqh.e, drh::a) : null;
   }
}
