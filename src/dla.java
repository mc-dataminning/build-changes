import com.mojang.serialization.MapCodec;

public class dla extends deq {
   public static final MapCodec<dla> d = b(dla::new);
   public static final dtc<dti> e = dsu.ag;

   @Override
   public MapCodec<dla> a() {
      return d;
   }

   protected dla(dsd.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dti.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3) {
      if ($$3.o().m() && new dlb($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dth<dti> c() {
      return e;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      dti $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dti.a;
               case b:
                  yield dti.b;
               case c:
                  yield dti.d;
               case d:
                  yield dti.c;
               case e:
                  yield dti.f;
               case f:
                  yield dti.e;
               case g:
                  yield dti.i;
               case h:
                  yield dti.j;
               case i:
                  yield dti.g;
               case j:
                  yield dti.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dti.b;
               case b:
                  yield dti.a;
               case c:
                  yield dti.e;
               case d:
                  yield dti.f;
               case e:
                  yield dti.d;
               case f:
                  yield dti.c;
               case g:
                  yield dti.j;
               case h:
                  yield dti.g;
               case i:
                  yield dti.h;
               case j:
                  yield dti.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dti.b;
               case b:
                  yield dti.a;
               case c:
                  yield dti.f;
               case d:
                  yield dti.e;
               case e:
                  yield dti.c;
               case f:
                  yield dti.d;
               case g:
                  yield dti.h;
               case h:
                  yield dti.i;
               case i:
                  yield dti.j;
               case j:
                  yield dti.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      dti $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dti.f);
               case f:
                  return $$0.a(e, dti.e);
               case g:
                  return $$0.a(e, dti.j);
               case h:
                  return $$0.a(e, dti.i);
               case i:
                  return $$0.a(e, dti.h);
               case j:
                  return $$0.a(e, dti.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dti.d);
               case d:
                  return $$0.a(e, dti.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dti.h);
               case h:
                  return $$0.a(e, dti.g);
               case i:
                  return $$0.a(e, dti.j);
               case j:
                  return $$0.a(e, dti.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e, c);
   }
}
