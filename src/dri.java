import com.mojang.serialization.MapCodec;

public class dri extends dpa {
   public static final MapCodec<dri> g = b(dri::new);

   @Override
   public MapCodec<? extends dri> a() {
      return g;
   }

   protected dri(ebd.d $$0) {
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
   public ebe a(ddr $$0) {
      djb $$1 = $$0.q();
      iv $$2 = $$0.a();
      exo $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.g();
      iv $$6 = $$2.h();
      iv $$7 = $$2.i();
      ebe $$8 = $$1.a_($$4);
      ebe $$9 = $$1.a_($$5);
      ebe $$10 = $$1.a_($$6);
      ebe $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jb.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jb.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jb.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jb.e))))
         .b(e, Boolean.valueOf($$3.a() == exp.c));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.a();
   }

   @Override
   protected boolean b(ebe $$0, ebe $$1, jb $$2) {
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

   public final boolean a(ebe $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dri || $$0.a(axe.N);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
