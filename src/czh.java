import com.mojang.serialization.MapCodec;

public class czh extends cyf {
   public static final MapCodec<czh> i = b(czh::new);
   private final emf[] j;

   @Override
   public MapCodec<czh> a() {
      return i;
   }

   public czh(diz.d $$0) {
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
   public emf f(dja $$0, cso $$1, hx $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public emf c(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   public boolean a(dja $$0, boolean $$1, ic $$2) {
      cwj $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof czi && czi.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dja $$0) {
      return $$0.a(asb.S) && $$0.a(asb.k) == this.o().a(asb.k);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         cmr $$6 = $$3.b($$4);
         return $$6.a(cmu.uD) ? bjv.a : bjv.d;
      } else {
         return cmw.a($$3, $$1, $$2);
      }
   }

   @Override
   public dja a(cpa $$0) {
      cso $$1 = $$0.q();
      hx $$2 = $$0.a();
      eek $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      dja $$8 = $$1.a_($$4);
      dja $$9 = $$1.a_($$5);
      dja $$10 = $$1.a_($$6);
      dja $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ic.d), ic.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ic.e), ic.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ic.c), ic.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ic.f), ic.f)))
         .a(e, Boolean.valueOf($$3.a() == eel.c));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1.o().e() == ic.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
