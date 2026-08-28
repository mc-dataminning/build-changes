import com.mojang.serialization.MapCodec;

public class dlg extends dew {
   public static final MapCodec<dlg> d = b(dlg::new);
   public static final dti<dto> e = dta.ag;

   @Override
   public MapCodec<dlg> a() {
      return d;
   }

   protected dlg(dsj.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dto.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3) {
      if ($$3.o().m() && new dlh($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dtn<dto> c() {
      return e;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      dto $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dto.a;
               case b:
                  yield dto.b;
               case c:
                  yield dto.d;
               case d:
                  yield dto.c;
               case e:
                  yield dto.f;
               case f:
                  yield dto.e;
               case g:
                  yield dto.i;
               case h:
                  yield dto.j;
               case i:
                  yield dto.g;
               case j:
                  yield dto.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dto.b;
               case b:
                  yield dto.a;
               case c:
                  yield dto.e;
               case d:
                  yield dto.f;
               case e:
                  yield dto.d;
               case f:
                  yield dto.c;
               case g:
                  yield dto.j;
               case h:
                  yield dto.g;
               case i:
                  yield dto.h;
               case j:
                  yield dto.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dto.b;
               case b:
                  yield dto.a;
               case c:
                  yield dto.f;
               case d:
                  yield dto.e;
               case e:
                  yield dto.c;
               case f:
                  yield dto.d;
               case g:
                  yield dto.h;
               case h:
                  yield dto.i;
               case i:
                  yield dto.j;
               case j:
                  yield dto.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      dto $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dto.f);
               case f:
                  return $$0.a(e, dto.e);
               case g:
                  return $$0.a(e, dto.j);
               case h:
                  return $$0.a(e, dto.i);
               case i:
                  return $$0.a(e, dto.h);
               case j:
                  return $$0.a(e, dto.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dto.d);
               case d:
                  return $$0.a(e, dto.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dto.h);
               case h:
                  return $$0.a(e, dto.g);
               case i:
                  return $$0.a(e, dto.j);
               case j:
                  return $$0.a(e, dto.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(e, c);
   }
}
