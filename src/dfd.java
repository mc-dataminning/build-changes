import com.mojang.serialization.MapCodec;

public class dfd extends cyu {
   public static final MapCodec<dfd> d = b(dfd::new);
   public static final dnc<dni> e = dmu.ag;

   @Override
   public MapCodec<dfd> a() {
      return d;
   }

   protected dfd(dmd.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dni.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3) {
      if ($$3.o().m() && new dfe($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dnh<dni> c() {
      return e;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      dni $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dni.a;
               case b:
                  yield dni.b;
               case c:
                  yield dni.d;
               case d:
                  yield dni.c;
               case e:
                  yield dni.f;
               case f:
                  yield dni.e;
               case g:
                  yield dni.i;
               case h:
                  yield dni.j;
               case i:
                  yield dni.g;
               case j:
                  yield dni.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dni.b;
               case b:
                  yield dni.a;
               case c:
                  yield dni.e;
               case d:
                  yield dni.f;
               case e:
                  yield dni.d;
               case f:
                  yield dni.c;
               case g:
                  yield dni.j;
               case h:
                  yield dni.g;
               case i:
                  yield dni.h;
               case j:
                  yield dni.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dni.b;
               case b:
                  yield dni.a;
               case c:
                  yield dni.f;
               case d:
                  yield dni.e;
               case e:
                  yield dni.c;
               case f:
                  yield dni.d;
               case g:
                  yield dni.h;
               case h:
                  yield dni.i;
               case i:
                  yield dni.j;
               case j:
                  yield dni.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      dni $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dni.f);
               case f:
                  return $$0.a(e, dni.e);
               case g:
                  return $$0.a(e, dni.j);
               case h:
                  return $$0.a(e, dni.i);
               case i:
                  return $$0.a(e, dni.h);
               case j:
                  return $$0.a(e, dni.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dni.d);
               case d:
                  return $$0.a(e, dni.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dni.h);
               case h:
                  return $$0.a(e, dni.g);
               case i:
                  return $$0.a(e, dni.j);
               case j:
                  return $$0.a(e, dni.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(e, c);
   }
}
