import com.mojang.serialization.MapCodec;

public class cvy extends cuw {
   public static final MapCodec<cvy> i = b(cvy::new);
   private final eia[] j;

   @Override
   public MapCodec<cvy> a() {
      return i;
   }

   public cvy(dfc.d $$0) {
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
   public eia f(dfd $$0, cph $$1, gw $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public eia b(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   public boolean a(dfd $$0, boolean $$1, ha $$2) {
      ctc $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cvz && cvz.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dfd $$0) {
      return $$0.a(apv.S) && $$0.a(apv.k) == this.o().a(apv.k);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         cjl $$6 = $$3.b($$4);
         return $$6.a(cjo.tQ) ? bhe.a : bhe.d;
      } else {
         return cjq.a($$3, $$1, $$2);
      }
   }

   @Override
   public dfd a(clt $$0) {
      cph $$1 = $$0.q();
      gw $$2 = $$0.a();
      eag $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      dfd $$8 = $$1.a_($$4);
      dfd $$9 = $$1.a_($$5);
      dfd $$10 = $$1.a_($$6);
      dfd $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d), ha.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.e), ha.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.c), ha.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.f), ha.f)))
         .a(e, Boolean.valueOf($$3.a() == eah.c));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$1.o().e() == ha.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
