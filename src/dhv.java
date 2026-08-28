import com.mojang.serialization.MapCodec;

public class dhv extends dgt {
   public static final MapCodec<dhv> i = b(dhv::new);
   private final ewi[] j;

   @Override
   public MapCodec<dhv> a() {
      return i;
   }

   public dhv(drz.d $$0) {
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
   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ewi c(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   public boolean a(dsa $$0, boolean $$1, je $$2) {
      dex $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dhw && dhw.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dsa $$0) {
      return $$0.a(awo.S) && $$0.a(awo.k) == this.o().a(awo.k);
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$2.B) {
         return $$0.a(cuq.uK) ? bqu.a : bqu.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      return !$$1.x_() ? cus.a($$3, $$1, $$2) : bqs.e;
   }

   @Override
   public dsa a(cxy $$0) {
      dbc $$1 = $$0.q();
      iz $$2 = $$0.a();
      ent $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      dsa $$8 = $$1.a_($$4);
      dsa $$9 = $$1.a_($$5);
      dsa $$10 = $$1.a_($$6);
      dsa $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d), je.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.e), je.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.c), je.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.f), je.f)))
         .a(e, Boolean.valueOf($$3.a() == enu.c));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return $$1.o().e() == je.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
