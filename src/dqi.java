import com.mojang.serialization.MapCodec;

public class dqi extends djt {
   public static final MapCodec<dqi> b = b(dqi::new);
   public static final dyo<dyu> c = dyg.aj;

   @Override
   public MapCodec<dqi> a() {
      return b;
   }

   protected dqi(dxp.d $$0) {
      super(false, $$0);
      this.l(this.B.b().b(c, dyu.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3) {
      if ($$3.m().p() && new dqj($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dyt<dyu> c() {
      return c;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      dyu $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dyu.a;
               case b:
                  yield dyu.b;
               case c:
                  yield dyu.d;
               case d:
                  yield dyu.c;
               case e:
                  yield dyu.f;
               case f:
                  yield dyu.e;
               case g:
                  yield dyu.i;
               case h:
                  yield dyu.j;
               case i:
                  yield dyu.g;
               case j:
                  yield dyu.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dyu.b;
               case b:
                  yield dyu.a;
               case c:
                  yield dyu.e;
               case d:
                  yield dyu.f;
               case e:
                  yield dyu.d;
               case f:
                  yield dyu.c;
               case g:
                  yield dyu.j;
               case h:
                  yield dyu.g;
               case i:
                  yield dyu.h;
               case j:
                  yield dyu.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dyu.b;
               case b:
                  yield dyu.a;
               case c:
                  yield dyu.f;
               case d:
                  yield dyu.e;
               case e:
                  yield dyu.c;
               case f:
                  yield dyu.d;
               case g:
                  yield dyu.h;
               case h:
                  yield dyu.i;
               case i:
                  yield dyu.j;
               case j:
                  yield dyu.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      dyu $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, dyu.f);
               case f:
                  return $$0.b(c, dyu.e);
               case g:
                  return $$0.b(c, dyu.j);
               case h:
                  return $$0.b(c, dyu.i);
               case i:
                  return $$0.b(c, dyu.h);
               case j:
                  return $$0.b(c, dyu.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, dyu.d);
               case d:
                  return $$0.b(c, dyu.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, dyu.h);
               case h:
                  return $$0.b(c, dyu.g);
               case i:
                  return $$0.b(c, dyu.j);
               case j:
                  return $$0.b(c, dyu.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, a);
   }
}
