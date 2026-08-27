import com.mojang.serialization.MapCodec;

public class dga extends czr {
   public static final MapCodec<dga> d = b(dga::new);
   public static final dnz<dof> e = dnr.ag;

   @Override
   public MapCodec<dga> a() {
      return d;
   }

   protected dga(dna.d $$0) {
      super(false, $$0);
      this.k(this.E.b().a(e, dof.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3) {
      if ($$3.o().m() && new dgb($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public doe<dof> c() {
      return e;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      dof $$2 = $$0.c(e);

      return $$0.a(e, switch ($$1) {
         case c -> {
            switch ($$2) {
               case a:
                  yield dof.a;
               case b:
                  yield dof.b;
               case c:
                  yield dof.d;
               case d:
                  yield dof.c;
               case e:
                  yield dof.f;
               case f:
                  yield dof.e;
               case g:
                  yield dof.i;
               case h:
                  yield dof.j;
               case i:
                  yield dof.g;
               case j:
                  yield dof.h;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case d -> {
            switch ($$2) {
               case a:
                  yield dof.b;
               case b:
                  yield dof.a;
               case c:
                  yield dof.e;
               case d:
                  yield dof.f;
               case e:
                  yield dof.d;
               case f:
                  yield dof.c;
               case g:
                  yield dof.j;
               case h:
                  yield dof.g;
               case i:
                  yield dof.h;
               case j:
                  yield dof.i;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case b -> {
            switch ($$2) {
               case a:
                  yield dof.b;
               case b:
                  yield dof.a;
               case c:
                  yield dof.f;
               case d:
                  yield dof.e;
               case e:
                  yield dof.c;
               case f:
                  yield dof.d;
               case g:
                  yield dof.h;
               case h:
                  yield dof.i;
               case i:
                  yield dof.j;
               case j:
                  yield dof.g;
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> $$2;
      });
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      dof $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dof.f);
               case f:
                  return $$0.a(e, dof.e);
               case g:
                  return $$0.a(e, dof.j);
               case h:
                  return $$0.a(e, dof.i);
               case i:
                  return $$0.a(e, dof.h);
               case j:
                  return $$0.a(e, dof.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dof.d);
               case d:
                  return $$0.a(e, dof.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dof.h);
               case h:
                  return $$0.a(e, dof.g);
               case i:
                  return $$0.a(e, dof.j);
               case j:
                  return $$0.a(e, dof.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e, c);
   }
}
