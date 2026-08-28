import com.mojang.serialization.MapCodec;

public class dkx extends den {
   public static final MapCodec<dkx> d = b(dkx::new);
   public static final dsz<dtf> e = dsr.ag;

   @Override
   public MapCodec<dkx> a() {
      return d;
   }

   protected dkx(dsa.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dtf.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3) {
      if ($$3.o().m() && new dky($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dte<dtf> c() {
      return e;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      dtf $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dtf.a;
               case b:
                  yield dtf.b;
               case c:
                  yield dtf.d;
               case d:
                  yield dtf.c;
               case e:
                  yield dtf.f;
               case f:
                  yield dtf.e;
               case g:
                  yield dtf.i;
               case h:
                  yield dtf.j;
               case i:
                  yield dtf.g;
               case j:
                  yield dtf.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dtf.b;
               case b:
                  yield dtf.a;
               case c:
                  yield dtf.e;
               case d:
                  yield dtf.f;
               case e:
                  yield dtf.d;
               case f:
                  yield dtf.c;
               case g:
                  yield dtf.j;
               case h:
                  yield dtf.g;
               case i:
                  yield dtf.h;
               case j:
                  yield dtf.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dtf.b;
               case b:
                  yield dtf.a;
               case c:
                  yield dtf.f;
               case d:
                  yield dtf.e;
               case e:
                  yield dtf.c;
               case f:
                  yield dtf.d;
               case g:
                  yield dtf.h;
               case h:
                  yield dtf.i;
               case i:
                  yield dtf.j;
               case j:
                  yield dtf.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      dtf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtf.f);
               case f:
                  return $$0.a(e, dtf.e);
               case g:
                  return $$0.a(e, dtf.j);
               case h:
                  return $$0.a(e, dtf.i);
               case i:
                  return $$0.a(e, dtf.h);
               case j:
                  return $$0.a(e, dtf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtf.d);
               case d:
                  return $$0.a(e, dtf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtf.h);
               case h:
                  return $$0.a(e, dtf.g);
               case i:
                  return $$0.a(e, dtf.j);
               case j:
                  return $$0.a(e, dtf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(e, c);
   }
}
