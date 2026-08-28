import com.mojang.serialization.MapCodec;

public class dss extends dmb {
   public static final MapCodec<dss> b = b(dss::new);
   public static final ebm<ebs> c = ebe.aj;

   @Override
   public MapCodec<dss> a() {
      return b;
   }

   protected dss(ean.d $$0) {
      super(false, $$0);
      this.l(this.C.b().b(c, ebs.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3) {
      if ($$3.m().p() && new dst($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ebr<ebs> c() {
      return c;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      ebs $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield ebs.a;
               case b:
                  yield ebs.b;
               case c:
                  yield ebs.d;
               case d:
                  yield ebs.c;
               case e:
                  yield ebs.f;
               case f:
                  yield ebs.e;
               case g:
                  yield ebs.i;
               case h:
                  yield ebs.j;
               case i:
                  yield ebs.g;
               case j:
                  yield ebs.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield ebs.b;
               case b:
                  yield ebs.a;
               case c:
                  yield ebs.e;
               case d:
                  yield ebs.f;
               case e:
                  yield ebs.d;
               case f:
                  yield ebs.c;
               case g:
                  yield ebs.j;
               case h:
                  yield ebs.g;
               case i:
                  yield ebs.h;
               case j:
                  yield ebs.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield ebs.b;
               case b:
                  yield ebs.a;
               case c:
                  yield ebs.f;
               case d:
                  yield ebs.e;
               case e:
                  yield ebs.c;
               case f:
                  yield ebs.d;
               case g:
                  yield ebs.h;
               case h:
                  yield ebs.i;
               case i:
                  yield ebs.j;
               case j:
                  yield ebs.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      ebs $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebs.f);
               case f:
                  return $$0.b(c, ebs.e);
               case g:
                  return $$0.b(c, ebs.j);
               case h:
                  return $$0.b(c, ebs.i);
               case i:
                  return $$0.b(c, ebs.h);
               case j:
                  return $$0.b(c, ebs.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebs.d);
               case d:
                  return $$0.b(c, ebs.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebs.h);
               case h:
                  return $$0.b(c, ebs.g);
               case i:
                  return $$0.b(c, ebs.j);
               case j:
                  return $$0.b(c, ebs.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, a);
   }
}
