import com.mojang.serialization.MapCodec;

public class dco extends dak {
   public static final MapCodec<dco> i = b(dco::new);

   @Override
   public MapCodec<? extends dco> a() {
      return i;
   }

   protected dco(dle.d $$0) {
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
   public dlf a(crg $$0) {
      cut $$1 = $$0.q();
      hz $$2 = $$0.a();
      egp $$3 = $$0.q().b_($$0.a());
      hz $$4 = $$2.e();
      hz $$5 = $$2.f();
      hz $$6 = $$2.g();
      hz $$7 = $$2.h();
      dlf $$8 = $$1.a_($$4);
      dlf $$9 = $$1.a_($$5);
      dlf $$10 = $$1.a_($$6);
      dlf $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ie.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ie.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ie.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ie.e))))
         .a(e, Boolean.valueOf($$3.a() == egq.c));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eol c(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return eoi.a();
   }

   @Override
   protected boolean a(dlf $$0, dlf $$1, ie $$2) {
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

   public final boolean a(dlf $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dco || $$0.a(atz.L);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
