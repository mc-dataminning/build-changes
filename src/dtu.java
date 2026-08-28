import com.mojang.serialization.MapCodec;

public class dtu extends dnd {
   public static final MapCodec<dtu> b = b(dtu::new);
   public static final eco<ecu> c = ecg.aj;

   @Override
   public MapCodec<dtu> a() {
      return b;
   }

   protected dtu(ebp.d $$0) {
      super(false, $$0);
      this.l(this.C.b().b(c, ecu.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3) {
      if ($$3.m().p() && new dtv($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ect<ecu> c() {
      return c;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      ecu $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield ecu.a;
               case b:
                  yield ecu.b;
               case c:
                  yield ecu.d;
               case d:
                  yield ecu.c;
               case e:
                  yield ecu.f;
               case f:
                  yield ecu.e;
               case g:
                  yield ecu.i;
               case h:
                  yield ecu.j;
               case i:
                  yield ecu.g;
               case j:
                  yield ecu.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield ecu.b;
               case b:
                  yield ecu.a;
               case c:
                  yield ecu.e;
               case d:
                  yield ecu.f;
               case e:
                  yield ecu.d;
               case f:
                  yield ecu.c;
               case g:
                  yield ecu.j;
               case h:
                  yield ecu.g;
               case i:
                  yield ecu.h;
               case j:
                  yield ecu.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield ecu.b;
               case b:
                  yield ecu.a;
               case c:
                  yield ecu.f;
               case d:
                  yield ecu.e;
               case e:
                  yield ecu.c;
               case f:
                  yield ecu.d;
               case g:
                  yield ecu.h;
               case h:
                  yield ecu.i;
               case i:
                  yield ecu.j;
               case j:
                  yield ecu.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      ecu $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ecu.f);
               case f:
                  return $$0.b(c, ecu.e);
               case g:
                  return $$0.b(c, ecu.j);
               case h:
                  return $$0.b(c, ecu.i);
               case i:
                  return $$0.b(c, ecu.h);
               case j:
                  return $$0.b(c, ecu.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ecu.d);
               case d:
                  return $$0.b(c, ecu.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ecu.h);
               case h:
                  return $$0.b(c, ecu.g);
               case i:
                  return $$0.b(c, ecu.j);
               case j:
                  return $$0.b(c, ecu.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, a);
   }
}
