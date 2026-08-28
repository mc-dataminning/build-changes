import com.mojang.serialization.MapCodec;

public class dpq extends djb {
   public static final MapCodec<dpq> d = b(dpq::new);
   public static final dxu<dya> e = dxn.aj;

   @Override
   public MapCodec<dpq> a() {
      return d;
   }

   protected dpq(dww.d $$0) {
      super(false, $$0);
      this.l(this.F.b().b(e, dya.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3) {
      if ($$3.m().p() && new dpr($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dxz<dya> c() {
      return e;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      dya $$2 = $$0.c(e);

      return $$0.b(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dya.a;
               case b:
                  yield dya.b;
               case c:
                  yield dya.d;
               case d:
                  yield dya.c;
               case e:
                  yield dya.f;
               case f:
                  yield dya.e;
               case g:
                  yield dya.i;
               case h:
                  yield dya.j;
               case i:
                  yield dya.g;
               case j:
                  yield dya.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dya.b;
               case b:
                  yield dya.a;
               case c:
                  yield dya.e;
               case d:
                  yield dya.f;
               case e:
                  yield dya.d;
               case f:
                  yield dya.c;
               case g:
                  yield dya.j;
               case h:
                  yield dya.g;
               case i:
                  yield dya.h;
               case j:
                  yield dya.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dya.b;
               case b:
                  yield dya.a;
               case c:
                  yield dya.f;
               case d:
                  yield dya.e;
               case e:
                  yield dya.c;
               case f:
                  yield dya.d;
               case g:
                  yield dya.h;
               case h:
                  yield dya.i;
               case i:
                  yield dya.j;
               case j:
                  yield dya.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      dya $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dya.f);
               case f:
                  return $$0.b(e, dya.e);
               case g:
                  return $$0.b(e, dya.j);
               case h:
                  return $$0.b(e, dya.i);
               case i:
                  return $$0.b(e, dya.h);
               case j:
                  return $$0.b(e, dya.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dya.d);
               case d:
                  return $$0.b(e, dya.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dya.h);
               case h:
                  return $$0.b(e, dya.g);
               case i:
                  return $$0.b(e, dya.j);
               case j:
                  return $$0.b(e, dya.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(e, c);
   }
}
