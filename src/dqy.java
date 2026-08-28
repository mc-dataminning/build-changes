import com.mojang.serialization.MapCodec;

public class dqy extends dkj {
   public static final MapCodec<dqy> b = b(dqy::new);
   public static final dzk<dzq> c = dzc.aj;

   @Override
   public MapCodec<dqy> a() {
      return b;
   }

   protected dqy(dyl.d $$0) {
      super(false, $$0);
      this.l(this.B.b().b(c, dzq.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3) {
      if ($$3.m().p() && new dqz($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dzp<dzq> c() {
      return c;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      dzq $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dzq.a;
               case b:
                  yield dzq.b;
               case c:
                  yield dzq.d;
               case d:
                  yield dzq.c;
               case e:
                  yield dzq.f;
               case f:
                  yield dzq.e;
               case g:
                  yield dzq.i;
               case h:
                  yield dzq.j;
               case i:
                  yield dzq.g;
               case j:
                  yield dzq.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dzq.b;
               case b:
                  yield dzq.a;
               case c:
                  yield dzq.e;
               case d:
                  yield dzq.f;
               case e:
                  yield dzq.d;
               case f:
                  yield dzq.c;
               case g:
                  yield dzq.j;
               case h:
                  yield dzq.g;
               case i:
                  yield dzq.h;
               case j:
                  yield dzq.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dzq.b;
               case b:
                  yield dzq.a;
               case c:
                  yield dzq.f;
               case d:
                  yield dzq.e;
               case e:
                  yield dzq.c;
               case f:
                  yield dzq.d;
               case g:
                  yield dzq.h;
               case h:
                  yield dzq.i;
               case i:
                  yield dzq.j;
               case j:
                  yield dzq.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      dzq $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, dzq.f);
               case f:
                  return $$0.b(c, dzq.e);
               case g:
                  return $$0.b(c, dzq.j);
               case h:
                  return $$0.b(c, dzq.i);
               case i:
                  return $$0.b(c, dzq.h);
               case j:
                  return $$0.b(c, dzq.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, dzq.d);
               case d:
                  return $$0.b(c, dzq.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, dzq.h);
               case h:
                  return $$0.b(c, dzq.g);
               case i:
                  return $$0.b(c, dzq.j);
               case j:
                  return $$0.b(c, dzq.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, a);
   }
}
