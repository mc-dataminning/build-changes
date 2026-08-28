import com.mojang.serialization.MapCodec;

public class dop extends dif {
   public static final MapCodec<dop> d = b(dop::new);
   public static final dws<dwy> e = dwl.ag;

   @Override
   public MapCodec<dop> a() {
      return d;
   }

   protected dop(dvu.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dwy.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3) {
      if ($$3.m().p() && new doq($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dwx<dwy> c() {
      return e;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      dwy $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dwy.a;
               case b:
                  yield dwy.b;
               case c:
                  yield dwy.d;
               case d:
                  yield dwy.c;
               case e:
                  yield dwy.f;
               case f:
                  yield dwy.e;
               case g:
                  yield dwy.i;
               case h:
                  yield dwy.j;
               case i:
                  yield dwy.g;
               case j:
                  yield dwy.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dwy.b;
               case b:
                  yield dwy.a;
               case c:
                  yield dwy.e;
               case d:
                  yield dwy.f;
               case e:
                  yield dwy.d;
               case f:
                  yield dwy.c;
               case g:
                  yield dwy.j;
               case h:
                  yield dwy.g;
               case i:
                  yield dwy.h;
               case j:
                  yield dwy.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dwy.b;
               case b:
                  yield dwy.a;
               case c:
                  yield dwy.f;
               case d:
                  yield dwy.e;
               case e:
                  yield dwy.c;
               case f:
                  yield dwy.d;
               case g:
                  yield dwy.h;
               case h:
                  yield dwy.i;
               case i:
                  yield dwy.j;
               case j:
                  yield dwy.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      dwy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwy.f);
               case f:
                  return $$0.b(e, dwy.e);
               case g:
                  return $$0.b(e, dwy.j);
               case h:
                  return $$0.b(e, dwy.i);
               case i:
                  return $$0.b(e, dwy.h);
               case j:
                  return $$0.b(e, dwy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwy.d);
               case d:
                  return $$0.b(e, dwy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwy.h);
               case h:
                  return $$0.b(e, dwy.g);
               case i:
                  return $$0.b(e, dwy.j);
               case j:
                  return $$0.b(e, dwy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(e, c);
   }
}
