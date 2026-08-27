import com.mojang.serialization.MapCodec;

public class czw extends cyu {
   public static final MapCodec<czw> i = b(czw::new);
   private final emv[] j;

   @Override
   public MapCodec<czw> a() {
      return i;
   }

   public czw(djo.d $$0) {
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
   public emv f(djp $$0, ctd $$1, hx $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public emv c(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   public boolean a(djp $$0, boolean $$1, ic $$2) {
      cwy $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof czx && czx.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(djp $$0) {
      return $$0.a(asi.S) && $$0.a(asi.k) == this.o().a(asi.k);
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.B) {
         return $$0.a(cnj.uG) ? bke.a : bke.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      return !$$1.y_() ? cnl.a($$3, $$1, $$2) : bkc.d;
   }

   @Override
   public djp a(cpp $$0) {
      ctd $$1 = $$0.q();
      hx $$2 = $$0.a();
      eez $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      djp $$8 = $$1.a_($$4);
      djp $$9 = $$1.a_($$5);
      djp $$10 = $$1.a_($$6);
      djp $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ic.d), ic.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ic.e), ic.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ic.c), ic.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ic.f), ic.f)))
         .a(e, Boolean.valueOf($$3.a() == efa.c));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$1.o().e() == ic.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
