import com.mojang.serialization.MapCodec;

public class dnx extends dhn {
   public static final MapCodec<dnx> d = b(dnx::new);
   public static final dwb<dwh> e = dvt.ag;

   @Override
   public MapCodec<dnx> a() {
      return d;
   }

   protected dnx(dvc.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dwh.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3) {
      if ($$3.m().p() && new dny($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dwg<dwh> c() {
      return e;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      dwh $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dwh.a;
               case b:
                  yield dwh.b;
               case c:
                  yield dwh.d;
               case d:
                  yield dwh.c;
               case e:
                  yield dwh.f;
               case f:
                  yield dwh.e;
               case g:
                  yield dwh.i;
               case h:
                  yield dwh.j;
               case i:
                  yield dwh.g;
               case j:
                  yield dwh.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dwh.b;
               case b:
                  yield dwh.a;
               case c:
                  yield dwh.e;
               case d:
                  yield dwh.f;
               case e:
                  yield dwh.d;
               case f:
                  yield dwh.c;
               case g:
                  yield dwh.j;
               case h:
                  yield dwh.g;
               case i:
                  yield dwh.h;
               case j:
                  yield dwh.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dwh.b;
               case b:
                  yield dwh.a;
               case c:
                  yield dwh.f;
               case d:
                  yield dwh.e;
               case e:
                  yield dwh.c;
               case f:
                  yield dwh.d;
               case g:
                  yield dwh.h;
               case h:
                  yield dwh.i;
               case i:
                  yield dwh.j;
               case j:
                  yield dwh.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      dwh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwh.f);
               case f:
                  return $$0.b(e, dwh.e);
               case g:
                  return $$0.b(e, dwh.j);
               case h:
                  return $$0.b(e, dwh.i);
               case i:
                  return $$0.b(e, dwh.h);
               case j:
                  return $$0.b(e, dwh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwh.d);
               case d:
                  return $$0.b(e, dwh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwh.h);
               case h:
                  return $$0.b(e, dwh.g);
               case i:
                  return $$0.b(e, dwh.j);
               case j:
                  return $$0.b(e, dwh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e, c);
   }
}
