import com.mojang.serialization.MapCodec;

public class cyt extends cwo {
   public static final MapCodec<cyt> i = b(cyt::new);

   @Override
   public MapCodec<? extends cyt> a() {
      return i;
   }

   protected cyt(dgv.d $$0) {
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
   public dgw a(cnj $$0) {
      cqy $$1 = $$0.q();
      ht $$2 = $$0.a();
      ecg $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.f();
      ht $$6 = $$2.g();
      ht $$7 = $$2.h();
      dgw $$8 = $$1.a_($$4);
      dgw $$9 = $$1.a_($$5);
      dgw $$10 = $$1.a_($$6);
      dgw $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hx.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hx.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hx.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hx.e))))
         .a(e, Boolean.valueOf($$3.a() == ech.c));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekb b(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ejy.a();
   }

   @Override
   public boolean a(dgw $$0, dgw $$1, hx $$2) {
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

   public final boolean a(dgw $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof cyt || $$0.a(arc.L);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
