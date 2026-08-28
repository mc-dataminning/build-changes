import com.mojang.serialization.MapCodec;

public class dsf extends dlp {
   public static final MapCodec<dsf> b = b(dsf::new);
   public static final eax<ebd> c = eap.aj;

   @Override
   public MapCodec<dsf> a() {
      return b;
   }

   protected dsf(dzy.d $$0) {
      super(false, $$0);
      this.l(this.B.b().b(c, ebd.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3) {
      if ($$3.m().p() && new dsg($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ebc<ebd> c() {
      return c;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      ebd $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield ebd.a;
               case b:
                  yield ebd.b;
               case c:
                  yield ebd.d;
               case d:
                  yield ebd.c;
               case e:
                  yield ebd.f;
               case f:
                  yield ebd.e;
               case g:
                  yield ebd.i;
               case h:
                  yield ebd.j;
               case i:
                  yield ebd.g;
               case j:
                  yield ebd.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield ebd.b;
               case b:
                  yield ebd.a;
               case c:
                  yield ebd.e;
               case d:
                  yield ebd.f;
               case e:
                  yield ebd.d;
               case f:
                  yield ebd.c;
               case g:
                  yield ebd.j;
               case h:
                  yield ebd.g;
               case i:
                  yield ebd.h;
               case j:
                  yield ebd.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield ebd.b;
               case b:
                  yield ebd.a;
               case c:
                  yield ebd.f;
               case d:
                  yield ebd.e;
               case e:
                  yield ebd.c;
               case f:
                  yield ebd.d;
               case g:
                  yield ebd.h;
               case h:
                  yield ebd.i;
               case i:
                  yield ebd.j;
               case j:
                  yield ebd.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      ebd $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebd.f);
               case f:
                  return $$0.b(c, ebd.e);
               case g:
                  return $$0.b(c, ebd.j);
               case h:
                  return $$0.b(c, ebd.i);
               case i:
                  return $$0.b(c, ebd.h);
               case j:
                  return $$0.b(c, ebd.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebd.d);
               case d:
                  return $$0.b(c, ebd.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebd.h);
               case h:
                  return $$0.b(c, ebd.g);
               case i:
                  return $$0.b(c, ebd.j);
               case j:
                  return $$0.b(c, ebd.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, a);
   }
}
