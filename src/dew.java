import com.mojang.serialization.MapCodec;

public class dew extends ddu {
   public static final MapCodec<dew> i = b(dew::new);
   private final est[] j;

   @Override
   public MapCodec<dew> a() {
      return i;
   }

   public dew(doy.d $$0) {
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
   protected est f(doz $$0, cyd $$1, ib $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected est c(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   public boolean a(doz $$0, boolean $$1, ih $$2) {
      dby $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dex && dex.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(doz $$0) {
      return $$0.a(avc.S) && $$0.a(avc.k) == this.n().a(avc.k);
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.B) {
         return $$0.a(crm.uI) ? boc.a : boc.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      return !$$1.x_() ? cro.a($$3, $$1, $$2) : boa.d;
   }

   @Override
   public doz a(cuo $$0) {
      cyd $$1 = $$0.q();
      ib $$2 = $$0.a();
      eks $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      doz $$8 = $$1.a_($$4);
      doz $$9 = $$1.a_($$5);
      doz $$10 = $$1.a_($$6);
      doz $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ih.d), ih.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ih.e), ih.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ih.c), ih.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ih.f), ih.f)))
         .a(e, Boolean.valueOf($$3.a() == ekt.c));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1.o().e() == ih.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
