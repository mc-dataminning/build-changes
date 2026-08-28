import com.mojang.serialization.MapCodec;

public class dsx extends dmg {
   public static final MapCodec<dsx> b = b(dsx::new);
   public static final ebr<ebx> c = ebj.aj;

   @Override
   public MapCodec<dsx> a() {
      return b;
   }

   protected dsx(eas.d $$0) {
      super(false, $$0);
      this.l(this.C.b().b(c, ebx.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3) {
      if ($$3.m().p() && new dsy($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public ebw<ebx> c() {
      return c;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      ebx $$2 = $$0.c(c);

      return $$0.b(c, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield ebx.a;
               case b:
                  yield ebx.b;
               case c:
                  yield ebx.d;
               case d:
                  yield ebx.c;
               case e:
                  yield ebx.f;
               case f:
                  yield ebx.e;
               case g:
                  yield ebx.i;
               case h:
                  yield ebx.j;
               case i:
                  yield ebx.g;
               case j:
                  yield ebx.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield ebx.b;
               case b:
                  yield ebx.a;
               case c:
                  yield ebx.e;
               case d:
                  yield ebx.f;
               case e:
                  yield ebx.d;
               case f:
                  yield ebx.c;
               case g:
                  yield ebx.j;
               case h:
                  yield ebx.g;
               case i:
                  yield ebx.h;
               case j:
                  yield ebx.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield ebx.b;
               case b:
                  yield ebx.a;
               case c:
                  yield ebx.f;
               case d:
                  yield ebx.e;
               case e:
                  yield ebx.c;
               case f:
                  yield ebx.d;
               case g:
                  yield ebx.h;
               case h:
                  yield ebx.i;
               case i:
                  yield ebx.j;
               case j:
                  yield ebx.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      ebx $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebx.f);
               case f:
                  return $$0.b(c, ebx.e);
               case g:
                  return $$0.b(c, ebx.j);
               case h:
                  return $$0.b(c, ebx.i);
               case i:
                  return $$0.b(c, ebx.h);
               case j:
                  return $$0.b(c, ebx.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebx.d);
               case d:
                  return $$0.b(c, ebx.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebx.h);
               case h:
                  return $$0.b(c, ebx.g);
               case i:
                  return $$0.b(c, ebx.j);
               case j:
                  return $$0.b(c, ebx.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, a);
   }
}
