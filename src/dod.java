import com.mojang.serialization.MapCodec;

public class dod extends dht {
   public static final MapCodec<dod> d = b(dod::new);
   public static final dwh<dwn> e = dvz.ag;

   @Override
   public MapCodec<dod> a() {
      return d;
   }

   protected dod(dvi.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dwn.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3) {
      if ($$3.m().p() && new doe($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dwm<dwn> c() {
      return e;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      dwn $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dwn.a;
               case b:
                  yield dwn.b;
               case c:
                  yield dwn.d;
               case d:
                  yield dwn.c;
               case e:
                  yield dwn.f;
               case f:
                  yield dwn.e;
               case g:
                  yield dwn.i;
               case h:
                  yield dwn.j;
               case i:
                  yield dwn.g;
               case j:
                  yield dwn.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dwn.b;
               case b:
                  yield dwn.a;
               case c:
                  yield dwn.e;
               case d:
                  yield dwn.f;
               case e:
                  yield dwn.d;
               case f:
                  yield dwn.c;
               case g:
                  yield dwn.j;
               case h:
                  yield dwn.g;
               case i:
                  yield dwn.h;
               case j:
                  yield dwn.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dwn.b;
               case b:
                  yield dwn.a;
               case c:
                  yield dwn.f;
               case d:
                  yield dwn.e;
               case e:
                  yield dwn.c;
               case f:
                  yield dwn.d;
               case g:
                  yield dwn.h;
               case h:
                  yield dwn.i;
               case i:
                  yield dwn.j;
               case j:
                  yield dwn.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      dwn $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwn.f);
               case f:
                  return $$0.b(e, dwn.e);
               case g:
                  return $$0.b(e, dwn.j);
               case h:
                  return $$0.b(e, dwn.i);
               case i:
                  return $$0.b(e, dwn.h);
               case j:
                  return $$0.b(e, dwn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwn.d);
               case d:
                  return $$0.b(e, dwn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwn.h);
               case h:
                  return $$0.b(e, dwn.g);
               case i:
                  return $$0.b(e, dwn.j);
               case j:
                  return $$0.b(e, dwn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e, c);
   }
}
