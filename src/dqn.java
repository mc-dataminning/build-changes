import com.mojang.serialization.MapCodec;

public class dqn extends dka {
   public static final MapCodec<dqn> d = b(dqn::new);
   public static final dyr<dyx> e = dyk.ah;

   @Override
   public MapCodec<dqn> a() {
      return d;
   }

   protected dqn(dxt.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dyx.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3) {
      if ($$3.m().p() && new dqo($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dyw<dyx> c() {
      return e;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      dyx $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dyx.a;
               case b:
                  yield dyx.b;
               case c:
                  yield dyx.d;
               case d:
                  yield dyx.c;
               case e:
                  yield dyx.f;
               case f:
                  yield dyx.e;
               case g:
                  yield dyx.i;
               case h:
                  yield dyx.j;
               case i:
                  yield dyx.g;
               case j:
                  yield dyx.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dyx.b;
               case b:
                  yield dyx.a;
               case c:
                  yield dyx.e;
               case d:
                  yield dyx.f;
               case e:
                  yield dyx.d;
               case f:
                  yield dyx.c;
               case g:
                  yield dyx.j;
               case h:
                  yield dyx.g;
               case i:
                  yield dyx.h;
               case j:
                  yield dyx.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dyx.b;
               case b:
                  yield dyx.a;
               case c:
                  yield dyx.f;
               case d:
                  yield dyx.e;
               case e:
                  yield dyx.c;
               case f:
                  yield dyx.d;
               case g:
                  yield dyx.h;
               case h:
                  yield dyx.i;
               case i:
                  yield dyx.j;
               case j:
                  yield dyx.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      dyx $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyx.f);
               case f:
                  return $$0.b(e, dyx.e);
               case g:
                  return $$0.b(e, dyx.j);
               case h:
                  return $$0.b(e, dyx.i);
               case i:
                  return $$0.b(e, dyx.h);
               case j:
                  return $$0.b(e, dyx.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyx.d);
               case d:
                  return $$0.b(e, dyx.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyx.h);
               case h:
                  return $$0.b(e, dyx.g);
               case i:
                  return $$0.b(e, dyx.j);
               case j:
                  return $$0.b(e, dyx.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(e, c);
   }
}
