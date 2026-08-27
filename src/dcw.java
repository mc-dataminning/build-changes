import com.mojang.serialization.MapCodec;

public class dcw extends cwn {
   public static final MapCodec<dcw> d = b(dcw::new);
   public static final dkn<dkt> e = dkf.ag;

   @Override
   public MapCodec<dcw> a() {
      return d;
   }

   protected dcw(djo.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dkt.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djp $$0, ctx $$1, hx $$2, cwy $$3) {
      if ($$3.o().m() && new dcx($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dks<dkt> c() {
      return e;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      dkt $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dkt.a;
               case b:
                  yield dkt.b;
               case c:
                  yield dkt.d;
               case d:
                  yield dkt.c;
               case e:
                  yield dkt.f;
               case f:
                  yield dkt.e;
               case g:
                  yield dkt.i;
               case h:
                  yield dkt.j;
               case i:
                  yield dkt.g;
               case j:
                  yield dkt.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dkt.b;
               case b:
                  yield dkt.a;
               case c:
                  yield dkt.e;
               case d:
                  yield dkt.f;
               case e:
                  yield dkt.d;
               case f:
                  yield dkt.c;
               case g:
                  yield dkt.j;
               case h:
                  yield dkt.g;
               case i:
                  yield dkt.h;
               case j:
                  yield dkt.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dkt.b;
               case b:
                  yield dkt.a;
               case c:
                  yield dkt.f;
               case d:
                  yield dkt.e;
               case e:
                  yield dkt.c;
               case f:
                  yield dkt.d;
               case g:
                  yield dkt.h;
               case h:
                  yield dkt.i;
               case i:
                  yield dkt.j;
               case j:
                  yield dkt.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      dkt $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkt.f);
               case f:
                  return $$0.a(e, dkt.e);
               case g:
                  return $$0.a(e, dkt.j);
               case h:
                  return $$0.a(e, dkt.i);
               case i:
                  return $$0.a(e, dkt.h);
               case j:
                  return $$0.a(e, dkt.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkt.d);
               case d:
                  return $$0.a(e, dkt.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkt.h);
               case h:
                  return $$0.a(e, dkt.g);
               case i:
                  return $$0.a(e, dkt.j);
               case j:
                  return $$0.a(e, dkt.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e, c);
   }
}
