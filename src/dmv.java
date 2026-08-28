import com.mojang.serialization.MapCodec;

public class dmv extends dgk {
   public static final MapCodec<dmv> d = b(dmv::new);
   public static final duy<dve> e = duq.ag;

   @Override
   public MapCodec<dmv> a() {
      return d;
   }

   protected dmv(dtz.d $$0) {
      super(false, $$0);
      this.l(this.E.b().b(e, dve.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3) {
      if ($$3.o().p() && new dmw($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dvd<dve> c() {
      return e;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      dve $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dve.a;
               case b:
                  yield dve.b;
               case c:
                  yield dve.d;
               case d:
                  yield dve.c;
               case e:
                  yield dve.f;
               case f:
                  yield dve.e;
               case g:
                  yield dve.i;
               case h:
                  yield dve.j;
               case i:
                  yield dve.g;
               case j:
                  yield dve.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dve.b;
               case b:
                  yield dve.a;
               case c:
                  yield dve.e;
               case d:
                  yield dve.f;
               case e:
                  yield dve.d;
               case f:
                  yield dve.c;
               case g:
                  yield dve.j;
               case h:
                  yield dve.g;
               case i:
                  yield dve.h;
               case j:
                  yield dve.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dve.b;
               case b:
                  yield dve.a;
               case c:
                  yield dve.f;
               case d:
                  yield dve.e;
               case e:
                  yield dve.c;
               case f:
                  yield dve.d;
               case g:
                  yield dve.h;
               case h:
                  yield dve.i;
               case i:
                  yield dve.j;
               case j:
                  yield dve.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      dve $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dve.f);
               case f:
                  return $$0.b(e, dve.e);
               case g:
                  return $$0.b(e, dve.j);
               case h:
                  return $$0.b(e, dve.i);
               case i:
                  return $$0.b(e, dve.h);
               case j:
                  return $$0.b(e, dve.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dve.d);
               case d:
                  return $$0.b(e, dve.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dve.h);
               case h:
                  return $$0.b(e, dve.g);
               case i:
                  return $$0.b(e, dve.j);
               case j:
                  return $$0.b(e, dve.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e, c);
   }
}
