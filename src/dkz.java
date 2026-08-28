import com.mojang.serialization.MapCodec;

public class dkz extends dep {
   public static final MapCodec<dkz> d = b(dkz::new);
   public static final dtb<dth> e = dst.ag;

   @Override
   public MapCodec<dkz> a() {
      return d;
   }

   protected dkz(dsc.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dth.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3) {
      if ($$3.o().m() && new dla($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dtg<dth> c() {
      return e;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      dth $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dth.a;
               case b:
                  yield dth.b;
               case c:
                  yield dth.d;
               case d:
                  yield dth.c;
               case e:
                  yield dth.f;
               case f:
                  yield dth.e;
               case g:
                  yield dth.i;
               case h:
                  yield dth.j;
               case i:
                  yield dth.g;
               case j:
                  yield dth.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dth.b;
               case b:
                  yield dth.a;
               case c:
                  yield dth.e;
               case d:
                  yield dth.f;
               case e:
                  yield dth.d;
               case f:
                  yield dth.c;
               case g:
                  yield dth.j;
               case h:
                  yield dth.g;
               case i:
                  yield dth.h;
               case j:
                  yield dth.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dth.b;
               case b:
                  yield dth.a;
               case c:
                  yield dth.f;
               case d:
                  yield dth.e;
               case e:
                  yield dth.c;
               case f:
                  yield dth.d;
               case g:
                  yield dth.h;
               case h:
                  yield dth.i;
               case i:
                  yield dth.j;
               case j:
                  yield dth.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      dth $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dth.f);
               case f:
                  return $$0.a(e, dth.e);
               case g:
                  return $$0.a(e, dth.j);
               case h:
                  return $$0.a(e, dth.i);
               case i:
                  return $$0.a(e, dth.h);
               case j:
                  return $$0.a(e, dth.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dth.d);
               case d:
                  return $$0.a(e, dth.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dth.h);
               case h:
                  return $$0.a(e, dth.g);
               case i:
                  return $$0.a(e, dth.j);
               case j:
                  return $$0.a(e, dth.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e, c);
   }
}
