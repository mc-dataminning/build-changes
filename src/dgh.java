import com.mojang.serialization.MapCodec;

public class dgh extends ded {
   public static final MapCodec<dgh> i = b(dgh::new);

   @Override
   public MapCodec<? extends dgh> a() {
      return i;
   }

   protected dgh(dph.d $$0) {
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
   public dpi a(cux $$0) {
      cym $$1 = $$0.q();
      id $$2 = $$0.a();
      elb $$3 = $$0.q().b_($$0.a());
      id $$4 = $$2.e();
      id $$5 = $$2.f();
      id $$6 = $$2.g();
      id $$7 = $$2.h();
      dpi $$8 = $$1.a_($$4);
      dpi $$9 = $$1.a_($$5);
      dpi $$10 = $$1.a_($$6);
      dpi $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ij.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ij.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ij.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ij.e))))
         .a(e, Boolean.valueOf($$3.a() == elc.c));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected etc c(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.a();
   }

   @Override
   protected boolean a(dpi $$0, dpi $$1, ij $$2) {
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

   public final boolean a(dpi $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dgh || $$0.a(ave.L);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
