import com.mojang.serialization.MapCodec;

public class dqx extends dop {
   public static final MapCodec<dqx> g = b(dqx::new);

   @Override
   public MapCodec<? extends dqx> a() {
      return g;
   }

   protected dqx(eas.d $$0) {
      super(2.0F, 16.0F, 2.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public eat a(ddg $$0) {
      diq $$1 = $$0.q();
      iv $$2 = $$0.a();
      exa $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.g();
      iv $$6 = $$2.h();
      iv $$7 = $$2.i();
      eat $$8 = $$1.a_($$4);
      eat $$9 = $$1.a_($$5);
      eat $$10 = $$1.a_($$6);
      eat $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jb.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jb.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jb.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jb.e))))
         .b(e, Boolean.valueOf($$3.a() == exb.c));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffw c(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.a();
   }

   @Override
   protected boolean b(eat $$0, eat $$1, jb $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.b($$0, $$1, $$2);
   }

   public final boolean a(eat $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dqx || $$0.a(axc.N);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
