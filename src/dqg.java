import com.mojang.serialization.MapCodec;

public class dqg extends djt {
   public static final MapCodec<dqg> d = b(dqg::new);
   public static final dyk<dyq> e = dyd.ah;

   @Override
   public MapCodec<dqg> a() {
      return d;
   }

   protected dqg(dxm.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dyq.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3) {
      if ($$3.m().p() && new dqh($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dyp<dyq> c() {
      return e;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      dyq $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dyq.a;
               case b:
                  yield dyq.b;
               case c:
                  yield dyq.d;
               case d:
                  yield dyq.c;
               case e:
                  yield dyq.f;
               case f:
                  yield dyq.e;
               case g:
                  yield dyq.i;
               case h:
                  yield dyq.j;
               case i:
                  yield dyq.g;
               case j:
                  yield dyq.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dyq.b;
               case b:
                  yield dyq.a;
               case c:
                  yield dyq.e;
               case d:
                  yield dyq.f;
               case e:
                  yield dyq.d;
               case f:
                  yield dyq.c;
               case g:
                  yield dyq.j;
               case h:
                  yield dyq.g;
               case i:
                  yield dyq.h;
               case j:
                  yield dyq.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dyq.b;
               case b:
                  yield dyq.a;
               case c:
                  yield dyq.f;
               case d:
                  yield dyq.e;
               case e:
                  yield dyq.c;
               case f:
                  yield dyq.d;
               case g:
                  yield dyq.h;
               case h:
                  yield dyq.i;
               case i:
                  yield dyq.j;
               case j:
                  yield dyq.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      dyq $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyq.f);
               case f:
                  return $$0.b(e, dyq.e);
               case g:
                  return $$0.b(e, dyq.j);
               case h:
                  return $$0.b(e, dyq.i);
               case i:
                  return $$0.b(e, dyq.h);
               case j:
                  return $$0.b(e, dyq.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyq.d);
               case d:
                  return $$0.b(e, dyq.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyq.h);
               case h:
                  return $$0.b(e, dyq.g);
               case i:
                  return $$0.b(e, dyq.j);
               case j:
                  return $$0.b(e, dyq.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(e, c);
   }
}
