import com.mojang.serialization.MapCodec;

public class day extends cup {
   public static final MapCodec<day> d = b(day::new);
   public static final dig<dim> e = dhy.ag;

   @Override
   public MapCodec<day> a() {
      return d;
   }

   protected day(dhh.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dim.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhi $$0, csa $$1, ht $$2, cva $$3) {
      if ($$3.o().m() && new daz($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dil<dim> c() {
      return e;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      dim $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dim.a;
               case b:
                  yield dim.b;
               case c:
                  yield dim.d;
               case d:
                  yield dim.c;
               case e:
                  yield dim.f;
               case f:
                  yield dim.e;
               case g:
                  yield dim.i;
               case h:
                  yield dim.j;
               case i:
                  yield dim.g;
               case j:
                  yield dim.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dim.b;
               case b:
                  yield dim.a;
               case c:
                  yield dim.e;
               case d:
                  yield dim.f;
               case e:
                  yield dim.d;
               case f:
                  yield dim.c;
               case g:
                  yield dim.j;
               case h:
                  yield dim.g;
               case i:
                  yield dim.h;
               case j:
                  yield dim.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dim.b;
               case b:
                  yield dim.a;
               case c:
                  yield dim.f;
               case d:
                  yield dim.e;
               case e:
                  yield dim.c;
               case f:
                  yield dim.d;
               case g:
                  yield dim.h;
               case h:
                  yield dim.i;
               case i:
                  yield dim.j;
               case j:
                  yield dim.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      dim $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dim.f);
               case f:
                  return $$0.a(e, dim.e);
               case g:
                  return $$0.a(e, dim.j);
               case h:
                  return $$0.a(e, dim.i);
               case i:
                  return $$0.a(e, dim.h);
               case j:
                  return $$0.a(e, dim.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dim.d);
               case d:
                  return $$0.a(e, dim.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dim.h);
               case h:
                  return $$0.a(e, dim.g);
               case i:
                  return $$0.a(e, dim.j);
               case j:
                  return $$0.a(e, dim.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e, c);
   }
}
