import com.mojang.serialization.MapCodec;

public class div extends dgq {
   public static final MapCodec<div> i = b(div::new);

   @Override
   public MapCodec<? extends div> a() {
      return i;
   }

   protected div(drw.d $$0) {
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
   public drx a(cxv $$0) {
      daz $$1 = $$0.q();
      iz $$2 = $$0.a();
      enq $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.f();
      iz $$6 = $$2.g();
      iz $$7 = $$2.h();
      drx $$8 = $$1.a_($$4);
      drx $$9 = $$1.a_($$5);
      drx $$10 = $$1.a_($$6);
      drx $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.e))))
         .a(e, Boolean.valueOf($$3.a() == enr.c));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.a();
   }

   @Override
   protected boolean a(drx $$0, drx $$1, je $$2) {
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

   public final boolean a(drx $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof div || $$0.a(awl.L);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
