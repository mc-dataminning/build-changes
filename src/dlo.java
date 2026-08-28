import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dlo extends djb {
   public static final MapCodec<dlo> d = b(dlo::new);
   public static final dxu<dya> e = dxn.ak;
   public static final dxo f = dxn.B;
   private static final int g = 20;

   @Override
   public MapCodec<dlo> a() {
      return d;
   }

   public dlo(dww.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dya.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jn.b ? 15 : 0;
      }
   }

   private void a(dgi $$0, ji $$1, dwx $$2) {
      if (this.a($$2, (dgl)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqw> $$5 = this.a($$0, $$1, cqw.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dwx $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dwx $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dgi $$0, ji $$1, dwx $$2, boolean $$3) {
      dpr $$4 = new dpr($$0, $$1, $$2);

      for (ji $$6 : $$4.a()) {
         dwx $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dwx $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dxz<dya> c() {
      return e;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      if ($$0.c(f)) {
         List<crg> $$3 = this.a($$1, $$2, crg.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<cqw> $$4 = this.a($$1, $$2, cqw.class, bup.d);
         if (!$$4.isEmpty()) {
            return csc.b((bsc)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqw> List<T> a(dgi $$0, ji $$1, Class<T> $$2, Predicate<buk> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fav a(ji $$0) {
      double $$1 = 0.2;
      return new fav(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      switch ($$1) {
         case c:
            switch ((dya)$$0.c(e)) {
               case c:
                  return $$0.b(e, dya.d);
               case d:
                  return $$0.b(e, dya.c);
               case e:
                  return $$0.b(e, dya.f);
               case f:
                  return $$0.b(e, dya.e);
               case g:
                  return $$0.b(e, dya.i);
               case h:
                  return $$0.b(e, dya.j);
               case i:
                  return $$0.b(e, dya.g);
               case j:
                  return $$0.b(e, dya.h);
            }
         case d:
            switch ((dya)$$0.c(e)) {
               case c:
                  return $$0.b(e, dya.e);
               case d:
                  return $$0.b(e, dya.f);
               case e:
                  return $$0.b(e, dya.d);
               case f:
                  return $$0.b(e, dya.c);
               case g:
                  return $$0.b(e, dya.j);
               case h:
                  return $$0.b(e, dya.g);
               case i:
                  return $$0.b(e, dya.h);
               case j:
                  return $$0.b(e, dya.i);
               case a:
                  return $$0.b(e, dya.b);
               case b:
                  return $$0.b(e, dya.a);
            }
         case b:
            switch ((dya)$$0.c(e)) {
               case c:
                  return $$0.b(e, dya.f);
               case d:
                  return $$0.b(e, dya.e);
               case e:
                  return $$0.b(e, dya.c);
               case f:
                  return $$0.b(e, dya.d);
               case g:
                  return $$0.b(e, dya.h);
               case h:
                  return $$0.b(e, dya.i);
               case i:
                  return $$0.b(e, dya.j);
               case j:
                  return $$0.b(e, dya.g);
               case a:
                  return $$0.b(e, dya.b);
               case b:
                  return $$0.b(e, dya.a);
            }
         default:
            return $$0;
      }
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
      $$0.a(e, f, c);
   }
}
