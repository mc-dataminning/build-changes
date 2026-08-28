import com.mojang.serialization.MapCodec;

public class doy extends dmr {
   public static final MapCodec<doy> g = b(doy::new);

   @Override
   public MapCodec<? extends doy> a() {
      return g;
   }

   protected doy(dyl.d $$0) {
      super(2.0F, 16.0F, 2.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.B
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dym a(dbn $$0) {
      dgv $$1 = $$0.q();
      jj $$2 = $$0.a();
      eut $$3 = $$0.q().b_($$0.a());
      jj $$4 = $$2.f();
      jj $$5 = $$2.g();
      jj $$6 = $$2.h();
      jj $$7 = $$2.i();
      dym $$8 = $$1.a_($$4);
      dym $$9 = $$1.a_($$5);
      dym $$10 = $$1.a_($$6);
      dym $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jo.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jo.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jo.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jo.e))))
         .b(e, Boolean.valueOf($$3.a() == euu.c));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.a();
   }

   @Override
   protected boolean b(dym $$0, dym $$1, jo $$2) {
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

   public final boolean a(dym $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof doy || $$0.a(awz.N);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
