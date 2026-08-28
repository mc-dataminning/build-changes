import com.mojang.serialization.MapCodec;

public class dlh extends dex {
   public static final MapCodec<dlh> d = b(dlh::new);
   public static final dtj<dtp> e = dtb.ag;

   @Override
   public MapCodec<dlh> a() {
      return d;
   }

   protected dlh(dsk.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dtp.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3) {
      if ($$3.o().m() && new dli($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dto<dtp> c() {
      return e;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      dtp $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dtp.a;
               case b:
                  yield dtp.b;
               case c:
                  yield dtp.d;
               case d:
                  yield dtp.c;
               case e:
                  yield dtp.f;
               case f:
                  yield dtp.e;
               case g:
                  yield dtp.i;
               case h:
                  yield dtp.j;
               case i:
                  yield dtp.g;
               case j:
                  yield dtp.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dtp.b;
               case b:
                  yield dtp.a;
               case c:
                  yield dtp.e;
               case d:
                  yield dtp.f;
               case e:
                  yield dtp.d;
               case f:
                  yield dtp.c;
               case g:
                  yield dtp.j;
               case h:
                  yield dtp.g;
               case i:
                  yield dtp.h;
               case j:
                  yield dtp.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dtp.b;
               case b:
                  yield dtp.a;
               case c:
                  yield dtp.f;
               case d:
                  yield dtp.e;
               case e:
                  yield dtp.c;
               case f:
                  yield dtp.d;
               case g:
                  yield dtp.h;
               case h:
                  yield dtp.i;
               case i:
                  yield dtp.j;
               case j:
                  yield dtp.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      dtp $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtp.f);
               case f:
                  return $$0.a(e, dtp.e);
               case g:
                  return $$0.a(e, dtp.j);
               case h:
                  return $$0.a(e, dtp.i);
               case i:
                  return $$0.a(e, dtp.h);
               case j:
                  return $$0.a(e, dtp.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtp.d);
               case d:
                  return $$0.a(e, dtp.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtp.h);
               case h:
                  return $$0.a(e, dtp.g);
               case i:
                  return $$0.a(e, dtp.j);
               case j:
                  return $$0.a(e, dtp.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(e, c);
   }
}
