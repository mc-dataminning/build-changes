import com.mojang.serialization.MapCodec;

public class dar extends cui {
   public static final MapCodec<dar> d = b(dar::new);
   public static final dhu<dia> e = dhm.ag;

   @Override
   public MapCodec<dar> a() {
      return d;
   }

   protected dar(dgv.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dia.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgw $$0, crs $$1, ht $$2, cut $$3) {
      if ($$3.o().m() && new das($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dhz<dia> c() {
      return e;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      dia $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dia.a;
               case b:
                  yield dia.b;
               case c:
                  yield dia.d;
               case d:
                  yield dia.c;
               case e:
                  yield dia.f;
               case f:
                  yield dia.e;
               case g:
                  yield dia.i;
               case h:
                  yield dia.j;
               case i:
                  yield dia.g;
               case j:
                  yield dia.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dia.b;
               case b:
                  yield dia.a;
               case c:
                  yield dia.e;
               case d:
                  yield dia.f;
               case e:
                  yield dia.d;
               case f:
                  yield dia.c;
               case g:
                  yield dia.j;
               case h:
                  yield dia.g;
               case i:
                  yield dia.h;
               case j:
                  yield dia.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dia.b;
               case b:
                  yield dia.a;
               case c:
                  yield dia.f;
               case d:
                  yield dia.e;
               case e:
                  yield dia.c;
               case f:
                  yield dia.d;
               case g:
                  yield dia.h;
               case h:
                  yield dia.i;
               case i:
                  yield dia.j;
               case j:
                  yield dia.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      dia $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dia.f);
               case f:
                  return $$0.a(e, dia.e);
               case g:
                  return $$0.a(e, dia.j);
               case h:
                  return $$0.a(e, dia.i);
               case i:
                  return $$0.a(e, dia.h);
               case j:
                  return $$0.a(e, dia.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dia.d);
               case d:
                  return $$0.a(e, dia.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dia.h);
               case h:
                  return $$0.a(e, dia.g);
               case i:
                  return $$0.a(e, dia.j);
               case j:
                  return $$0.a(e, dia.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e, c);
   }
}
