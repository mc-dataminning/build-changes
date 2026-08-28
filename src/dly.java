import com.mojang.serialization.MapCodec;

public class dly extends dfn {
   public static final MapCodec<dly> d = b(dly::new);
   public static final dua<dug> e = dts.ag;

   @Override
   public MapCodec<dly> a() {
      return d;
   }

   protected dly(dtb.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dug.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3) {
      if ($$3.o().m() && new dlz($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public duf<dug> c() {
      return e;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      dug $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dug.a;
               case b:
                  yield dug.b;
               case c:
                  yield dug.d;
               case d:
                  yield dug.c;
               case e:
                  yield dug.f;
               case f:
                  yield dug.e;
               case g:
                  yield dug.i;
               case h:
                  yield dug.j;
               case i:
                  yield dug.g;
               case j:
                  yield dug.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dug.b;
               case b:
                  yield dug.a;
               case c:
                  yield dug.e;
               case d:
                  yield dug.f;
               case e:
                  yield dug.d;
               case f:
                  yield dug.c;
               case g:
                  yield dug.j;
               case h:
                  yield dug.g;
               case i:
                  yield dug.h;
               case j:
                  yield dug.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dug.b;
               case b:
                  yield dug.a;
               case c:
                  yield dug.f;
               case d:
                  yield dug.e;
               case e:
                  yield dug.c;
               case f:
                  yield dug.d;
               case g:
                  yield dug.h;
               case h:
                  yield dug.i;
               case i:
                  yield dug.j;
               case j:
                  yield dug.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      dug $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dug.f);
               case f:
                  return $$0.a(e, dug.e);
               case g:
                  return $$0.a(e, dug.j);
               case h:
                  return $$0.a(e, dug.i);
               case i:
                  return $$0.a(e, dug.h);
               case j:
                  return $$0.a(e, dug.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dug.d);
               case d:
                  return $$0.a(e, dug.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dug.h);
               case h:
                  return $$0.a(e, dug.g);
               case i:
                  return $$0.a(e, dug.j);
               case j:
                  return $$0.a(e, dug.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(e, c);
   }
}
