import com.mojang.serialization.MapCodec;

public class dap extends cyl {
   public static final MapCodec<dap> i = b(dap::new);

   @Override
   public MapCodec<? extends dap> a() {
      return i;
   }

   protected dap(djf.d $$0) {
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
   public djg a(cpg $$0) {
      csu $$1 = $$0.q();
      hx $$2 = $$0.a();
      eeq $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.f();
      hx $$6 = $$2.g();
      hx $$7 = $$2.h();
      djg $$8 = $$1.a_($$4);
      djg $$9 = $$1.a_($$5);
      djg $$10 = $$1.a_($$6);
      djg $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ic.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ic.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ic.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ic.e))))
         .a(e, Boolean.valueOf($$3.a() == eer.c));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eml c(djg $$0, csu $$1, hx $$2, elx $$3) {
      return emi.a();
   }

   @Override
   public boolean a(djg $$0, djg $$1, ic $$2) {
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

   public final boolean a(djg $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dap || $$0.a(asg.L);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
