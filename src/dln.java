import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dln extends dja {
   public static final MapCodec<dln> d = b(dln::new);
   public static final dxt<dxz> e = dxm.ak;
   public static final dxn f = dxm.B;
   private static final int g = 20;

   @Override
   public MapCodec<dln> a() {
      return d;
   }

   public dln(dwv.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dxz.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jn.b ? 15 : 0;
      }
   }

   private void a(dgh $$0, ji $$1, dww $$2) {
      if (this.a($$2, (dgk)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqv> $$5 = this.a($$0, $$1, cqv.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dww $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dww $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dgh $$0, ji $$1, dww $$2, boolean $$3) {
      dpq $$4 = new dpq($$0, $$1, $$2);

      for (ji $$6 : $$4.a()) {
         dww $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dww $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dxy<dxz> c() {
      return e;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      if ($$0.c(f)) {
         List<crf> $$3 = this.a($$1, $$2, crf.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<cqv> $$4 = this.a($$1, $$2, cqv.class, bup.d);
         if (!$$4.isEmpty()) {
            return csb.b((bsc)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqv> List<T> a(dgh $$0, ji $$1, Class<T> $$2, Predicate<buk> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fau a(ji $$0) {
      double $$1 = 0.2;
      return new fau(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      switch ($$1) {
         case c:
            switch ((dxz)$$0.c(e)) {
               case c:
                  return $$0.b(e, dxz.d);
               case d:
                  return $$0.b(e, dxz.c);
               case e:
                  return $$0.b(e, dxz.f);
               case f:
                  return $$0.b(e, dxz.e);
               case g:
                  return $$0.b(e, dxz.i);
               case h:
                  return $$0.b(e, dxz.j);
               case i:
                  return $$0.b(e, dxz.g);
               case j:
                  return $$0.b(e, dxz.h);
            }
         case d:
            switch ((dxz)$$0.c(e)) {
               case c:
                  return $$0.b(e, dxz.e);
               case d:
                  return $$0.b(e, dxz.f);
               case e:
                  return $$0.b(e, dxz.d);
               case f:
                  return $$0.b(e, dxz.c);
               case g:
                  return $$0.b(e, dxz.j);
               case h:
                  return $$0.b(e, dxz.g);
               case i:
                  return $$0.b(e, dxz.h);
               case j:
                  return $$0.b(e, dxz.i);
               case a:
                  return $$0.b(e, dxz.b);
               case b:
                  return $$0.b(e, dxz.a);
            }
         case b:
            switch ((dxz)$$0.c(e)) {
               case c:
                  return $$0.b(e, dxz.f);
               case d:
                  return $$0.b(e, dxz.e);
               case e:
                  return $$0.b(e, dxz.c);
               case f:
                  return $$0.b(e, dxz.d);
               case g:
                  return $$0.b(e, dxz.h);
               case h:
                  return $$0.b(e, dxz.i);
               case i:
                  return $$0.b(e, dxz.j);
               case j:
                  return $$0.b(e, dxz.g);
               case a:
                  return $$0.b(e, dxz.b);
               case b:
                  return $$0.b(e, dxz.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      dxz $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dxz.f);
               case f:
                  return $$0.b(e, dxz.e);
               case g:
                  return $$0.b(e, dxz.j);
               case h:
                  return $$0.b(e, dxz.i);
               case i:
                  return $$0.b(e, dxz.h);
               case j:
                  return $$0.b(e, dxz.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dxz.d);
               case d:
                  return $$0.b(e, dxz.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dxz.h);
               case h:
                  return $$0.b(e, dxz.g);
               case i:
                  return $$0.b(e, dxz.j);
               case j:
                  return $$0.b(e, dxz.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(e, f, c);
   }
}
