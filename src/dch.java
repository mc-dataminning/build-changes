import com.mojang.serialization.MapCodec;

public class dch extends cvy {
   public static final MapCodec<dch> d = b(dch::new);
   public static final djy<dke> e = djq.ag;

   @Override
   public MapCodec<dch> a() {
      return d;
   }

   protected dch(diz.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dke.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dja $$0, cti $$1, hx $$2, cwj $$3) {
      if ($$3.o().m() && new dci($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dkd<dke> c() {
      return e;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      dke $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dke.a;
               case b:
                  yield dke.b;
               case c:
                  yield dke.d;
               case d:
                  yield dke.c;
               case e:
                  yield dke.f;
               case f:
                  yield dke.e;
               case g:
                  yield dke.i;
               case h:
                  yield dke.j;
               case i:
                  yield dke.g;
               case j:
                  yield dke.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dke.b;
               case b:
                  yield dke.a;
               case c:
                  yield dke.e;
               case d:
                  yield dke.f;
               case e:
                  yield dke.d;
               case f:
                  yield dke.c;
               case g:
                  yield dke.j;
               case h:
                  yield dke.g;
               case i:
                  yield dke.h;
               case j:
                  yield dke.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dke.b;
               case b:
                  yield dke.a;
               case c:
                  yield dke.f;
               case d:
                  yield dke.e;
               case e:
                  yield dke.c;
               case f:
                  yield dke.d;
               case g:
                  yield dke.h;
               case h:
                  yield dke.i;
               case i:
                  yield dke.j;
               case j:
                  yield dke.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      dke $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dke.f);
               case f:
                  return $$0.a(e, dke.e);
               case g:
                  return $$0.a(e, dke.j);
               case h:
                  return $$0.a(e, dke.i);
               case i:
                  return $$0.a(e, dke.h);
               case j:
                  return $$0.a(e, dke.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dke.d);
               case d:
                  return $$0.a(e, dke.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dke.h);
               case h:
                  return $$0.a(e, dke.g);
               case i:
                  return $$0.a(e, dke.j);
               case j:
                  return $$0.a(e, dke.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(e, c);
   }
}
