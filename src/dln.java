import com.mojang.serialization.MapCodec;

public class dln extends dkm {
   public static final MapCodec<dln> i = b(dln::new);
   private final fas[] j;

   @Override
   public MapCodec<dln> a() {
      return i;
   }

   public dln(dvu.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected fas d_(dvv $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fas c(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   public boolean a(dvv $$0, boolean $$1, jm $$2) {
      diq $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dlo && dlo.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dvv $$0) {
      return $$0.a(axc.T) && $$0.a(axc.l) == this.m().a(axc.l);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      return (bsk)(!$$1.A_() ? cww.a($$3, $$1, $$2) : bsk.e);
   }

   @Override
   public dvv a(dad $$0) {
      der $$1 = $$0.q();
      jh $$2 = $$0.a();
      erv $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      dvv $$8 = $$1.a_($$4);
      dvv $$9 = $$1.a_($$5);
      dvv $$10 = $$1.a_($$6);
      dvv $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d), jm.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.e), jm.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.c), jm.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.f), jm.f)))
         .b(e, Boolean.valueOf($$3.a() == erw.c));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4.o().e() == jm.c.a
         ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g())))
         : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
