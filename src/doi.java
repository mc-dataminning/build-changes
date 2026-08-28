import com.mojang.serialization.MapCodec;

public class doi extends dhy {
   public static final MapCodec<doi> d = b(doi::new);
   public static final dwl<dwr> e = dwe.ag;

   @Override
   public MapCodec<doi> a() {
      return d;
   }

   protected doi(dvn.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dwr.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3) {
      if ($$3.m().p() && new doj($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dwq<dwr> c() {
      return e;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      dwr $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dwr.a;
               case b:
                  yield dwr.b;
               case c:
                  yield dwr.d;
               case d:
                  yield dwr.c;
               case e:
                  yield dwr.f;
               case f:
                  yield dwr.e;
               case g:
                  yield dwr.i;
               case h:
                  yield dwr.j;
               case i:
                  yield dwr.g;
               case j:
                  yield dwr.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dwr.b;
               case b:
                  yield dwr.a;
               case c:
                  yield dwr.e;
               case d:
                  yield dwr.f;
               case e:
                  yield dwr.d;
               case f:
                  yield dwr.c;
               case g:
                  yield dwr.j;
               case h:
                  yield dwr.g;
               case i:
                  yield dwr.h;
               case j:
                  yield dwr.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dwr.b;
               case b:
                  yield dwr.a;
               case c:
                  yield dwr.f;
               case d:
                  yield dwr.e;
               case e:
                  yield dwr.c;
               case f:
                  yield dwr.d;
               case g:
                  yield dwr.h;
               case h:
                  yield dwr.i;
               case i:
                  yield dwr.j;
               case j:
                  yield dwr.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      dwr $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwr.f);
               case f:
                  return $$0.b(e, dwr.e);
               case g:
                  return $$0.b(e, dwr.j);
               case h:
                  return $$0.b(e, dwr.i);
               case i:
                  return $$0.b(e, dwr.h);
               case j:
                  return $$0.b(e, dwr.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwr.d);
               case d:
                  return $$0.b(e, dwr.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwr.h);
               case h:
                  return $$0.b(e, dwr.g);
               case i:
                  return $$0.b(e, dwr.j);
               case j:
                  return $$0.b(e, dwr.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e, c);
   }
}
