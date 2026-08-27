import com.mojang.serialization.MapCodec;

public class dhw extends dbn {
   public static final MapCodec<dhw> d = b(dhw::new);
   public static final dpx<dqd> e = dpp.ag;

   @Override
   public MapCodec<dhw> a() {
      return d;
   }

   protected dhw(doy.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dqd.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3) {
      if ($$3.n().m() && new dhx($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dqc<dqd> c() {
      return e;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      dqd $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dqd.a;
               case b:
                  yield dqd.b;
               case c:
                  yield dqd.d;
               case d:
                  yield dqd.c;
               case e:
                  yield dqd.f;
               case f:
                  yield dqd.e;
               case g:
                  yield dqd.i;
               case h:
                  yield dqd.j;
               case i:
                  yield dqd.g;
               case j:
                  yield dqd.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dqd.b;
               case b:
                  yield dqd.a;
               case c:
                  yield dqd.e;
               case d:
                  yield dqd.f;
               case e:
                  yield dqd.d;
               case f:
                  yield dqd.c;
               case g:
                  yield dqd.j;
               case h:
                  yield dqd.g;
               case i:
                  yield dqd.h;
               case j:
                  yield dqd.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dqd.b;
               case b:
                  yield dqd.a;
               case c:
                  yield dqd.f;
               case d:
                  yield dqd.e;
               case e:
                  yield dqd.c;
               case f:
                  yield dqd.d;
               case g:
                  yield dqd.h;
               case h:
                  yield dqd.i;
               case i:
                  yield dqd.j;
               case j:
                  yield dqd.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      dqd $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dqd.f);
               case f:
                  return $$0.a(e, dqd.e);
               case g:
                  return $$0.a(e, dqd.j);
               case h:
                  return $$0.a(e, dqd.i);
               case i:
                  return $$0.a(e, dqd.h);
               case j:
                  return $$0.a(e, dqd.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dqd.d);
               case d:
                  return $$0.a(e, dqd.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dqd.h);
               case h:
                  return $$0.a(e, dqd.g);
               case i:
                  return $$0.a(e, dqd.j);
               case j:
                  return $$0.a(e, dqd.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e, c);
   }
}
