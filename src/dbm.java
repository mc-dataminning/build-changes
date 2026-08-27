import com.mojang.serialization.MapCodec;

public class dbm extends dak {
   public static final MapCodec<dbm> i = b(dbm::new);
   private final eol[] j;

   @Override
   public MapCodec<dbm> a() {
      return i;
   }

   public dbm(dle.d $$0) {
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
   protected eol f(dlf $$0, cut $$1, hz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected eol c(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   public boolean a(dlf $$0, boolean $$1, ie $$2) {
      cyo $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dbn && dbn.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dlf $$0) {
      return $$0.a(atz.S) && $$0.a(atz.k) == this.o().a(atz.k);
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.B) {
         return $$0.a(cpc.uG) ? blw.a : blw.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      return !$$1.y_() ? cpe.a($$3, $$1, $$2) : blu.d;
   }

   @Override
   public dlf a(crg $$0) {
      cut $$1 = $$0.q();
      hz $$2 = $$0.a();
      egp $$3 = $$0.q().b_($$0.a());
      hz $$4 = $$2.e();
      hz $$5 = $$2.h();
      hz $$6 = $$2.f();
      hz $$7 = $$2.g();
      dlf $$8 = $$1.a_($$4);
      dlf $$9 = $$1.a_($$5);
      dlf $$10 = $$1.a_($$6);
      dlf $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ie.d), ie.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ie.e), ie.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ie.c), ie.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ie.f), ie.f)))
         .a(e, Boolean.valueOf($$3.a() == egq.c));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$1.o().e() == ie.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
