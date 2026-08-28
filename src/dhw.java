import com.mojang.serialization.MapCodec;

public class dhw extends dgu {
   public static final MapCodec<dhw> i = b(dhw::new);
   private final ewj[] j;

   @Override
   public MapCodec<dhw> a() {
      return i;
   }

   public dhw(dsa.d $$0) {
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
   protected ewj f(dsb $$0, dbd $$1, iz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ewj c(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   public boolean a(dsb $$0, boolean $$1, je $$2) {
      dey $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dhx && dhx.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dsb $$0) {
      return $$0.a(awo.S) && $$0.a(awo.k) == this.o().a(awo.k);
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$2.B) {
         return $$0.a(cur.uK) ? bqv.a : bqv.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      return !$$1.x_() ? cut.a($$3, $$1, $$2) : bqt.e;
   }

   @Override
   public dsb a(cxz $$0) {
      dbd $$1 = $$0.q();
      iz $$2 = $$0.a();
      enu $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      dsb $$8 = $$1.a_($$4);
      dsb $$9 = $$1.a_($$5);
      dsb $$10 = $$1.a_($$6);
      dsb $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d), je.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.e), je.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.c), je.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.f), je.f)))
         .a(e, Boolean.valueOf($$3.a() == env.c));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return $$1.o().e() == je.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
