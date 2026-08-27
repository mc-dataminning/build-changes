import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dap extends cyd {
   public static final MapCodec<dap> d = b(dap::new);
   public static final dmd<dmj> e = dlv.ah;
   public static final dlw f = dlv.w;
   private static final int g = 20;

   @Override
   public MapCodec<dap> a() {
      return d;
   }

   public dap(dle.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dmj.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ie.b ? 15 : 0;
      }
   }

   private void a(cvn $$0, hz $$1, dlf $$2) {
      if (this.a($$2, (cvq)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cja> $$5 = this.a($$0, $$1, cja.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dlf $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dlf $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cvn $$0, hz $$1, dlf $$2, boolean $$3) {
      den $$4 = new den($$0, $$1, $$2);

      for (hz $$6 : $$4.a()) {
         dlf $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dlf $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dmi<dmj> c() {
      return e;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      if ($$0.c(f)) {
         List<cji> $$3 = this.a($$1, $$2, cji.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cja> $$4 = this.a($$1, $$2, cja.class, bnt.d);
         if (!$$4.isEmpty()) {
            return ckb.b((bln)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cja> List<T> a(cvn $$0, hz $$1, Class<T> $$2, Predicate<bno> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private enn a(hz $$0) {
      double $$1 = 0.2;
      return new enn(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      switch ($$1) {
         case c:
            switch ((dmj)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmj.d);
               case d:
                  return $$0.a(e, dmj.c);
               case e:
                  return $$0.a(e, dmj.f);
               case f:
                  return $$0.a(e, dmj.e);
               case g:
                  return $$0.a(e, dmj.i);
               case h:
                  return $$0.a(e, dmj.j);
               case i:
                  return $$0.a(e, dmj.g);
               case j:
                  return $$0.a(e, dmj.h);
            }
         case d:
            switch ((dmj)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmj.e);
               case d:
                  return $$0.a(e, dmj.f);
               case e:
                  return $$0.a(e, dmj.d);
               case f:
                  return $$0.a(e, dmj.c);
               case g:
                  return $$0.a(e, dmj.j);
               case h:
                  return $$0.a(e, dmj.g);
               case i:
                  return $$0.a(e, dmj.h);
               case j:
                  return $$0.a(e, dmj.i);
               case a:
                  return $$0.a(e, dmj.b);
               case b:
                  return $$0.a(e, dmj.a);
            }
         case b:
            switch ((dmj)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmj.f);
               case d:
                  return $$0.a(e, dmj.e);
               case e:
                  return $$0.a(e, dmj.c);
               case f:
                  return $$0.a(e, dmj.d);
               case g:
                  return $$0.a(e, dmj.h);
               case h:
                  return $$0.a(e, dmj.i);
               case i:
                  return $$0.a(e, dmj.j);
               case j:
                  return $$0.a(e, dmj.g);
               case a:
                  return $$0.a(e, dmj.b);
               case b:
                  return $$0.a(e, dmj.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      dmj $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dmj.f);
               case f:
                  return $$0.a(e, dmj.e);
               case g:
                  return $$0.a(e, dmj.j);
               case h:
                  return $$0.a(e, dmj.i);
               case i:
                  return $$0.a(e, dmj.h);
               case j:
                  return $$0.a(e, dmj.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dmj.d);
               case d:
                  return $$0.a(e, dmj.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dmj.h);
               case h:
                  return $$0.a(e, dmj.g);
               case i:
                  return $$0.a(e, dmj.j);
               case j:
                  return $$0.a(e, dmj.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e, f, c);
   }
}
