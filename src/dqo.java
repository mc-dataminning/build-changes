import com.mojang.serialization.MapCodec;

public class dqo extends dkb {
   public static final MapCodec<dqo> d = b(dqo::new);
   public static final dys<dyy> e = dyl.ah;

   @Override
   public MapCodec<dqo> a() {
      return d;
   }

   protected dqo(dxu.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dyy.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3) {
      if ($$3.m().p() && new dqp($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dyx<dyy> c() {
      return e;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      dyy $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dyy.a;
               case b:
                  yield dyy.b;
               case c:
                  yield dyy.d;
               case d:
                  yield dyy.c;
               case e:
                  yield dyy.f;
               case f:
                  yield dyy.e;
               case g:
                  yield dyy.i;
               case h:
                  yield dyy.j;
               case i:
                  yield dyy.g;
               case j:
                  yield dyy.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dyy.b;
               case b:
                  yield dyy.a;
               case c:
                  yield dyy.e;
               case d:
                  yield dyy.f;
               case e:
                  yield dyy.d;
               case f:
                  yield dyy.c;
               case g:
                  yield dyy.j;
               case h:
                  yield dyy.g;
               case i:
                  yield dyy.h;
               case j:
                  yield dyy.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dyy.b;
               case b:
                  yield dyy.a;
               case c:
                  yield dyy.f;
               case d:
                  yield dyy.e;
               case e:
                  yield dyy.c;
               case f:
                  yield dyy.d;
               case g:
                  yield dyy.h;
               case h:
                  yield dyy.i;
               case i:
                  yield dyy.j;
               case j:
                  yield dyy.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      dyy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyy.f);
               case f:
                  return $$0.b(e, dyy.e);
               case g:
                  return $$0.b(e, dyy.j);
               case h:
                  return $$0.b(e, dyy.i);
               case i:
                  return $$0.b(e, dyy.h);
               case j:
                  return $$0.b(e, dyy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyy.d);
               case d:
                  return $$0.b(e, dyy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyy.h);
               case h:
                  return $$0.b(e, dyy.g);
               case i:
                  return $$0.b(e, dyy.j);
               case j:
                  return $$0.b(e, dyy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(e, c);
   }
}
