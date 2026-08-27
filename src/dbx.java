import com.mojang.serialization.MapCodec;

public class dbx extends cvo {
   public static final MapCodec<dbx> d = b(dbx::new);
   public static final djn<djt> e = djf.ag;

   @Override
   public MapCodec<dbx> a() {
      return d;
   }

   protected dbx(dio.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, djt.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dip $$0, csy $$1, hv $$2, cvz $$3) {
      if ($$3.o().m() && new dby($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public djs<djt> c() {
      return e;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      djt $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield djt.a;
               case b:
                  yield djt.b;
               case c:
                  yield djt.d;
               case d:
                  yield djt.c;
               case e:
                  yield djt.f;
               case f:
                  yield djt.e;
               case g:
                  yield djt.i;
               case h:
                  yield djt.j;
               case i:
                  yield djt.g;
               case j:
                  yield djt.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield djt.b;
               case b:
                  yield djt.a;
               case c:
                  yield djt.e;
               case d:
                  yield djt.f;
               case e:
                  yield djt.d;
               case f:
                  yield djt.c;
               case g:
                  yield djt.j;
               case h:
                  yield djt.g;
               case i:
                  yield djt.h;
               case j:
                  yield djt.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield djt.b;
               case b:
                  yield djt.a;
               case c:
                  yield djt.f;
               case d:
                  yield djt.e;
               case e:
                  yield djt.c;
               case f:
                  yield djt.d;
               case g:
                  yield djt.h;
               case h:
                  yield djt.i;
               case i:
                  yield djt.j;
               case j:
                  yield djt.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      djt $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, djt.f);
               case f:
                  return $$0.a(e, djt.e);
               case g:
                  return $$0.a(e, djt.j);
               case h:
                  return $$0.a(e, djt.i);
               case i:
                  return $$0.a(e, djt.h);
               case j:
                  return $$0.a(e, djt.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, djt.d);
               case d:
                  return $$0.a(e, djt.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, djt.h);
               case h:
                  return $$0.a(e, djt.g);
               case i:
                  return $$0.a(e, djt.j);
               case j:
                  return $$0.a(e, djt.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e, c);
   }
}
