import com.mojang.serialization.MapCodec;

public class diu extends dhs {
   public static final MapCodec<diu> i = b(diu::new);
   private final exp[] j;

   @Override
   public MapCodec<diu> a() {
      return i;
   }

   public diu(dsz.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected exp f(dta $$0, dca $$1, jd $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   public boolean a(dta $$0, boolean $$1, ji $$2) {
      dfw $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof div && div.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dta $$0) {
      return $$0.a(awd.S) && $$0.a(awd.k) == this.o().a(awd.k);
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.B) {
         return $$0.a(cur.uK) ? bqs.a : bqs.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      return !$$1.x_() ? cux.a($$3, $$1, $$2) : bqq.e;
   }

   @Override
   public dta a(cyb $$0) {
      dca $$1 = $$0.q();
      jd $$2 = $$0.a();
      eoy $$3 = $$0.q().b_($$0.a());
      jd $$4 = $$2.e();
      jd $$5 = $$2.h();
      jd $$6 = $$2.f();
      jd $$7 = $$2.g();
      dta $$8 = $$1.a_($$4);
      dta $$9 = $$1.a_($$5);
      dta $$10 = $$1.a_($$6);
      dta $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ji.d), ji.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ji.e), ji.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ji.c), ji.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ji.f), ji.f)))
         .a(e, Boolean.valueOf($$3.a() == eoz.c));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1.o().e() == ji.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
