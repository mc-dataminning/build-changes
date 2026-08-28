import com.mojang.serialization.MapCodec;

public class dnm extends dhb {
   public static final MapCodec<dnm> d = b(dnm::new);
   public static final dvq<dvw> e = dvi.ag;

   @Override
   public MapCodec<dnm> a() {
      return d;
   }

   protected dnm(dur.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dvw.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3) {
      if ($$3.n().p() && new dnn($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dvv<dvw> c() {
      return e;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      dvw $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dvw.a;
               case b:
                  yield dvw.b;
               case c:
                  yield dvw.d;
               case d:
                  yield dvw.c;
               case e:
                  yield dvw.f;
               case f:
                  yield dvw.e;
               case g:
                  yield dvw.i;
               case h:
                  yield dvw.j;
               case i:
                  yield dvw.g;
               case j:
                  yield dvw.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dvw.b;
               case b:
                  yield dvw.a;
               case c:
                  yield dvw.e;
               case d:
                  yield dvw.f;
               case e:
                  yield dvw.d;
               case f:
                  yield dvw.c;
               case g:
                  yield dvw.j;
               case h:
                  yield dvw.g;
               case i:
                  yield dvw.h;
               case j:
                  yield dvw.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dvw.b;
               case b:
                  yield dvw.a;
               case c:
                  yield dvw.f;
               case d:
                  yield dvw.e;
               case e:
                  yield dvw.c;
               case f:
                  yield dvw.d;
               case g:
                  yield dvw.h;
               case h:
                  yield dvw.i;
               case i:
                  yield dvw.j;
               case j:
                  yield dvw.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      dvw $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dvw.f);
               case f:
                  return $$0.b(e, dvw.e);
               case g:
                  return $$0.b(e, dvw.j);
               case h:
                  return $$0.b(e, dvw.i);
               case i:
                  return $$0.b(e, dvw.h);
               case j:
                  return $$0.b(e, dvw.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dvw.d);
               case d:
                  return $$0.b(e, dvw.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dvw.h);
               case h:
                  return $$0.b(e, dvw.g);
               case i:
                  return $$0.b(e, dvw.j);
               case j:
                  return $$0.b(e, dvw.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e, c);
   }
}
