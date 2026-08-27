import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cvb extends csr {
   public static final MapCodec<cvb> d = b(cvb::new);
   public static final dgb<dgh> e = dft.ah;
   public static final dfu f = dft.w;
   private static final int g = 20;

   @Override
   public MapCodec<cvb> a() {
      return d;
   }

   public cvb(dfc.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dgh.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ha.b ? 15 : 0;
      }
   }

   private void a(cqb $$0, gw $$1, dfd $$2) {
      if (this.a($$2, (cqe)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cdr> $$5 = this.a($$0, $$1, cdr.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dfd $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dfd $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cqb $$0, gw $$1, dfd $$2, boolean $$3) {
      cza $$4 = new cza($$0, $$1, $$2);

      for (gw $$6 : $$4.a()) {
         dfd $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dfd $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dgg<dgh> c() {
      return e;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      if ($$0.c(f)) {
         List<cdz> $$3 = this.a($$1, $$2, cdz.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).G().k();
         }

         List<cdr> $$4 = this.a($$1, $$2, cdr.class, biz.d);
         if (!$$4.isEmpty()) {
            return cer.b((bgx)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cdr> List<T> a(cqb $$0, gw $$1, Class<T> $$2, Predicate<biw> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ehc a(gw $$0) {
      double $$1 = 0.2;
      return new ehc(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      switch ($$1) {
         case c:
            switch ((dgh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dgh.d);
               case d:
                  return $$0.a(e, dgh.c);
               case e:
                  return $$0.a(e, dgh.f);
               case f:
                  return $$0.a(e, dgh.e);
               case g:
                  return $$0.a(e, dgh.i);
               case h:
                  return $$0.a(e, dgh.j);
               case i:
                  return $$0.a(e, dgh.g);
               case j:
                  return $$0.a(e, dgh.h);
            }
         case d:
            switch ((dgh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dgh.e);
               case d:
                  return $$0.a(e, dgh.f);
               case e:
                  return $$0.a(e, dgh.d);
               case f:
                  return $$0.a(e, dgh.c);
               case g:
                  return $$0.a(e, dgh.j);
               case h:
                  return $$0.a(e, dgh.g);
               case i:
                  return $$0.a(e, dgh.h);
               case j:
                  return $$0.a(e, dgh.i);
               case a:
                  return $$0.a(e, dgh.b);
               case b:
                  return $$0.a(e, dgh.a);
            }
         case b:
            switch ((dgh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dgh.f);
               case d:
                  return $$0.a(e, dgh.e);
               case e:
                  return $$0.a(e, dgh.c);
               case f:
                  return $$0.a(e, dgh.d);
               case g:
                  return $$0.a(e, dgh.h);
               case h:
                  return $$0.a(e, dgh.i);
               case i:
                  return $$0.a(e, dgh.j);
               case j:
                  return $$0.a(e, dgh.g);
               case a:
                  return $$0.a(e, dgh.b);
               case b:
                  return $$0.a(e, dgh.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      dgh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dgh.f);
               case f:
                  return $$0.a(e, dgh.e);
               case g:
                  return $$0.a(e, dgh.j);
               case h:
                  return $$0.a(e, dgh.i);
               case i:
                  return $$0.a(e, dgh.h);
               case j:
                  return $$0.a(e, dgh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dgh.d);
               case d:
                  return $$0.a(e, dgh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dgh.h);
               case h:
                  return $$0.a(e, dgh.g);
               case i:
                  return $$0.a(e, dgh.j);
               case j:
                  return $$0.a(e, dgh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e, f, c);
   }
}
