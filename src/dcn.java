import com.mojang.serialization.MapCodec;

public class dcn extends cwe {
   public static final MapCodec<dcn> d = b(dcn::new);
   public static final dke<dkk> e = djw.ag;

   @Override
   public MapCodec<dcn> a() {
      return d;
   }

   protected dcn(djf.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dkk.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djg $$0, cto $$1, hx $$2, cwp $$3) {
      if ($$3.o().m() && new dco($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dkj<dkk> c() {
      return e;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      dkk $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dkk.a;
               case b:
                  yield dkk.b;
               case c:
                  yield dkk.d;
               case d:
                  yield dkk.c;
               case e:
                  yield dkk.f;
               case f:
                  yield dkk.e;
               case g:
                  yield dkk.i;
               case h:
                  yield dkk.j;
               case i:
                  yield dkk.g;
               case j:
                  yield dkk.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dkk.b;
               case b:
                  yield dkk.a;
               case c:
                  yield dkk.e;
               case d:
                  yield dkk.f;
               case e:
                  yield dkk.d;
               case f:
                  yield dkk.c;
               case g:
                  yield dkk.j;
               case h:
                  yield dkk.g;
               case i:
                  yield dkk.h;
               case j:
                  yield dkk.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dkk.b;
               case b:
                  yield dkk.a;
               case c:
                  yield dkk.f;
               case d:
                  yield dkk.e;
               case e:
                  yield dkk.c;
               case f:
                  yield dkk.d;
               case g:
                  yield dkk.h;
               case h:
                  yield dkk.i;
               case i:
                  yield dkk.j;
               case j:
                  yield dkk.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      dkk $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkk.f);
               case f:
                  return $$0.a(e, dkk.e);
               case g:
                  return $$0.a(e, dkk.j);
               case h:
                  return $$0.a(e, dkk.i);
               case i:
                  return $$0.a(e, dkk.h);
               case j:
                  return $$0.a(e, dkk.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkk.d);
               case d:
                  return $$0.a(e, dkk.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkk.h);
               case h:
                  return $$0.a(e, dkk.g);
               case i:
                  return $$0.a(e, dkk.j);
               case j:
                  return $$0.a(e, dkk.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e, c);
   }
}
