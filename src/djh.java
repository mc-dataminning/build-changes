import com.mojang.serialization.MapCodec;

public class djh extends dgz {
   public static final MapCodec<djh> i = b(djh::new);

   @Override
   public MapCodec<? extends djh> a() {
      return i;
   }

   protected djh(dtb.d $$0) {
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
   public dtc a(cyd $$0) {
      dbg $$1 = $$0.q();
      ir $$2 = $$0.a();
      epe $$3 = $$0.q().b_($$0.a());
      ir $$4 = $$2.e();
      ir $$5 = $$2.f();
      ir $$6 = $$2.g();
      ir $$7 = $$2.h();
      dtc $$8 = $$1.a_($$4);
      dtc $$9 = $$1.a_($$5);
      dtc $$10 = $$1.a_($$6);
      dtc $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, iw.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, iw.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, iw.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, iw.e))))
         .a(e, Boolean.valueOf($$3.a() == epf.c));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exn c(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.a();
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, iw $$2) {
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

   public final boolean a(dtc $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof djh || $$0.a(awe.L);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
