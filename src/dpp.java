import com.mojang.serialization.MapCodec;

public class dpp extends dja {
   public static final MapCodec<dpp> d = b(dpp::new);
   public static final dxt<dxz> e = dxm.aj;

   @Override
   public MapCodec<dpp> a() {
      return d;
   }

   protected dpp(dwv.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dxz.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3) {
      if ($$3.m().p() && new dpq($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dxy<dxz> c() {
      return e;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      dxz $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dxz.a;
               case b:
                  yield dxz.b;
               case c:
                  yield dxz.d;
               case d:
                  yield dxz.c;
               case e:
                  yield dxz.f;
               case f:
                  yield dxz.e;
               case g:
                  yield dxz.i;
               case h:
                  yield dxz.j;
               case i:
                  yield dxz.g;
               case j:
                  yield dxz.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dxz.b;
               case b:
                  yield dxz.a;
               case c:
                  yield dxz.e;
               case d:
                  yield dxz.f;
               case e:
                  yield dxz.d;
               case f:
                  yield dxz.c;
               case g:
                  yield dxz.j;
               case h:
                  yield dxz.g;
               case i:
                  yield dxz.h;
               case j:
                  yield dxz.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dxz.b;
               case b:
                  yield dxz.a;
               case c:
                  yield dxz.f;
               case d:
                  yield dxz.e;
               case e:
                  yield dxz.c;
               case f:
                  yield dxz.d;
               case g:
                  yield dxz.h;
               case h:
                  yield dxz.i;
               case i:
                  yield dxz.j;
               case j:
                  yield dxz.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      dxz $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dxz.f);
               case f:
                  return $$0.b(e, dxz.e);
               case g:
                  return $$0.b(e, dxz.j);
               case h:
                  return $$0.b(e, dxz.i);
               case i:
                  return $$0.b(e, dxz.h);
               case j:
                  return $$0.b(e, dxz.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dxz.d);
               case d:
                  return $$0.b(e, dxz.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dxz.h);
               case h:
                  return $$0.b(e, dxz.g);
               case i:
                  return $$0.b(e, dxz.j);
               case j:
                  return $$0.b(e, dxz.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(e, c);
   }
}
