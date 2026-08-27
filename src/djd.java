import com.mojang.serialization.MapCodec;

public class djd extends dct {
   public static final MapCodec<djd> d = b(djd::new);
   public static final drf<drl> e = dqx.ag;

   @Override
   public MapCodec<djd> a() {
      return d;
   }

   protected djd(dqg.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, drl.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3) {
      if ($$3.n().m() && new dje($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public drk<drl> c() {
      return e;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      drl $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield drl.a;
               case b:
                  yield drl.b;
               case c:
                  yield drl.d;
               case d:
                  yield drl.c;
               case e:
                  yield drl.f;
               case f:
                  yield drl.e;
               case g:
                  yield drl.i;
               case h:
                  yield drl.j;
               case i:
                  yield drl.g;
               case j:
                  yield drl.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield drl.b;
               case b:
                  yield drl.a;
               case c:
                  yield drl.e;
               case d:
                  yield drl.f;
               case e:
                  yield drl.d;
               case f:
                  yield drl.c;
               case g:
                  yield drl.j;
               case h:
                  yield drl.g;
               case i:
                  yield drl.h;
               case j:
                  yield drl.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield drl.b;
               case b:
                  yield drl.a;
               case c:
                  yield drl.f;
               case d:
                  yield drl.e;
               case e:
                  yield drl.c;
               case f:
                  yield drl.d;
               case g:
                  yield drl.h;
               case h:
                  yield drl.i;
               case i:
                  yield drl.j;
               case j:
                  yield drl.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      drl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, drl.f);
               case f:
                  return $$0.a(e, drl.e);
               case g:
                  return $$0.a(e, drl.j);
               case h:
                  return $$0.a(e, drl.i);
               case i:
                  return $$0.a(e, drl.h);
               case j:
                  return $$0.a(e, drl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, drl.d);
               case d:
                  return $$0.a(e, drl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, drl.h);
               case h:
                  return $$0.a(e, drl.g);
               case i:
                  return $$0.a(e, drl.j);
               case j:
                  return $$0.a(e, drl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e, c);
   }
}
