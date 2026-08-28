import com.mojang.serialization.MapCodec;

public class dlw extends dfl {
   public static final MapCodec<dlw> d = b(dlw::new);
   public static final dty<due> e = dtq.ag;

   @Override
   public MapCodec<dlw> a() {
      return d;
   }

   protected dlw(dsz.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, due.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3) {
      if ($$3.o().m() && new dlx($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dud<due> c() {
      return e;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      due $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield due.a;
               case b:
                  yield due.b;
               case c:
                  yield due.d;
               case d:
                  yield due.c;
               case e:
                  yield due.f;
               case f:
                  yield due.e;
               case g:
                  yield due.i;
               case h:
                  yield due.j;
               case i:
                  yield due.g;
               case j:
                  yield due.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield due.b;
               case b:
                  yield due.a;
               case c:
                  yield due.e;
               case d:
                  yield due.f;
               case e:
                  yield due.d;
               case f:
                  yield due.c;
               case g:
                  yield due.j;
               case h:
                  yield due.g;
               case i:
                  yield due.h;
               case j:
                  yield due.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield due.b;
               case b:
                  yield due.a;
               case c:
                  yield due.f;
               case d:
                  yield due.e;
               case e:
                  yield due.c;
               case f:
                  yield due.d;
               case g:
                  yield due.h;
               case h:
                  yield due.i;
               case i:
                  yield due.j;
               case j:
                  yield due.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      due $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, due.f);
               case f:
                  return $$0.a(e, due.e);
               case g:
                  return $$0.a(e, due.j);
               case h:
                  return $$0.a(e, due.i);
               case i:
                  return $$0.a(e, due.h);
               case j:
                  return $$0.a(e, due.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, due.d);
               case d:
                  return $$0.a(e, due.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, due.h);
               case h:
                  return $$0.a(e, due.g);
               case i:
                  return $$0.a(e, due.j);
               case j:
                  return $$0.a(e, due.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(e, c);
   }
}
