import com.mojang.serialization.MapCodec;

public class dem extends cyd {
   public static final MapCodec<dem> d = b(dem::new);
   public static final dmd<dmj> e = dlv.ag;

   @Override
   public MapCodec<dem> a() {
      return d;
   }

   protected dem(dle.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dmj.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3) {
      if ($$3.o().m() && new den($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dmi<dmj> c() {
      return e;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      dmj $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dmj.a;
               case b:
                  yield dmj.b;
               case c:
                  yield dmj.d;
               case d:
                  yield dmj.c;
               case e:
                  yield dmj.f;
               case f:
                  yield dmj.e;
               case g:
                  yield dmj.i;
               case h:
                  yield dmj.j;
               case i:
                  yield dmj.g;
               case j:
                  yield dmj.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dmj.b;
               case b:
                  yield dmj.a;
               case c:
                  yield dmj.e;
               case d:
                  yield dmj.f;
               case e:
                  yield dmj.d;
               case f:
                  yield dmj.c;
               case g:
                  yield dmj.j;
               case h:
                  yield dmj.g;
               case i:
                  yield dmj.h;
               case j:
                  yield dmj.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dmj.b;
               case b:
                  yield dmj.a;
               case c:
                  yield dmj.f;
               case d:
                  yield dmj.e;
               case e:
                  yield dmj.c;
               case f:
                  yield dmj.d;
               case g:
                  yield dmj.h;
               case h:
                  yield dmj.i;
               case i:
                  yield dmj.j;
               case j:
                  yield dmj.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      dmj $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dmj.f);
               case f:
                  return $$0.a(e, dmj.e);
               case g:
                  return $$0.a(e, dmj.j);
               case h:
                  return $$0.a(e, dmj.i);
               case i:
                  return $$0.a(e, dmj.h);
               case j:
                  return $$0.a(e, dmj.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dmj.d);
               case d:
                  return $$0.a(e, dmj.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dmj.h);
               case h:
                  return $$0.a(e, dmj.g);
               case i:
                  return $$0.a(e, dmj.j);
               case j:
                  return $$0.a(e, dmj.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e, c);
   }
}
