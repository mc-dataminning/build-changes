import com.mojang.serialization.MapCodec;

public class djz extends ddp {
   public static final MapCodec<djz> d = b(djz::new);
   public static final dsb<dsh> e = drt.ag;

   @Override
   public MapCodec<djz> a() {
      return d;
   }

   protected djz(drc.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dsh.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3) {
      if ($$3.n().m() && new dka($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public dsg<dsh> c() {
      return e;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      dsh $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dsh.a;
               case b:
                  yield dsh.b;
               case c:
                  yield dsh.d;
               case d:
                  yield dsh.c;
               case e:
                  yield dsh.f;
               case f:
                  yield dsh.e;
               case g:
                  yield dsh.i;
               case h:
                  yield dsh.j;
               case i:
                  yield dsh.g;
               case j:
                  yield dsh.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dsh.b;
               case b:
                  yield dsh.a;
               case c:
                  yield dsh.e;
               case d:
                  yield dsh.f;
               case e:
                  yield dsh.d;
               case f:
                  yield dsh.c;
               case g:
                  yield dsh.j;
               case h:
                  yield dsh.g;
               case i:
                  yield dsh.h;
               case j:
                  yield dsh.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dsh.b;
               case b:
                  yield dsh.a;
               case c:
                  yield dsh.f;
               case d:
                  yield dsh.e;
               case e:
                  yield dsh.c;
               case f:
                  yield dsh.d;
               case g:
                  yield dsh.h;
               case h:
                  yield dsh.i;
               case i:
                  yield dsh.j;
               case j:
                  yield dsh.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      dsh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dsh.f);
               case f:
                  return $$0.a(e, dsh.e);
               case g:
                  return $$0.a(e, dsh.j);
               case h:
                  return $$0.a(e, dsh.i);
               case i:
                  return $$0.a(e, dsh.h);
               case j:
                  return $$0.a(e, dsh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dsh.d);
               case d:
                  return $$0.a(e, dsh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dsh.h);
               case h:
                  return $$0.a(e, dsh.g);
               case i:
                  return $$0.a(e, dsh.j);
               case j:
                  return $$0.a(e, dsh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(e, c);
   }
}
