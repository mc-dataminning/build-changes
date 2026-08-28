import com.mojang.serialization.MapCodec;

public class dhx extends dgv {
   public static final MapCodec<dhx> i = b(dhx::new);
   private final ewk[] j;

   @Override
   public MapCodec<dhx> a() {
      return i;
   }

   public dhx(dsb.d $$0) {
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
   protected ewk f(dsc $$0, dbe $$1, iz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ewk c(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   public boolean a(dsc $$0, boolean $$1, je $$2) {
      dez $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dhy && dhy.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dsc $$0) {
      return $$0.a(awp.S) && $$0.a(awp.k) == this.o().a(awp.k);
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.B) {
         return $$0.a(cus.uK) ? bqw.a : bqw.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      return !$$1.x_() ? cuu.a($$3, $$1, $$2) : bqu.e;
   }

   @Override
   public dsc a(cya $$0) {
      dbe $$1 = $$0.q();
      iz $$2 = $$0.a();
      env $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      dsc $$8 = $$1.a_($$4);
      dsc $$9 = $$1.a_($$5);
      dsc $$10 = $$1.a_($$6);
      dsc $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d), je.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.e), je.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.c), je.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.f), je.f)))
         .a(e, Boolean.valueOf($$3.a() == enw.c));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1.o().e() == je.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
