import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dat extends cyh {
   public static final MapCodec<dat> d = b(dat::new);
   public static final dmh<dmn> e = dlz.ah;
   public static final dma f = dlz.w;
   private static final int g = 20;

   @Override
   public MapCodec<dat> a() {
      return d;
   }

   public dat(dli.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dmn.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ie.b ? 15 : 0;
      }
   }

   private void a(cvr $$0, hz $$1, dlj $$2) {
      if (this.a($$2, (cvu)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cje> $$5 = this.a($$0, $$1, cje.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dlj $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dlj $$7 = $$2.a(f, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.c($$1, this);
      }
   }

   protected void b(cvr $$0, hz $$1, dlj $$2, boolean $$3) {
      der $$4 = new der($$0, $$1, $$2);

      for (hz $$6 : $$4.a()) {
         dlj $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dlj $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dmm<dmn> c() {
      return e;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      if ($$0.c(f)) {
         List<cjm> $$3 = this.a($$1, $$2, cjm.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cje> $$4 = this.a($$1, $$2, cje.class, bnv.d);
         if (!$$4.isEmpty()) {
            return ckf.b((blp)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cje> List<T> a(cvr $$0, hz $$1, Class<T> $$2, Predicate<bnq> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private enu a(hz $$0) {
      double $$1 = 0.2;
      return new enu(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      switch ($$1) {
         case c:
            switch ((dmn)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmn.d);
               case d:
                  return $$0.a(e, dmn.c);
               case e:
                  return $$0.a(e, dmn.f);
               case f:
                  return $$0.a(e, dmn.e);
               case g:
                  return $$0.a(e, dmn.i);
               case h:
                  return $$0.a(e, dmn.j);
               case i:
                  return $$0.a(e, dmn.g);
               case j:
                  return $$0.a(e, dmn.h);
            }
         case d:
            switch ((dmn)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmn.e);
               case d:
                  return $$0.a(e, dmn.f);
               case e:
                  return $$0.a(e, dmn.d);
               case f:
                  return $$0.a(e, dmn.c);
               case g:
                  return $$0.a(e, dmn.j);
               case h:
                  return $$0.a(e, dmn.g);
               case i:
                  return $$0.a(e, dmn.h);
               case j:
                  return $$0.a(e, dmn.i);
               case a:
                  return $$0.a(e, dmn.b);
               case b:
                  return $$0.a(e, dmn.a);
            }
         case b:
            switch ((dmn)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmn.f);
               case d:
                  return $$0.a(e, dmn.e);
               case e:
                  return $$0.a(e, dmn.c);
               case f:
                  return $$0.a(e, dmn.d);
               case g:
                  return $$0.a(e, dmn.h);
               case h:
                  return $$0.a(e, dmn.i);
               case i:
                  return $$0.a(e, dmn.j);
               case j:
                  return $$0.a(e, dmn.g);
               case a:
                  return $$0.a(e, dmn.b);
               case b:
                  return $$0.a(e, dmn.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      dmn $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dmn.f);
               case f:
                  return $$0.a(e, dmn.e);
               case g:
                  return $$0.a(e, dmn.j);
               case h:
                  return $$0.a(e, dmn.i);
               case i:
                  return $$0.a(e, dmn.h);
               case j:
                  return $$0.a(e, dmn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dmn.d);
               case d:
                  return $$0.a(e, dmn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dmn.h);
               case h:
                  return $$0.a(e, dmn.g);
               case i:
                  return $$0.a(e, dmn.j);
               case j:
                  return $$0.a(e, dmn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(e, f, c);
   }
}
