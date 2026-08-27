import com.mojang.serialization.MapCodec;

public class cxb extends cuw {
   public static final MapCodec<cxb> i = b(cxb::new);

   @Override
   public MapCodec<? extends cxb> a() {
      return i;
   }

   protected cxb(dfc.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dfd a(clt $$0) {
      cph $$1 = $$0.q();
      gw $$2 = $$0.a();
      eag $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.f();
      gw $$6 = $$2.g();
      gw $$7 = $$2.h();
      dfd $$8 = $$1.a_($$4);
      dfd $$9 = $$1.a_($$5);
      dfd $$10 = $$1.a_($$6);
      dfd $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.e))))
         .a(e, Boolean.valueOf($$3.a() == eah.c));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eia b(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.a();
   }

   @Override
   public boolean a(dfd $$0, dfd $$1, ha $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public final boolean a(dfd $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof cxb || $$0.a(apv.L);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
