import com.mojang.serialization.MapCodec;

public class czx extends ctp {
   public static final MapCodec<czx> d = b(czx::new);
   public static final dgz<dhf> e = dgr.ag;

   @Override
   public MapCodec<czx> a() {
      return d;
   }

   protected czx(dga.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dhf.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgb $$0, cqz $$1, ht $$2, cua $$3) {
      if ($$3.o().m() && new czy($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dhe<dhf> c() {
      return e;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      dhf $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dhf.a;
               case b:
                  yield dhf.b;
               case c:
                  yield dhf.d;
               case d:
                  yield dhf.c;
               case e:
                  yield dhf.f;
               case f:
                  yield dhf.e;
               case g:
                  yield dhf.i;
               case h:
                  yield dhf.j;
               case i:
                  yield dhf.g;
               case j:
                  yield dhf.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dhf.b;
               case b:
                  yield dhf.a;
               case c:
                  yield dhf.e;
               case d:
                  yield dhf.f;
               case e:
                  yield dhf.d;
               case f:
                  yield dhf.c;
               case g:
                  yield dhf.j;
               case h:
                  yield dhf.g;
               case i:
                  yield dhf.h;
               case j:
                  yield dhf.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dhf.b;
               case b:
                  yield dhf.a;
               case c:
                  yield dhf.f;
               case d:
                  yield dhf.e;
               case e:
                  yield dhf.c;
               case f:
                  yield dhf.d;
               case g:
                  yield dhf.h;
               case h:
                  yield dhf.i;
               case i:
                  yield dhf.j;
               case j:
                  yield dhf.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      dhf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dhf.f);
               case f:
                  return $$0.a(e, dhf.e);
               case g:
                  return $$0.a(e, dhf.j);
               case h:
                  return $$0.a(e, dhf.i);
               case i:
                  return $$0.a(e, dhf.h);
               case j:
                  return $$0.a(e, dhf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dhf.d);
               case d:
                  return $$0.a(e, dhf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dhf.h);
               case h:
                  return $$0.a(e, dhf.g);
               case i:
                  return $$0.a(e, dhf.j);
               case j:
                  return $$0.a(e, dhf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(e, c);
   }
}
