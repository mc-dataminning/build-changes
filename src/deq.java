import com.mojang.serialization.MapCodec;

public class deq extends cyh {
   public static final MapCodec<deq> d = b(deq::new);
   public static final dmh<dmn> e = dlz.ag;

   @Override
   public MapCodec<deq> a() {
      return d;
   }

   protected deq(dli.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dmn.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3) {
      if ($$3.o().m() && new der($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dmm<dmn> c() {
      return e;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      dmn $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dmn.a;
               case b:
                  yield dmn.b;
               case c:
                  yield dmn.d;
               case d:
                  yield dmn.c;
               case e:
                  yield dmn.f;
               case f:
                  yield dmn.e;
               case g:
                  yield dmn.i;
               case h:
                  yield dmn.j;
               case i:
                  yield dmn.g;
               case j:
                  yield dmn.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dmn.b;
               case b:
                  yield dmn.a;
               case c:
                  yield dmn.e;
               case d:
                  yield dmn.f;
               case e:
                  yield dmn.d;
               case f:
                  yield dmn.c;
               case g:
                  yield dmn.j;
               case h:
                  yield dmn.g;
               case i:
                  yield dmn.h;
               case j:
                  yield dmn.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dmn.b;
               case b:
                  yield dmn.a;
               case c:
                  yield dmn.f;
               case d:
                  yield dmn.e;
               case e:
                  yield dmn.c;
               case f:
                  yield dmn.d;
               case g:
                  yield dmn.h;
               case h:
                  yield dmn.i;
               case i:
                  yield dmn.j;
               case j:
                  yield dmn.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      dmn $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dmn.f);
               case f:
                  return $$0.a(e, dmn.e);
               case g:
                  return $$0.a(e, dmn.j);
               case h:
                  return $$0.a(e, dmn.i);
               case i:
                  return $$0.a(e, dmn.h);
               case j:
                  return $$0.a(e, dmn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dmn.d);
               case d:
                  return $$0.a(e, dmn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dmn.h);
               case h:
                  return $$0.a(e, dmn.g);
               case i:
                  return $$0.a(e, dmn.j);
               case j:
                  return $$0.a(e, dmn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(e, c);
   }
}
