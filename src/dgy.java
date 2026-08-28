import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dgy extends dem {
   public static final MapCodec<dgy> d = b(dgy::new);
   public static final dsy<dte> e = dsq.ah;
   public static final dsr f = dsq.w;
   private static final int g = 20;

   @Override
   public MapCodec<dgy> a() {
      return d;
   }

   public dgy(drz.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dte.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == je.b ? 15 : 0;
      }
   }

   private void a(dbw $$0, iz $$1, dsa $$2) {
      if (this.a($$2, (dbz)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cor> $$5 = this.a($$0, $$1, cor.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dsa $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dsa $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dbw $$0, iz $$1, dsa $$2, boolean $$3) {
      dkx $$4 = new dkx($$0, $$1, $$2);

      for (iz $$6 : $$4.a()) {
         dsa $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dsa $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dtd<dte> c() {
      return e;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      if ($$0.c(f)) {
         List<coz> $$3 = this.a($$1, $$2, coz.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cor> $$4 = this.a($$1, $$2, cor.class, bsx.d);
         if (!$$4.isEmpty()) {
            return cps.b((bql)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cor> List<T> a(dbw $$0, iz $$1, Class<T> $$2, Predicate<bss> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private evk a(iz $$0) {
      double $$1 = 0.2;
      return new evk(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      switch ($$1) {
         case c:
            switch ((dte)$$0.c(e)) {
               case c:
                  return $$0.a(e, dte.d);
               case d:
                  return $$0.a(e, dte.c);
               case e:
                  return $$0.a(e, dte.f);
               case f:
                  return $$0.a(e, dte.e);
               case g:
                  return $$0.a(e, dte.i);
               case h:
                  return $$0.a(e, dte.j);
               case i:
                  return $$0.a(e, dte.g);
               case j:
                  return $$0.a(e, dte.h);
            }
         case d:
            switch ((dte)$$0.c(e)) {
               case c:
                  return $$0.a(e, dte.e);
               case d:
                  return $$0.a(e, dte.f);
               case e:
                  return $$0.a(e, dte.d);
               case f:
                  return $$0.a(e, dte.c);
               case g:
                  return $$0.a(e, dte.j);
               case h:
                  return $$0.a(e, dte.g);
               case i:
                  return $$0.a(e, dte.h);
               case j:
                  return $$0.a(e, dte.i);
               case a:
                  return $$0.a(e, dte.b);
               case b:
                  return $$0.a(e, dte.a);
            }
         case b:
            switch ((dte)$$0.c(e)) {
               case c:
                  return $$0.a(e, dte.f);
               case d:
                  return $$0.a(e, dte.e);
               case e:
                  return $$0.a(e, dte.c);
               case f:
                  return $$0.a(e, dte.d);
               case g:
                  return $$0.a(e, dte.h);
               case h:
                  return $$0.a(e, dte.i);
               case i:
                  return $$0.a(e, dte.j);
               case j:
                  return $$0.a(e, dte.g);
               case a:
                  return $$0.a(e, dte.b);
               case b:
                  return $$0.a(e, dte.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      dte $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dte.f);
               case f:
                  return $$0.a(e, dte.e);
               case g:
                  return $$0.a(e, dte.j);
               case h:
                  return $$0.a(e, dte.i);
               case i:
                  return $$0.a(e, dte.h);
               case j:
                  return $$0.a(e, dte.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dte.d);
               case d:
                  return $$0.a(e, dte.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dte.h);
               case h:
                  return $$0.a(e, dte.g);
               case i:
                  return $$0.a(e, dte.j);
               case j:
                  return $$0.a(e, dte.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(e, f, c);
   }
}
