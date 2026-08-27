import com.mojang.serialization.MapCodec;

public class dcy extends dbw {
   public static final MapCodec<dcy> i = b(dcy::new);
   private final eqk[] j;

   @Override
   public MapCodec<dcy> a() {
      return i;
   }

   public dcy(dmy.d $$0) {
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
   protected eqk f(dmz $$0, cwf $$1, ib $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected eqk c(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   public boolean a(dmz $$0, boolean $$1, ih $$2) {
      daa $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dcz && dcz.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dmz $$0) {
      return $$0.a(aun.S) && $$0.a(aun.k) == this.o().a(aun.k);
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$2.B) {
         return $$0.a(cqn.uH) ? bne.a : bne.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      return !$$1.x_() ? cqp.a($$3, $$1, $$2) : bnc.d;
   }

   @Override
   public dmz a(css $$0) {
      cwf $$1 = $$0.q();
      ib $$2 = $$0.a();
      ein $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      dmz $$8 = $$1.a_($$4);
      dmz $$9 = $$1.a_($$5);
      dmz $$10 = $$1.a_($$6);
      dmz $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ih.d), ih.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ih.e), ih.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ih.c), ih.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ih.f), ih.f)))
         .a(e, Boolean.valueOf($$3.a() == eio.c));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1.o().e() == ih.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
