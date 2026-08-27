import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cxb extends cup {
   public static final MapCodec<cxb> d = b(cxb::new);
   public static final dig<dim> e = dhy.ah;
   public static final dhz f = dhy.w;
   private static final int g = 20;

   @Override
   public MapCodec<cxb> a() {
      return d;
   }

   public cxb(dhh.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dim.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == hx.b ? 15 : 0;
      }
   }

   private void a(csa $$0, ht $$1, dhi $$2) {
      if (this.a($$2, (csd)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cfl> $$5 = this.a($$0, $$1, cfl.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dhi $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dhi $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(csa $$0, ht $$1, dhi $$2, boolean $$3) {
      daz $$4 = new daz($$0, $$1, $$2);

      for (ht $$6 : $$4.a()) {
         dhi $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dhi $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dil<dim> c() {
      return e;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      if ($$0.c(f)) {
         List<cft> $$3 = this.a($$1, $$2, cft.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cfl> $$4 = this.a($$1, $$2, cfl.class, bkt.d);
         if (!$$4.isEmpty()) {
            return cgm.b((biq)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cfl> List<T> a(csa $$0, ht $$1, Class<T> $$2, Predicate<bkq> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ejp a(ht $$0) {
      double $$1 = 0.2;
      return new ejp(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      switch ($$1) {
         case c:
            switch ((dim)$$0.c(e)) {
               case c:
                  return $$0.a(e, dim.d);
               case d:
                  return $$0.a(e, dim.c);
               case e:
                  return $$0.a(e, dim.f);
               case f:
                  return $$0.a(e, dim.e);
               case g:
                  return $$0.a(e, dim.i);
               case h:
                  return $$0.a(e, dim.j);
               case i:
                  return $$0.a(e, dim.g);
               case j:
                  return $$0.a(e, dim.h);
            }
         case d:
            switch ((dim)$$0.c(e)) {
               case c:
                  return $$0.a(e, dim.e);
               case d:
                  return $$0.a(e, dim.f);
               case e:
                  return $$0.a(e, dim.d);
               case f:
                  return $$0.a(e, dim.c);
               case g:
                  return $$0.a(e, dim.j);
               case h:
                  return $$0.a(e, dim.g);
               case i:
                  return $$0.a(e, dim.h);
               case j:
                  return $$0.a(e, dim.i);
               case a:
                  return $$0.a(e, dim.b);
               case b:
                  return $$0.a(e, dim.a);
            }
         case b:
            switch ((dim)$$0.c(e)) {
               case c:
                  return $$0.a(e, dim.f);
               case d:
                  return $$0.a(e, dim.e);
               case e:
                  return $$0.a(e, dim.c);
               case f:
                  return $$0.a(e, dim.d);
               case g:
                  return $$0.a(e, dim.h);
               case h:
                  return $$0.a(e, dim.i);
               case i:
                  return $$0.a(e, dim.j);
               case j:
                  return $$0.a(e, dim.g);
               case a:
                  return $$0.a(e, dim.b);
               case b:
                  return $$0.a(e, dim.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      dim $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dim.f);
               case f:
                  return $$0.a(e, dim.e);
               case g:
                  return $$0.a(e, dim.j);
               case h:
                  return $$0.a(e, dim.i);
               case i:
                  return $$0.a(e, dim.h);
               case j:
                  return $$0.a(e, dim.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dim.d);
               case d:
                  return $$0.a(e, dim.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dim.h);
               case h:
                  return $$0.a(e, dim.g);
               case i:
                  return $$0.a(e, dim.j);
               case j:
                  return $$0.a(e, dim.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e, f, c);
   }
}
