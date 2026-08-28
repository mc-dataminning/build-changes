import com.mojang.serialization.MapCodec;

public class dlk extends djf {
   public static final MapCodec<dlk> i = b(dlk::new);

   @Override
   public MapCodec<? extends dlk> a() {
      return i;
   }

   protected dlk(dun.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public duo a(czk $$0) {
      ddl $$1 = $$0.q();
      je $$2 = $$0.a();
      eqp $$3 = $$0.q().b_($$0.a());
      je $$4 = $$2.f();
      je $$5 = $$2.g();
      je $$6 = $$2.h();
      je $$7 = $$2.i();
      duo $$8 = $$1.a_($$4);
      duo $$9 = $$1.a_($$5);
      duo $$10 = $$1.a_($$6);
      duo $$11 = $$1.a_($$7);
      return this.o()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jj.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jj.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jj.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jj.e))))
         .b(e, Boolean.valueOf($$3.a() == eqq.c));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezm c(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.a();
   }

   @Override
   protected boolean b(duo $$0, duo $$1, jj $$2) {
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

   public final boolean a(duo $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dlk || $$0.a(awt.M);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
