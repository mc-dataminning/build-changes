import com.mojang.serialization.MapCodec;

public class djx extends ddn {
   public static final MapCodec<djx> d = b(djx::new);
   public static final drz<dsf> e = drr.ag;

   @Override
   public MapCodec<djx> a() {
      return d;
   }

   protected djx(dra.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dsf.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3) {
      if ($$3.n().m() && new djy($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dse<dsf> c() {
      return e;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      dsf $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dsf.a;
               case b:
                  yield dsf.b;
               case c:
                  yield dsf.d;
               case d:
                  yield dsf.c;
               case e:
                  yield dsf.f;
               case f:
                  yield dsf.e;
               case g:
                  yield dsf.i;
               case h:
                  yield dsf.j;
               case i:
                  yield dsf.g;
               case j:
                  yield dsf.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dsf.b;
               case b:
                  yield dsf.a;
               case c:
                  yield dsf.e;
               case d:
                  yield dsf.f;
               case e:
                  yield dsf.d;
               case f:
                  yield dsf.c;
               case g:
                  yield dsf.j;
               case h:
                  yield dsf.g;
               case i:
                  yield dsf.h;
               case j:
                  yield dsf.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dsf.b;
               case b:
                  yield dsf.a;
               case c:
                  yield dsf.f;
               case d:
                  yield dsf.e;
               case e:
                  yield dsf.c;
               case f:
                  yield dsf.d;
               case g:
                  yield dsf.h;
               case h:
                  yield dsf.i;
               case i:
                  yield dsf.j;
               case j:
                  yield dsf.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      dsf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dsf.f);
               case f:
                  return $$0.a(e, dsf.e);
               case g:
                  return $$0.a(e, dsf.j);
               case h:
                  return $$0.a(e, dsf.i);
               case i:
                  return $$0.a(e, dsf.h);
               case j:
                  return $$0.a(e, dsf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dsf.d);
               case d:
                  return $$0.a(e, dsf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dsf.h);
               case h:
                  return $$0.a(e, dsf.g);
               case i:
                  return $$0.a(e, dsf.j);
               case j:
                  return $$0.a(e, dsf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e, c);
   }
}
