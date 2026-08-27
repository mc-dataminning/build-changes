import com.mojang.serialization.MapCodec;

public class dfy extends czp {
   public static final MapCodec<dfy> d = b(dfy::new);
   public static final dnx<dod> e = dnp.ag;

   @Override
   public MapCodec<dfy> a() {
      return d;
   }

   protected dfy(dmy.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dod.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3) {
      if ($$3.o().m() && new dfz($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public doc<dod> c() {
      return e;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      dod $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dod.a;
               case b:
                  yield dod.b;
               case c:
                  yield dod.d;
               case d:
                  yield dod.c;
               case e:
                  yield dod.f;
               case f:
                  yield dod.e;
               case g:
                  yield dod.i;
               case h:
                  yield dod.j;
               case i:
                  yield dod.g;
               case j:
                  yield dod.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dod.b;
               case b:
                  yield dod.a;
               case c:
                  yield dod.e;
               case d:
                  yield dod.f;
               case e:
                  yield dod.d;
               case f:
                  yield dod.c;
               case g:
                  yield dod.j;
               case h:
                  yield dod.g;
               case i:
                  yield dod.h;
               case j:
                  yield dod.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dod.b;
               case b:
                  yield dod.a;
               case c:
                  yield dod.f;
               case d:
                  yield dod.e;
               case e:
                  yield dod.c;
               case f:
                  yield dod.d;
               case g:
                  yield dod.h;
               case h:
                  yield dod.i;
               case i:
                  yield dod.j;
               case j:
                  yield dod.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      dod $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dod.f);
               case f:
                  return $$0.a(e, dod.e);
               case g:
                  return $$0.a(e, dod.j);
               case h:
                  return $$0.a(e, dod.i);
               case i:
                  return $$0.a(e, dod.h);
               case j:
                  return $$0.a(e, dod.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dod.d);
               case d:
                  return $$0.a(e, dod.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dod.h);
               case h:
                  return $$0.a(e, dod.g);
               case i:
                  return $$0.a(e, dod.j);
               case j:
                  return $$0.a(e, dod.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(e, c);
   }
}
