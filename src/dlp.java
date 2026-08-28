import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dlp extends djc {
   public static final MapCodec<dlp> d = b(dlp::new);
   public static final dxv<dyb> e = dxo.ak;
   public static final dxp f = dxo.B;
   private static final int g = 20;

   @Override
   public MapCodec<dlp> a() {
      return d;
   }

   public dlp(dwx.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dyb.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jn.b ? 15 : 0;
      }
   }

   private void a(dgj $$0, ji $$1, dwy $$2) {
      if (this.a($$2, (dgm)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqx> $$5 = this.a($$0, $$1, cqx.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dwy $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dwy $$7 = $$2.b(f, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.c($$1, this);
      }
   }

   protected void b(dgj $$0, ji $$1, dwy $$2, boolean $$3) {
      dps $$4 = new dps($$0, $$1, $$2);

      for (ji $$6 : $$4.a()) {
         dwy $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dwy $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dya<dyb> c() {
      return e;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      if ($$0.c(f)) {
         List<crh> $$3 = this.a($$1, $$2, crh.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<cqx> $$4 = this.a($$1, $$2, cqx.class, bur.d);
         if (!$$4.isEmpty()) {
            return csd.b((bse)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqx> List<T> a(dgj $$0, ji $$1, Class<T> $$2, Predicate<bum> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private faw a(ji $$0) {
      double $$1 = 0.2;
      return new faw(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      switch ($$1) {
         case c:
            switch ((dyb)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyb.d);
               case d:
                  return $$0.b(e, dyb.c);
               case e:
                  return $$0.b(e, dyb.f);
               case f:
                  return $$0.b(e, dyb.e);
               case g:
                  return $$0.b(e, dyb.i);
               case h:
                  return $$0.b(e, dyb.j);
               case i:
                  return $$0.b(e, dyb.g);
               case j:
                  return $$0.b(e, dyb.h);
            }
         case d:
            switch ((dyb)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyb.e);
               case d:
                  return $$0.b(e, dyb.f);
               case e:
                  return $$0.b(e, dyb.d);
               case f:
                  return $$0.b(e, dyb.c);
               case g:
                  return $$0.b(e, dyb.j);
               case h:
                  return $$0.b(e, dyb.g);
               case i:
                  return $$0.b(e, dyb.h);
               case j:
                  return $$0.b(e, dyb.i);
               case a:
                  return $$0.b(e, dyb.b);
               case b:
                  return $$0.b(e, dyb.a);
            }
         case b:
            switch ((dyb)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyb.f);
               case d:
                  return $$0.b(e, dyb.e);
               case e:
                  return $$0.b(e, dyb.c);
               case f:
                  return $$0.b(e, dyb.d);
               case g:
                  return $$0.b(e, dyb.h);
               case h:
                  return $$0.b(e, dyb.i);
               case i:
                  return $$0.b(e, dyb.j);
               case j:
                  return $$0.b(e, dyb.g);
               case a:
                  return $$0.b(e, dyb.b);
               case b:
                  return $$0.b(e, dyb.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      dyb $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyb.f);
               case f:
                  return $$0.b(e, dyb.e);
               case g:
                  return $$0.b(e, dyb.j);
               case h:
                  return $$0.b(e, dyb.i);
               case i:
                  return $$0.b(e, dyb.h);
               case j:
                  return $$0.b(e, dyb.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyb.d);
               case d:
                  return $$0.b(e, dyb.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyb.h);
               case h:
                  return $$0.b(e, dyb.g);
               case i:
                  return $$0.b(e, dyb.j);
               case j:
                  return $$0.b(e, dyb.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(e, f, c);
   }
}
