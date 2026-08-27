import com.mojang.serialization.MapCodec;

public class dif extends dbw {
   public static final MapCodec<dif> d = b(dif::new);
   public static final dqg<dqm> e = dpy.ag;

   @Override
   public MapCodec<dif> a() {
      return d;
   }

   protected dif(dph.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dqm.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3) {
      if ($$3.n().m() && new dig($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dql<dqm> c() {
      return e;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      dqm $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dqm.a;
               case b:
                  yield dqm.b;
               case c:
                  yield dqm.d;
               case d:
                  yield dqm.c;
               case e:
                  yield dqm.f;
               case f:
                  yield dqm.e;
               case g:
                  yield dqm.i;
               case h:
                  yield dqm.j;
               case i:
                  yield dqm.g;
               case j:
                  yield dqm.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dqm.b;
               case b:
                  yield dqm.a;
               case c:
                  yield dqm.e;
               case d:
                  yield dqm.f;
               case e:
                  yield dqm.d;
               case f:
                  yield dqm.c;
               case g:
                  yield dqm.j;
               case h:
                  yield dqm.g;
               case i:
                  yield dqm.h;
               case j:
                  yield dqm.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dqm.b;
               case b:
                  yield dqm.a;
               case c:
                  yield dqm.f;
               case d:
                  yield dqm.e;
               case e:
                  yield dqm.c;
               case f:
                  yield dqm.d;
               case g:
                  yield dqm.h;
               case h:
                  yield dqm.i;
               case i:
                  yield dqm.j;
               case j:
                  yield dqm.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      dqm $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dqm.f);
               case f:
                  return $$0.a(e, dqm.e);
               case g:
                  return $$0.a(e, dqm.j);
               case h:
                  return $$0.a(e, dqm.i);
               case i:
                  return $$0.a(e, dqm.h);
               case j:
                  return $$0.a(e, dqm.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dqm.d);
               case d:
                  return $$0.a(e, dqm.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dqm.h);
               case h:
                  return $$0.a(e, dqm.g);
               case i:
                  return $$0.a(e, dqm.j);
               case j:
                  return $$0.a(e, dqm.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e, c);
   }
}
