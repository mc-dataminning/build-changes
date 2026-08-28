import com.mojang.serialization.MapCodec;

public class dle extends deu {
   public static final MapCodec<dle> d = b(dle::new);
   public static final dtf<dtl> e = dsx.ag;

   @Override
   public MapCodec<dle> a() {
      return d;
   }

   protected dle(dsg.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dtl.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3) {
      if ($$3.o().m() && new dlf($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dtk<dtl> c() {
      return e;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      dtl $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dtl.a;
               case b:
                  yield dtl.b;
               case c:
                  yield dtl.d;
               case d:
                  yield dtl.c;
               case e:
                  yield dtl.f;
               case f:
                  yield dtl.e;
               case g:
                  yield dtl.i;
               case h:
                  yield dtl.j;
               case i:
                  yield dtl.g;
               case j:
                  yield dtl.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dtl.b;
               case b:
                  yield dtl.a;
               case c:
                  yield dtl.e;
               case d:
                  yield dtl.f;
               case e:
                  yield dtl.d;
               case f:
                  yield dtl.c;
               case g:
                  yield dtl.j;
               case h:
                  yield dtl.g;
               case i:
                  yield dtl.h;
               case j:
                  yield dtl.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dtl.b;
               case b:
                  yield dtl.a;
               case c:
                  yield dtl.f;
               case d:
                  yield dtl.e;
               case e:
                  yield dtl.c;
               case f:
                  yield dtl.d;
               case g:
                  yield dtl.h;
               case h:
                  yield dtl.i;
               case i:
                  yield dtl.j;
               case j:
                  yield dtl.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      dtl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtl.f);
               case f:
                  return $$0.a(e, dtl.e);
               case g:
                  return $$0.a(e, dtl.j);
               case h:
                  return $$0.a(e, dtl.i);
               case i:
                  return $$0.a(e, dtl.h);
               case j:
                  return $$0.a(e, dtl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtl.d);
               case d:
                  return $$0.a(e, dtl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtl.h);
               case h:
                  return $$0.a(e, dtl.g);
               case i:
                  return $$0.a(e, dtl.j);
               case j:
                  return $$0.a(e, dtl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e, c);
   }
}
