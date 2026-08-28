import com.mojang.serialization.MapCodec;

public class dpo extends diz {
   public static final MapCodec<dpo> d = b(dpo::new);
   public static final dxs<dxy> e = dxl.aj;

   @Override
   public MapCodec<dpo> a() {
      return d;
   }

   protected dpo(dwu.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dxy.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3) {
      if ($$3.m().p() && new dpp($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dxx<dxy> c() {
      return e;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      dxy $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dxy.a;
               case b:
                  yield dxy.b;
               case c:
                  yield dxy.d;
               case d:
                  yield dxy.c;
               case e:
                  yield dxy.f;
               case f:
                  yield dxy.e;
               case g:
                  yield dxy.i;
               case h:
                  yield dxy.j;
               case i:
                  yield dxy.g;
               case j:
                  yield dxy.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dxy.b;
               case b:
                  yield dxy.a;
               case c:
                  yield dxy.e;
               case d:
                  yield dxy.f;
               case e:
                  yield dxy.d;
               case f:
                  yield dxy.c;
               case g:
                  yield dxy.j;
               case h:
                  yield dxy.g;
               case i:
                  yield dxy.h;
               case j:
                  yield dxy.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dxy.b;
               case b:
                  yield dxy.a;
               case c:
                  yield dxy.f;
               case d:
                  yield dxy.e;
               case e:
                  yield dxy.c;
               case f:
                  yield dxy.d;
               case g:
                  yield dxy.h;
               case h:
                  yield dxy.i;
               case i:
                  yield dxy.j;
               case j:
                  yield dxy.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      dxy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dxy.f);
               case f:
                  return $$0.b(e, dxy.e);
               case g:
                  return $$0.b(e, dxy.j);
               case h:
                  return $$0.b(e, dxy.i);
               case i:
                  return $$0.b(e, dxy.h);
               case j:
                  return $$0.b(e, dxy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dxy.d);
               case d:
                  return $$0.b(e, dxy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dxy.h);
               case h:
                  return $$0.b(e, dxy.g);
               case i:
                  return $$0.b(e, dxy.j);
               case j:
                  return $$0.b(e, dxy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e, c);
   }
}
