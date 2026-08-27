import com.mojang.serialization.MapCodec;

public class dda extends dby {
   public static final MapCodec<dda> i = b(dda::new);
   private final eqm[] j;

   @Override
   public MapCodec<dda> a() {
      return i;
   }

   public dda(dna.d $$0) {
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
   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected eqm c(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   public boolean a(dnb $$0, boolean $$1, ih $$2) {
      dac $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof ddb && ddb.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dnb $$0) {
      return $$0.a(aun.S) && $$0.a(aun.k) == this.o().a(aun.k);
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.B) {
         return $$0.a(cqp.uI) ? bnf.a : bnf.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      return !$$1.x_() ? cqr.a($$3, $$1, $$2) : bnd.d;
   }

   @Override
   public dnb a(csu $$0) {
      cwh $$1 = $$0.q();
      ib $$2 = $$0.a();
      eip $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      dnb $$8 = $$1.a_($$4);
      dnb $$9 = $$1.a_($$5);
      dnb $$10 = $$1.a_($$6);
      dnb $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ih.d), ih.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ih.e), ih.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ih.c), ih.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ih.f), ih.f)))
         .a(e, Boolean.valueOf($$3.a() == eiq.c));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1.o().e() == ih.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
