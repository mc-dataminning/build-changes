import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dgz extends den {
   public static final MapCodec<dgz> d = b(dgz::new);
   public static final dsz<dtf> e = dsr.ah;
   public static final dss f = dsr.w;
   private static final int g = 20;

   @Override
   public MapCodec<dgz> a() {
      return d;
   }

   public dgz(dsa.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dtf.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == je.b ? 15 : 0;
      }
   }

   private void a(dbx $$0, iz $$1, dsb $$2) {
      if (this.a($$2, (dca)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cos> $$5 = this.a($$0, $$1, cos.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dsb $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dsb $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dbx $$0, iz $$1, dsb $$2, boolean $$3) {
      dky $$4 = new dky($$0, $$1, $$2);

      for (iz $$6 : $$4.a()) {
         dsb $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dsb $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dte<dtf> c() {
      return e;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      if ($$0.c(f)) {
         List<cpa> $$3 = this.a($$1, $$2, cpa.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cos> $$4 = this.a($$1, $$2, cos.class, bsy.d);
         if (!$$4.isEmpty()) {
            return cpt.b((bqm)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cos> List<T> a(dbx $$0, iz $$1, Class<T> $$2, Predicate<bst> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private evl a(iz $$0) {
      double $$1 = 0.2;
      return new evl(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      switch ($$1) {
         case c:
            switch ((dtf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtf.d);
               case d:
                  return $$0.a(e, dtf.c);
               case e:
                  return $$0.a(e, dtf.f);
               case f:
                  return $$0.a(e, dtf.e);
               case g:
                  return $$0.a(e, dtf.i);
               case h:
                  return $$0.a(e, dtf.j);
               case i:
                  return $$0.a(e, dtf.g);
               case j:
                  return $$0.a(e, dtf.h);
            }
         case d:
            switch ((dtf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtf.e);
               case d:
                  return $$0.a(e, dtf.f);
               case e:
                  return $$0.a(e, dtf.d);
               case f:
                  return $$0.a(e, dtf.c);
               case g:
                  return $$0.a(e, dtf.j);
               case h:
                  return $$0.a(e, dtf.g);
               case i:
                  return $$0.a(e, dtf.h);
               case j:
                  return $$0.a(e, dtf.i);
               case a:
                  return $$0.a(e, dtf.b);
               case b:
                  return $$0.a(e, dtf.a);
            }
         case b:
            switch ((dtf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtf.f);
               case d:
                  return $$0.a(e, dtf.e);
               case e:
                  return $$0.a(e, dtf.c);
               case f:
                  return $$0.a(e, dtf.d);
               case g:
                  return $$0.a(e, dtf.h);
               case h:
                  return $$0.a(e, dtf.i);
               case i:
                  return $$0.a(e, dtf.j);
               case j:
                  return $$0.a(e, dtf.g);
               case a:
                  return $$0.a(e, dtf.b);
               case b:
                  return $$0.a(e, dtf.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      dtf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtf.f);
               case f:
                  return $$0.a(e, dtf.e);
               case g:
                  return $$0.a(e, dtf.j);
               case h:
                  return $$0.a(e, dtf.i);
               case i:
                  return $$0.a(e, dtf.h);
               case j:
                  return $$0.a(e, dtf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtf.d);
               case d:
                  return $$0.a(e, dtf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtf.h);
               case h:
                  return $$0.a(e, dtf.g);
               case i:
                  return $$0.a(e, dtf.j);
               case j:
                  return $$0.a(e, dtf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(e, f, c);
   }
}
