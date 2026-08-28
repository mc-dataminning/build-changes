import com.mojang.serialization.MapCodec;

public class dnj extends dgy {
   public static final MapCodec<dnj> d = b(dnj::new);
   public static final dvm<dvs> e = dve.ag;

   @Override
   public MapCodec<dnj> a() {
      return d;
   }

   protected dnj(dun.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dvs.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3) {
      if ($$3.o().p() && new dnk($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dvr<dvs> c() {
      return e;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      dvs $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dvs.a;
               case b:
                  yield dvs.b;
               case c:
                  yield dvs.d;
               case d:
                  yield dvs.c;
               case e:
                  yield dvs.f;
               case f:
                  yield dvs.e;
               case g:
                  yield dvs.i;
               case h:
                  yield dvs.j;
               case i:
                  yield dvs.g;
               case j:
                  yield dvs.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dvs.b;
               case b:
                  yield dvs.a;
               case c:
                  yield dvs.e;
               case d:
                  yield dvs.f;
               case e:
                  yield dvs.d;
               case f:
                  yield dvs.c;
               case g:
                  yield dvs.j;
               case h:
                  yield dvs.g;
               case i:
                  yield dvs.h;
               case j:
                  yield dvs.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dvs.b;
               case b:
                  yield dvs.a;
               case c:
                  yield dvs.f;
               case d:
                  yield dvs.e;
               case e:
                  yield dvs.c;
               case f:
                  yield dvs.d;
               case g:
                  yield dvs.h;
               case h:
                  yield dvs.i;
               case i:
                  yield dvs.j;
               case j:
                  yield dvs.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      dvs $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dvs.f);
               case f:
                  return $$0.b(e, dvs.e);
               case g:
                  return $$0.b(e, dvs.j);
               case h:
                  return $$0.b(e, dvs.i);
               case i:
                  return $$0.b(e, dvs.h);
               case j:
                  return $$0.b(e, dvs.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dvs.d);
               case d:
                  return $$0.b(e, dvs.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dvs.h);
               case h:
                  return $$0.b(e, dvs.g);
               case i:
                  return $$0.b(e, dvs.j);
               case j:
                  return $$0.b(e, dvs.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e, c);
   }
}
