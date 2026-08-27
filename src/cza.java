import com.mojang.serialization.MapCodec;

public class cza extends cww {
   public static final MapCodec<cza> i = b(cza::new);

   @Override
   public MapCodec<? extends cza> a() {
      return i;
   }

   protected cza(dhh.d $$0) {
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
   public dhi a(cnr $$0) {
      crg $$1 = $$0.q();
      ht $$2 = $$0.a();
      ecs $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.f();
      ht $$6 = $$2.g();
      ht $$7 = $$2.h();
      dhi $$8 = $$1.a_($$4);
      dhi $$9 = $$1.a_($$5);
      dhi $$10 = $$1.a_($$6);
      dhi $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hx.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hx.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hx.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hx.e))))
         .a(e, Boolean.valueOf($$3.a() == ect.c));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekn c(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ekk.a();
   }

   @Override
   public boolean a(dhi $$0, dhi $$1, hx $$2) {
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

   public final boolean a(dhi $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof cza || $$0.a(arg.L);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
