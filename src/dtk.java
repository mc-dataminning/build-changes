import com.mojang.serialization.MapCodec;

public class dtk extends dmt {
   public static final MapCodec<dtk> b = b(dtk::new);
   public static final ece<eck> c = ebw.aj;

   @Override
   public MapCodec<dtk> a() {
      return b;
   }

   protected dtk(ebf.d $$0) {
      super(false, $$0);
      this.l(this.C.b().b(c, eck.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3) {
      if ($$3.m().p() && new dtl($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ecj<eck> c() {
      return c;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      eck $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield eck.a;
               case b:
                  yield eck.b;
               case c:
                  yield eck.d;
               case d:
                  yield eck.c;
               case e:
                  yield eck.f;
               case f:
                  yield eck.e;
               case g:
                  yield eck.i;
               case h:
                  yield eck.j;
               case i:
                  yield eck.g;
               case j:
                  yield eck.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield eck.b;
               case b:
                  yield eck.a;
               case c:
                  yield eck.e;
               case d:
                  yield eck.f;
               case e:
                  yield eck.d;
               case f:
                  yield eck.c;
               case g:
                  yield eck.j;
               case h:
                  yield eck.g;
               case i:
                  yield eck.h;
               case j:
                  yield eck.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield eck.b;
               case b:
                  yield eck.a;
               case c:
                  yield eck.f;
               case d:
                  yield eck.e;
               case e:
                  yield eck.c;
               case f:
                  yield eck.d;
               case g:
                  yield eck.h;
               case h:
                  yield eck.i;
               case i:
                  yield eck.j;
               case j:
                  yield eck.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      eck $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eck.f);
               case f:
                  return $$0.b(c, eck.e);
               case g:
                  return $$0.b(c, eck.j);
               case h:
                  return $$0.b(c, eck.i);
               case i:
                  return $$0.b(c, eck.h);
               case j:
                  return $$0.b(c, eck.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eck.d);
               case d:
                  return $$0.b(c, eck.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eck.h);
               case h:
                  return $$0.b(c, eck.g);
               case i:
                  return $$0.b(c, eck.j);
               case j:
                  return $$0.b(c, eck.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, a);
   }
}
