import com.mojang.serialization.MapCodec;

public class dqh extends djs {
   public static final MapCodec<dqh> d = b(dqh::new);
   public static final dyl<dyr> e = dye.aj;

   @Override
   public MapCodec<dqh> a() {
      return d;
   }

   protected dqh(dxn.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dyr.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3) {
      if ($$3.m().p() && new dqi($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dyq<dyr> c() {
      return e;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      dyr $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dyr.a;
               case b:
                  yield dyr.b;
               case c:
                  yield dyr.d;
               case d:
                  yield dyr.c;
               case e:
                  yield dyr.f;
               case f:
                  yield dyr.e;
               case g:
                  yield dyr.i;
               case h:
                  yield dyr.j;
               case i:
                  yield dyr.g;
               case j:
                  yield dyr.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dyr.b;
               case b:
                  yield dyr.a;
               case c:
                  yield dyr.e;
               case d:
                  yield dyr.f;
               case e:
                  yield dyr.d;
               case f:
                  yield dyr.c;
               case g:
                  yield dyr.j;
               case h:
                  yield dyr.g;
               case i:
                  yield dyr.h;
               case j:
                  yield dyr.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dyr.b;
               case b:
                  yield dyr.a;
               case c:
                  yield dyr.f;
               case d:
                  yield dyr.e;
               case e:
                  yield dyr.c;
               case f:
                  yield dyr.d;
               case g:
                  yield dyr.h;
               case h:
                  yield dyr.i;
               case i:
                  yield dyr.j;
               case j:
                  yield dyr.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      dyr $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyr.f);
               case f:
                  return $$0.b(e, dyr.e);
               case g:
                  return $$0.b(e, dyr.j);
               case h:
                  return $$0.b(e, dyr.i);
               case i:
                  return $$0.b(e, dyr.h);
               case j:
                  return $$0.b(e, dyr.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyr.d);
               case d:
                  return $$0.b(e, dyr.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyr.h);
               case h:
                  return $$0.b(e, dyr.g);
               case i:
                  return $$0.b(e, dyr.j);
               case j:
                  return $$0.b(e, dyr.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(e, c);
   }
}
