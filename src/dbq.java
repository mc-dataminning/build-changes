import com.mojang.serialization.MapCodec;

public class dbq extends dao {
   public static final MapCodec<dbq> i = b(dbq::new);
   private final eos[] j;

   @Override
   public MapCodec<dbq> a() {
      return i;
   }

   public dbq(dli.d $$0) {
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
   protected eos f(dlj $$0, cux $$1, hz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected eos c(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   public boolean a(dlj $$0, boolean $$1, ie $$2) {
      cys $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dbr && dbr.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dlj $$0) {
      return $$0.a(aua.S) && $$0.a(aua.k) == this.o().a(aua.k);
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.B) {
         return $$0.a(cpg.uG) ? bly.a : bly.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      return !$$1.y_() ? cpi.a($$3, $$1, $$2) : blw.d;
   }

   @Override
   public dlj a(crk $$0) {
      cux $$1 = $$0.q();
      hz $$2 = $$0.a();
      egw $$3 = $$0.q().b_($$0.a());
      hz $$4 = $$2.e();
      hz $$5 = $$2.h();
      hz $$6 = $$2.f();
      hz $$7 = $$2.g();
      dlj $$8 = $$1.a_($$4);
      dlj $$9 = $$1.a_($$5);
      dlj $$10 = $$1.a_($$6);
      dlj $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ie.d), ie.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ie.e), ie.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ie.c), ie.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ie.f), ie.f)))
         .a(e, Boolean.valueOf($$3.a() == egx.c));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return $$1.o().e() == ie.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
