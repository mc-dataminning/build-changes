import com.mojang.serialization.MapCodec;

public class dbd extends cuu {
   public static final MapCodec<dbd> d = b(dbd::new);
   public static final dil<dir> e = did.ag;

   @Override
   public MapCodec<dbd> a() {
      return d;
   }

   protected dbd(dhm.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dir.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhn $$0, csf $$1, hx $$2, cvf $$3) {
      if ($$3.o().m() && new dbe($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public diq<dir> c() {
      return e;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      dir $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dir.a;
               case b:
                  yield dir.b;
               case c:
                  yield dir.d;
               case d:
                  yield dir.c;
               case e:
                  yield dir.f;
               case f:
                  yield dir.e;
               case g:
                  yield dir.i;
               case h:
                  yield dir.j;
               case i:
                  yield dir.g;
               case j:
                  yield dir.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dir.b;
               case b:
                  yield dir.a;
               case c:
                  yield dir.e;
               case d:
                  yield dir.f;
               case e:
                  yield dir.d;
               case f:
                  yield dir.c;
               case g:
                  yield dir.j;
               case h:
                  yield dir.g;
               case i:
                  yield dir.h;
               case j:
                  yield dir.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dir.b;
               case b:
                  yield dir.a;
               case c:
                  yield dir.f;
               case d:
                  yield dir.e;
               case e:
                  yield dir.c;
               case f:
                  yield dir.d;
               case g:
                  yield dir.h;
               case h:
                  yield dir.i;
               case i:
                  yield dir.j;
               case j:
                  yield dir.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      dir $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dir.f);
               case f:
                  return $$0.a(e, dir.e);
               case g:
                  return $$0.a(e, dir.j);
               case h:
                  return $$0.a(e, dir.i);
               case i:
                  return $$0.a(e, dir.h);
               case j:
                  return $$0.a(e, dir.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dir.d);
               case d:
                  return $$0.a(e, dir.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dir.h);
               case h:
                  return $$0.a(e, dir.g);
               case i:
                  return $$0.a(e, dir.j);
               case j:
                  return $$0.a(e, dir.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(e, c);
   }
}
