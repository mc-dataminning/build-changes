import com.mojang.serialization.MapCodec;

public class cyz extends csr {
   public static final MapCodec<cyz> d = b(cyz::new);
   public static final dgb<dgh> e = dft.ag;

   @Override
   public MapCodec<cyz> a() {
      return d;
   }

   protected cyz(dfc.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dgh.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfd $$0, cqb $$1, gw $$2, ctc $$3) {
      if ($$3.o().m() && new cza($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dgg<dgh> c() {
      return e;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      dgh $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dgh.a;
               case b:
                  yield dgh.b;
               case c:
                  yield dgh.d;
               case d:
                  yield dgh.c;
               case e:
                  yield dgh.f;
               case f:
                  yield dgh.e;
               case g:
                  yield dgh.i;
               case h:
                  yield dgh.j;
               case i:
                  yield dgh.g;
               case j:
                  yield dgh.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dgh.b;
               case b:
                  yield dgh.a;
               case c:
                  yield dgh.e;
               case d:
                  yield dgh.f;
               case e:
                  yield dgh.d;
               case f:
                  yield dgh.c;
               case g:
                  yield dgh.j;
               case h:
                  yield dgh.g;
               case i:
                  yield dgh.h;
               case j:
                  yield dgh.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dgh.b;
               case b:
                  yield dgh.a;
               case c:
                  yield dgh.f;
               case d:
                  yield dgh.e;
               case e:
                  yield dgh.c;
               case f:
                  yield dgh.d;
               case g:
                  yield dgh.h;
               case h:
                  yield dgh.i;
               case i:
                  yield dgh.j;
               case j:
                  yield dgh.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      dgh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dgh.f);
               case f:
                  return $$0.a(e, dgh.e);
               case g:
                  return $$0.a(e, dgh.j);
               case h:
                  return $$0.a(e, dgh.i);
               case i:
                  return $$0.a(e, dgh.h);
               case j:
                  return $$0.a(e, dgh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dgh.d);
               case d:
                  return $$0.a(e, dgh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dgh.h);
               case h:
                  return $$0.a(e, dgh.g);
               case i:
                  return $$0.a(e, dgh.j);
               case j:
                  return $$0.a(e, dgh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e, c);
   }
}
