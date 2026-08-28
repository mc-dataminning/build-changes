import com.mojang.serialization.MapCodec;

public class dti extends dmr {
   public static final MapCodec<dti> b = b(dti::new);
   public static final ecc<eci> c = ebu.aj;

   @Override
   public MapCodec<dti> a() {
      return b;
   }

   protected dti(ebd.d $$0) {
      super(false, $$0);
      this.l(this.C.b().b(c, eci.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3) {
      if ($$3.m().p() && new dtj($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ech<eci> c() {
      return c;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      eci $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield eci.a;
               case b:
                  yield eci.b;
               case c:
                  yield eci.d;
               case d:
                  yield eci.c;
               case e:
                  yield eci.f;
               case f:
                  yield eci.e;
               case g:
                  yield eci.i;
               case h:
                  yield eci.j;
               case i:
                  yield eci.g;
               case j:
                  yield eci.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield eci.b;
               case b:
                  yield eci.a;
               case c:
                  yield eci.e;
               case d:
                  yield eci.f;
               case e:
                  yield eci.d;
               case f:
                  yield eci.c;
               case g:
                  yield eci.j;
               case h:
                  yield eci.g;
               case i:
                  yield eci.h;
               case j:
                  yield eci.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield eci.b;
               case b:
                  yield eci.a;
               case c:
                  yield eci.f;
               case d:
                  yield eci.e;
               case e:
                  yield eci.c;
               case f:
                  yield eci.d;
               case g:
                  yield eci.h;
               case h:
                  yield eci.i;
               case i:
                  yield eci.j;
               case j:
                  yield eci.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      eci $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eci.f);
               case f:
                  return $$0.b(c, eci.e);
               case g:
                  return $$0.b(c, eci.j);
               case h:
                  return $$0.b(c, eci.i);
               case i:
                  return $$0.b(c, eci.h);
               case j:
                  return $$0.b(c, eci.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eci.d);
               case d:
                  return $$0.b(c, eci.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eci.h);
               case h:
                  return $$0.b(c, eci.g);
               case i:
                  return $$0.b(c, eci.j);
               case j:
                  return $$0.b(c, eci.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, a);
   }
}
