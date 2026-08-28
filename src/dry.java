import com.mojang.serialization.MapCodec;

public class dry extends dlj {
   public static final MapCodec<dry> b = b(dry::new);
   public static final eam<eas> c = eae.aj;

   @Override
   public MapCodec<dry> a() {
      return b;
   }

   protected dry(dzn.d $$0) {
      super(false, $$0);
      this.l(this.B.b().b(c, eas.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3) {
      if ($$3.m().p() && new drz($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ear<eas> c() {
      return c;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      eas $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield eas.a;
               case b:
                  yield eas.b;
               case c:
                  yield eas.d;
               case d:
                  yield eas.c;
               case e:
                  yield eas.f;
               case f:
                  yield eas.e;
               case g:
                  yield eas.i;
               case h:
                  yield eas.j;
               case i:
                  yield eas.g;
               case j:
                  yield eas.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield eas.b;
               case b:
                  yield eas.a;
               case c:
                  yield eas.e;
               case d:
                  yield eas.f;
               case e:
                  yield eas.d;
               case f:
                  yield eas.c;
               case g:
                  yield eas.j;
               case h:
                  yield eas.g;
               case i:
                  yield eas.h;
               case j:
                  yield eas.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield eas.b;
               case b:
                  yield eas.a;
               case c:
                  yield eas.f;
               case d:
                  yield eas.e;
               case e:
                  yield eas.c;
               case f:
                  yield eas.d;
               case g:
                  yield eas.h;
               case h:
                  yield eas.i;
               case i:
                  yield eas.j;
               case j:
                  yield eas.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      eas $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eas.f);
               case f:
                  return $$0.b(c, eas.e);
               case g:
                  return $$0.b(c, eas.j);
               case h:
                  return $$0.b(c, eas.i);
               case i:
                  return $$0.b(c, eas.h);
               case j:
                  return $$0.b(c, eas.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eas.d);
               case d:
                  return $$0.b(c, eas.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eas.h);
               case h:
                  return $$0.b(c, eas.g);
               case i:
                  return $$0.b(c, eas.j);
               case j:
                  return $$0.b(c, eas.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, a);
   }
}
