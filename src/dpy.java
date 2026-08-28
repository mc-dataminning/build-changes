import com.mojang.serialization.MapCodec;

public class dpy extends dnr {
   public static final MapCodec<dpy> g = b(dpy::new);

   @Override
   public MapCodec<? extends dpy> a() {
      return g;
   }

   protected dpy(dzn.d $$0) {
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
   public dzo a(dcl $$0) {
      dhv $$1 = $$0.q();
      iu $$2 = $$0.a();
      evv $$3 = $$0.q().b_($$0.a());
      iu $$4 = $$2.f();
      iu $$5 = $$2.g();
      iu $$6 = $$2.h();
      iu $$7 = $$2.i();
      dzo $$8 = $$1.a_($$4);
      dzo $$9 = $$1.a_($$5);
      dzo $$10 = $$1.a_($$6);
      dzo $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, ja.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, ja.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, ja.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, ja.e))))
         .b(e, Boolean.valueOf($$3.a() == evw.c));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected feq c(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.a();
   }

   @Override
   protected boolean b(dzo $$0, dzo $$1, ja $$2) {
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

   public final boolean a(dzo $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dpy || $$0.a(axa.N);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
