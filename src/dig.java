import com.mojang.serialization.MapCodec;

public class dig extends dhe {
   public static final MapCodec<dig> i = b(dig::new);
   private final exa[] j;

   @Override
   public MapCodec<dig> a() {
      return i;
   }

   public dig(dsk.d $$0) {
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
   protected exa f(dsl $$0, dbm $$1, ja $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected exa c(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   public boolean a(dsl $$0, boolean $$1, jf $$2) {
      dfi $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dih && dih.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dsl $$0) {
      return $$0.a(avw.S) && $$0.a(avw.k) == this.o().a(avw.k);
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.B) {
         return $$0.a(cug.uK) ? bqj.a : bqj.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      return !$$1.x_() ? cui.a($$3, $$1, $$2) : bqh.e;
   }

   @Override
   public dsl a(cxn $$0) {
      dbm $$1 = $$0.q();
      ja $$2 = $$0.a();
      eoj $$3 = $$0.q().b_($$0.a());
      ja $$4 = $$2.e();
      ja $$5 = $$2.h();
      ja $$6 = $$2.f();
      ja $$7 = $$2.g();
      dsl $$8 = $$1.a_($$4);
      dsl $$9 = $$1.a_($$5);
      dsl $$10 = $$1.a_($$6);
      dsl $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, jf.d), jf.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, jf.e), jf.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, jf.c), jf.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, jf.f), jf.f)))
         .a(e, Boolean.valueOf($$3.a() == eok.c));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$1.o().e() == jf.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
