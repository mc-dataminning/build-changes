import com.mojang.serialization.MapCodec;

public class day extends cyu {
   public static final MapCodec<day> i = b(day::new);

   @Override
   public MapCodec<? extends day> a() {
      return i;
   }

   protected day(djo.d $$0) {
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
   public djp a(cpp $$0) {
      ctd $$1 = $$0.q();
      hx $$2 = $$0.a();
      eez $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.f();
      hx $$6 = $$2.g();
      hx $$7 = $$2.h();
      djp $$8 = $$1.a_($$4);
      djp $$9 = $$1.a_($$5);
      djp $$10 = $$1.a_($$6);
      djp $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ic.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ic.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ic.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ic.e))))
         .a(e, Boolean.valueOf($$3.a() == efa.c));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emv c(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.a();
   }

   @Override
   public boolean a(djp $$0, djp $$1, ic $$2) {
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

   public final boolean a(djp $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof day || $$0.a(asi.L);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
