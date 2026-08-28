import com.mojang.serialization.MapCodec;

public class dky extends deo {
   public static final MapCodec<dky> d = b(dky::new);
   public static final dta<dtg> e = dss.ag;

   @Override
   public MapCodec<dky> a() {
      return d;
   }

   protected dky(dsb.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dtg.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3) {
      if ($$3.o().m() && new dkz($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dtf<dtg> c() {
      return e;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      dtg $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dtg.a;
               case b:
                  yield dtg.b;
               case c:
                  yield dtg.d;
               case d:
                  yield dtg.c;
               case e:
                  yield dtg.f;
               case f:
                  yield dtg.e;
               case g:
                  yield dtg.i;
               case h:
                  yield dtg.j;
               case i:
                  yield dtg.g;
               case j:
                  yield dtg.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dtg.b;
               case b:
                  yield dtg.a;
               case c:
                  yield dtg.e;
               case d:
                  yield dtg.f;
               case e:
                  yield dtg.d;
               case f:
                  yield dtg.c;
               case g:
                  yield dtg.j;
               case h:
                  yield dtg.g;
               case i:
                  yield dtg.h;
               case j:
                  yield dtg.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dtg.b;
               case b:
                  yield dtg.a;
               case c:
                  yield dtg.f;
               case d:
                  yield dtg.e;
               case e:
                  yield dtg.c;
               case f:
                  yield dtg.d;
               case g:
                  yield dtg.h;
               case h:
                  yield dtg.i;
               case i:
                  yield dtg.j;
               case j:
                  yield dtg.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      dtg $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtg.f);
               case f:
                  return $$0.a(e, dtg.e);
               case g:
                  return $$0.a(e, dtg.j);
               case h:
                  return $$0.a(e, dtg.i);
               case i:
                  return $$0.a(e, dtg.h);
               case j:
                  return $$0.a(e, dtg.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtg.d);
               case d:
                  return $$0.a(e, dtg.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtg.h);
               case h:
                  return $$0.a(e, dtg.g);
               case i:
                  return $$0.a(e, dtg.j);
               case j:
                  return $$0.a(e, dtg.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(e, c);
   }
}
