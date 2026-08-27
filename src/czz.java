import com.mojang.serialization.MapCodec;

public class czz extends cxv {
   public static final MapCodec<czz> i = b(czz::new);

   @Override
   public MapCodec<? extends czz> a() {
      return i;
   }

   protected czz(dio.d $$0) {
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
   public dip a(coq $$0) {
      cse $$1 = $$0.q();
      hv $$2 = $$0.a();
      edz $$3 = $$0.q().b_($$0.a());
      hv $$4 = $$2.e();
      hv $$5 = $$2.f();
      hv $$6 = $$2.g();
      hv $$7 = $$2.h();
      dip $$8 = $$1.a_($$4);
      dip $$9 = $$1.a_($$5);
      dip $$10 = $$1.a_($$6);
      dip $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ia.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ia.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ia.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ia.e))))
         .a(e, Boolean.valueOf($$3.a() == eea.c));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public elu c(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.a();
   }

   @Override
   public boolean a(dip $$0, dip $$1, ia $$2) {
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

   public final boolean a(dip $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof czz || $$0.a(arr.L);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
