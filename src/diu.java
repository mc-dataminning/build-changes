import com.mojang.serialization.MapCodec;

public class diu extends dck {
   public static final MapCodec<diu> d = b(diu::new);
   public static final dqw<drc> e = dqo.ag;

   @Override
   public MapCodec<diu> a() {
      return d;
   }

   protected diu(dpx.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, drc.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3) {
      if ($$3.n().m() && new div($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public drb<drc> c() {
      return e;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      drc $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield drc.a;
               case b:
                  yield drc.b;
               case c:
                  yield drc.d;
               case d:
                  yield drc.c;
               case e:
                  yield drc.f;
               case f:
                  yield drc.e;
               case g:
                  yield drc.i;
               case h:
                  yield drc.j;
               case i:
                  yield drc.g;
               case j:
                  yield drc.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield drc.b;
               case b:
                  yield drc.a;
               case c:
                  yield drc.e;
               case d:
                  yield drc.f;
               case e:
                  yield drc.d;
               case f:
                  yield drc.c;
               case g:
                  yield drc.j;
               case h:
                  yield drc.g;
               case i:
                  yield drc.h;
               case j:
                  yield drc.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield drc.b;
               case b:
                  yield drc.a;
               case c:
                  yield drc.f;
               case d:
                  yield drc.e;
               case e:
                  yield drc.c;
               case f:
                  yield drc.d;
               case g:
                  yield drc.h;
               case h:
                  yield drc.i;
               case i:
                  yield drc.j;
               case j:
                  yield drc.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      drc $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, drc.f);
               case f:
                  return $$0.a(e, drc.e);
               case g:
                  return $$0.a(e, drc.j);
               case h:
                  return $$0.a(e, drc.i);
               case i:
                  return $$0.a(e, drc.h);
               case j:
                  return $$0.a(e, drc.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, drc.d);
               case d:
                  return $$0.a(e, drc.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, drc.h);
               case h:
                  return $$0.a(e, drc.g);
               case i:
                  return $$0.a(e, drc.j);
               case j:
                  return $$0.a(e, drc.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(e, c);
   }
}
