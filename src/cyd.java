import com.mojang.serialization.MapCodec;

public class cyd extends cxb {
   public static final MapCodec<cyd> i = b(cyd::new);
   private final eks[] j;

   @Override
   public MapCodec<cyd> a() {
      return i;
   }

   public cyd(dhm.d $$0) {
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
   public eks f(dhn $$0, crl $$1, hx $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public eks c(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   public boolean a(dhn $$0, boolean $$1, ib $$2) {
      cvf $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cye && cye.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dhn $$0) {
      return $$0.a(ark.S) && $$0.a(ark.k) == this.o().a(ark.k);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         clo $$6 = $$3.b($$4);
         return $$6.a(clr.uC) ? bjb.a : bjb.d;
      } else {
         return clt.a($$3, $$1, $$2);
      }
   }

   @Override
   public dhn a(cnw $$0) {
      crl $$1 = $$0.q();
      hx $$2 = $$0.a();
      ecx $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      dhn $$8 = $$1.a_($$4);
      dhn $$9 = $$1.a_($$5);
      dhn $$10 = $$1.a_($$6);
      dhn $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ib.d), ib.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ib.e), ib.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ib.c), ib.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ib.f), ib.f)))
         .a(e, Boolean.valueOf($$3.a() == ecy.c));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1.o().e() == ib.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
