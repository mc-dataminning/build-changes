import com.mojang.serialization.MapCodec;

public class dhz extends dfu {
   public static final MapCodec<dhz> i = b(dhz::new);

   @Override
   public MapCodec<? extends dhz> a() {
      return i;
   }

   protected dhz(dra.d $$0) {
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
   public drb a(cwz $$0) {
      dad $$1 = $$0.q();
      io $$2 = $$0.a();
      emu $$3 = $$0.q().b_($$0.a());
      io $$4 = $$2.e();
      io $$5 = $$2.f();
      io $$6 = $$2.g();
      io $$7 = $$2.h();
      drb $$8 = $$1.a_($$4);
      drb $$9 = $$1.a_($$5);
      drb $$10 = $$1.a_($$6);
      drb $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, it.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, it.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, it.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, it.e))))
         .a(e, Boolean.valueOf($$3.a() == emv.c));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evd c(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.a();
   }

   @Override
   protected boolean a(drb $$0, drb $$1, it $$2) {
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

   public final boolean a(drb $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dhz || $$0.a(avw.L);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
