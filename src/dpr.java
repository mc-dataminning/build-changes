import com.mojang.serialization.MapCodec;

public class dpr extends djc {
   public static final MapCodec<dpr> d = b(dpr::new);
   public static final dxv<dyb> e = dxo.aj;

   @Override
   public MapCodec<dpr> a() {
      return d;
   }

   protected dpr(dwx.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dyb.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3) {
      if ($$3.m().p() && new dps($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dya<dyb> c() {
      return e;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      dyb $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dyb.a;
               case b:
                  yield dyb.b;
               case c:
                  yield dyb.d;
               case d:
                  yield dyb.c;
               case e:
                  yield dyb.f;
               case f:
                  yield dyb.e;
               case g:
                  yield dyb.i;
               case h:
                  yield dyb.j;
               case i:
                  yield dyb.g;
               case j:
                  yield dyb.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dyb.b;
               case b:
                  yield dyb.a;
               case c:
                  yield dyb.e;
               case d:
                  yield dyb.f;
               case e:
                  yield dyb.d;
               case f:
                  yield dyb.c;
               case g:
                  yield dyb.j;
               case h:
                  yield dyb.g;
               case i:
                  yield dyb.h;
               case j:
                  yield dyb.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dyb.b;
               case b:
                  yield dyb.a;
               case c:
                  yield dyb.f;
               case d:
                  yield dyb.e;
               case e:
                  yield dyb.c;
               case f:
                  yield dyb.d;
               case g:
                  yield dyb.h;
               case h:
                  yield dyb.i;
               case i:
                  yield dyb.j;
               case j:
                  yield dyb.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      dyb $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyb.f);
               case f:
                  return $$0.b(e, dyb.e);
               case g:
                  return $$0.b(e, dyb.j);
               case h:
                  return $$0.b(e, dyb.i);
               case i:
                  return $$0.b(e, dyb.h);
               case j:
                  return $$0.b(e, dyb.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyb.d);
               case d:
                  return $$0.b(e, dyb.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyb.h);
               case h:
                  return $$0.b(e, dyb.g);
               case i:
                  return $$0.b(e, dyb.j);
               case j:
                  return $$0.b(e, dyb.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(e, c);
   }
}
