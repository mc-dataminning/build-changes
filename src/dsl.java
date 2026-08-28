import com.mojang.serialization.MapCodec;

public class dsl extends dlu {
   public static final MapCodec<dsl> b = b(dsl::new);
   public static final ebf<ebl> c = eax.aj;

   @Override
   public MapCodec<dsl> a() {
      return b;
   }

   protected dsl(eag.d $$0) {
      super(false, $$0);
      this.l(this.C.b().b(c, ebl.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3) {
      if ($$3.m().p() && new dsm($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ebk<ebl> c() {
      return c;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      ebl $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield ebl.a;
               case b:
                  yield ebl.b;
               case c:
                  yield ebl.d;
               case d:
                  yield ebl.c;
               case e:
                  yield ebl.f;
               case f:
                  yield ebl.e;
               case g:
                  yield ebl.i;
               case h:
                  yield ebl.j;
               case i:
                  yield ebl.g;
               case j:
                  yield ebl.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield ebl.b;
               case b:
                  yield ebl.a;
               case c:
                  yield ebl.e;
               case d:
                  yield ebl.f;
               case e:
                  yield ebl.d;
               case f:
                  yield ebl.c;
               case g:
                  yield ebl.j;
               case h:
                  yield ebl.g;
               case i:
                  yield ebl.h;
               case j:
                  yield ebl.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield ebl.b;
               case b:
                  yield ebl.a;
               case c:
                  yield ebl.f;
               case d:
                  yield ebl.e;
               case e:
                  yield ebl.c;
               case f:
                  yield ebl.d;
               case g:
                  yield ebl.h;
               case h:
                  yield ebl.i;
               case i:
                  yield ebl.j;
               case j:
                  yield ebl.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      ebl $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebl.f);
               case f:
                  return $$0.b(c, ebl.e);
               case g:
                  return $$0.b(c, ebl.j);
               case h:
                  return $$0.b(c, ebl.i);
               case i:
                  return $$0.b(c, ebl.h);
               case j:
                  return $$0.b(c, ebl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebl.d);
               case d:
                  return $$0.b(c, ebl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebl.h);
               case h:
                  return $$0.b(c, ebl.g);
               case i:
                  return $$0.b(c, ebl.j);
               case j:
                  return $$0.b(c, ebl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, a);
   }
}
