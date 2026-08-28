import com.mojang.serialization.MapCodec;

public class dhz extends dgx {
   public static final MapCodec<dhz> i = b(dhz::new);
   private final ewm[] j;

   @Override
   public MapCodec<dhz> a() {
      return i;
   }

   public dhz(dsd.d $$0) {
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
   protected ewm f(dse $$0, dbg $$1, iz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ewm c(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   public boolean a(dse $$0, boolean $$1, je $$2) {
      dfb $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dia && dia.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dse $$0) {
      return $$0.a(awp.S) && $$0.a(awp.k) == this.o().a(awp.k);
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$2.B) {
         return $$0.a(cuu.uK) ? bqy.a : bqy.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      return !$$1.x_() ? cuw.a($$3, $$1, $$2) : bqw.e;
   }

   @Override
   public dse a(cyc $$0) {
      dbg $$1 = $$0.q();
      iz $$2 = $$0.a();
      enx $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      dse $$8 = $$1.a_($$4);
      dse $$9 = $$1.a_($$5);
      dse $$10 = $$1.a_($$6);
      dse $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d), je.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.e), je.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.c), je.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.f), je.f)))
         .a(e, Boolean.valueOf($$3.a() == eny.c));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$1.o().e() == je.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
