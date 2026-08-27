import com.mojang.serialization.MapCodec;

public class dco extends cwf {
   public static final MapCodec<dco> d = b(dco::new);
   public static final dkf<dkl> e = djx.ag;

   @Override
   public MapCodec<dco> a() {
      return d;
   }

   protected dco(djg.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dkl.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djh $$0, ctp $$1, hx $$2, cwq $$3) {
      if ($$3.o().m() && new dcp($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dkk<dkl> c() {
      return e;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      dkl $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dkl.a;
               case b:
                  yield dkl.b;
               case c:
                  yield dkl.d;
               case d:
                  yield dkl.c;
               case e:
                  yield dkl.f;
               case f:
                  yield dkl.e;
               case g:
                  yield dkl.i;
               case h:
                  yield dkl.j;
               case i:
                  yield dkl.g;
               case j:
                  yield dkl.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dkl.b;
               case b:
                  yield dkl.a;
               case c:
                  yield dkl.e;
               case d:
                  yield dkl.f;
               case e:
                  yield dkl.d;
               case f:
                  yield dkl.c;
               case g:
                  yield dkl.j;
               case h:
                  yield dkl.g;
               case i:
                  yield dkl.h;
               case j:
                  yield dkl.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dkl.b;
               case b:
                  yield dkl.a;
               case c:
                  yield dkl.f;
               case d:
                  yield dkl.e;
               case e:
                  yield dkl.c;
               case f:
                  yield dkl.d;
               case g:
                  yield dkl.h;
               case h:
                  yield dkl.i;
               case i:
                  yield dkl.j;
               case j:
                  yield dkl.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      dkl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkl.f);
               case f:
                  return $$0.a(e, dkl.e);
               case g:
                  return $$0.a(e, dkl.j);
               case h:
                  return $$0.a(e, dkl.i);
               case i:
                  return $$0.a(e, dkl.h);
               case j:
                  return $$0.a(e, dkl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkl.d);
               case d:
                  return $$0.a(e, dkl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkl.h);
               case h:
                  return $$0.a(e, dkl.g);
               case i:
                  return $$0.a(e, dkl.j);
               case j:
                  return $$0.a(e, dkl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(e, c);
   }
}
