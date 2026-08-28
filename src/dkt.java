import com.mojang.serialization.MapCodec;

public class dkt extends dej {
   public static final MapCodec<dkt> d = b(dkt::new);
   public static final dsv<dtb> e = dsn.ag;

   @Override
   public MapCodec<dkt> a() {
      return d;
   }

   protected dkt(drw.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dtb.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3) {
      if ($$3.n().m() && new dku($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dta<dtb> c() {
      return e;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      dtb $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dtb.a;
               case b:
                  yield dtb.b;
               case c:
                  yield dtb.d;
               case d:
                  yield dtb.c;
               case e:
                  yield dtb.f;
               case f:
                  yield dtb.e;
               case g:
                  yield dtb.i;
               case h:
                  yield dtb.j;
               case i:
                  yield dtb.g;
               case j:
                  yield dtb.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dtb.b;
               case b:
                  yield dtb.a;
               case c:
                  yield dtb.e;
               case d:
                  yield dtb.f;
               case e:
                  yield dtb.d;
               case f:
                  yield dtb.c;
               case g:
                  yield dtb.j;
               case h:
                  yield dtb.g;
               case i:
                  yield dtb.h;
               case j:
                  yield dtb.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dtb.b;
               case b:
                  yield dtb.a;
               case c:
                  yield dtb.f;
               case d:
                  yield dtb.e;
               case e:
                  yield dtb.c;
               case f:
                  yield dtb.d;
               case g:
                  yield dtb.h;
               case h:
                  yield dtb.i;
               case i:
                  yield dtb.j;
               case j:
                  yield dtb.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      dtb $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtb.f);
               case f:
                  return $$0.a(e, dtb.e);
               case g:
                  return $$0.a(e, dtb.j);
               case h:
                  return $$0.a(e, dtb.i);
               case i:
                  return $$0.a(e, dtb.h);
               case j:
                  return $$0.a(e, dtb.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtb.d);
               case d:
                  return $$0.a(e, dtb.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtb.h);
               case h:
                  return $$0.a(e, dtb.g);
               case i:
                  return $$0.a(e, dtb.j);
               case j:
                  return $$0.a(e, dtb.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(e, c);
   }
}
