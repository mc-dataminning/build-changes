import com.mojang.serialization.MapCodec;

public class dkw extends dem {
   public static final MapCodec<dkw> d = b(dkw::new);
   public static final dsy<dte> e = dsq.ag;

   @Override
   public MapCodec<dkw> a() {
      return d;
   }

   protected dkw(drz.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dte.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3) {
      if ($$3.o().m() && new dkx($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dtd<dte> c() {
      return e;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      dte $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dte.a;
               case b:
                  yield dte.b;
               case c:
                  yield dte.d;
               case d:
                  yield dte.c;
               case e:
                  yield dte.f;
               case f:
                  yield dte.e;
               case g:
                  yield dte.i;
               case h:
                  yield dte.j;
               case i:
                  yield dte.g;
               case j:
                  yield dte.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dte.b;
               case b:
                  yield dte.a;
               case c:
                  yield dte.e;
               case d:
                  yield dte.f;
               case e:
                  yield dte.d;
               case f:
                  yield dte.c;
               case g:
                  yield dte.j;
               case h:
                  yield dte.g;
               case i:
                  yield dte.h;
               case j:
                  yield dte.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dte.b;
               case b:
                  yield dte.a;
               case c:
                  yield dte.f;
               case d:
                  yield dte.e;
               case e:
                  yield dte.c;
               case f:
                  yield dte.d;
               case g:
                  yield dte.h;
               case h:
                  yield dte.i;
               case i:
                  yield dte.j;
               case j:
                  yield dte.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      dte $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dte.f);
               case f:
                  return $$0.a(e, dte.e);
               case g:
                  return $$0.a(e, dte.j);
               case h:
                  return $$0.a(e, dte.i);
               case i:
                  return $$0.a(e, dte.h);
               case j:
                  return $$0.a(e, dte.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dte.d);
               case d:
                  return $$0.a(e, dte.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dte.h);
               case h:
                  return $$0.a(e, dte.g);
               case i:
                  return $$0.a(e, dte.j);
               case j:
                  return $$0.a(e, dte.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(e, c);
   }
}
