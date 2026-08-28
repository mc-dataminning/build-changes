import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dlm extends diz {
   public static final MapCodec<dlm> d = b(dlm::new);
   public static final dxs<dxy> e = dxl.ak;
   public static final dxm f = dxl.B;
   private static final int g = 20;

   @Override
   public MapCodec<dlm> a() {
      return d;
   }

   public dlm(dwu.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dxy.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jn.b ? 15 : 0;
      }
   }

   private void a(dgg $$0, ji $$1, dwv $$2) {
      if (this.a($$2, (dgj)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqu> $$5 = this.a($$0, $$1, cqu.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dwv $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dwv $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dgg $$0, ji $$1, dwv $$2, boolean $$3) {
      dpp $$4 = new dpp($$0, $$1, $$2);

      for (ji $$6 : $$4.a()) {
         dwv $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dwv $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dxx<dxy> c() {
      return e;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      if ($$0.c(f)) {
         List<cre> $$3 = this.a($$1, $$2, cre.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<cqu> $$4 = this.a($$1, $$2, cqu.class, buo.d);
         if (!$$4.isEmpty()) {
            return csa.b((bsb)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqu> List<T> a(dgg $$0, ji $$1, Class<T> $$2, Predicate<buj> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fat a(ji $$0) {
      double $$1 = 0.2;
      return new fat(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      switch ($$1) {
         case c:
            switch ((dxy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dxy.d);
               case d:
                  return $$0.b(e, dxy.c);
               case e:
                  return $$0.b(e, dxy.f);
               case f:
                  return $$0.b(e, dxy.e);
               case g:
                  return $$0.b(e, dxy.i);
               case h:
                  return $$0.b(e, dxy.j);
               case i:
                  return $$0.b(e, dxy.g);
               case j:
                  return $$0.b(e, dxy.h);
            }
         case d:
            switch ((dxy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dxy.e);
               case d:
                  return $$0.b(e, dxy.f);
               case e:
                  return $$0.b(e, dxy.d);
               case f:
                  return $$0.b(e, dxy.c);
               case g:
                  return $$0.b(e, dxy.j);
               case h:
                  return $$0.b(e, dxy.g);
               case i:
                  return $$0.b(e, dxy.h);
               case j:
                  return $$0.b(e, dxy.i);
               case a:
                  return $$0.b(e, dxy.b);
               case b:
                  return $$0.b(e, dxy.a);
            }
         case b:
            switch ((dxy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dxy.f);
               case d:
                  return $$0.b(e, dxy.e);
               case e:
                  return $$0.b(e, dxy.c);
               case f:
                  return $$0.b(e, dxy.d);
               case g:
                  return $$0.b(e, dxy.h);
               case h:
                  return $$0.b(e, dxy.i);
               case i:
                  return $$0.b(e, dxy.j);
               case j:
                  return $$0.b(e, dxy.g);
               case a:
                  return $$0.b(e, dxy.b);
               case b:
                  return $$0.b(e, dxy.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      dxy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dxy.f);
               case f:
                  return $$0.b(e, dxy.e);
               case g:
                  return $$0.b(e, dxy.j);
               case h:
                  return $$0.b(e, dxy.i);
               case i:
                  return $$0.b(e, dxy.h);
               case j:
                  return $$0.b(e, dxy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dxy.d);
               case d:
                  return $$0.b(e, dxy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dxy.h);
               case h:
                  return $$0.b(e, dxy.g);
               case i:
                  return $$0.b(e, dxy.j);
               case j:
                  return $$0.b(e, dxy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e, f, c);
   }
}
