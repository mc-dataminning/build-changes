import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dbg extends cyu {
   public static final MapCodec<dbg> d = b(dbg::new);
   public static final dnc<dni> e = dmu.ah;
   public static final dmv f = dmu.w;
   private static final int g = 20;

   @Override
   public MapCodec<dbg> a() {
      return d;
   }

   public dbg(dmd.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dni.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ih.b ? 15 : 0;
      }
   }

   private void a(cwe $$0, ib $$1, dme $$2) {
      if (this.a($$2, (cwh)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cjt> $$5 = this.a($$0, $$1, cjt.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dme $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dme $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cwe $$0, ib $$1, dme $$2, boolean $$3) {
      dfe $$4 = new dfe($$0, $$1, $$2);

      for (ib $$6 : $$4.a()) {
         dme $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dme $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dnh<dni> c() {
      return e;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      if ($$0.c(f)) {
         List<ckb> $$3 = this.a($$1, $$2, ckb.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cjt> $$4 = this.a($$1, $$2, cjt.class, bok.d);
         if (!$$4.isEmpty()) {
            return cku.b((bme)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cjt> List<T> a(cwe $$0, ib $$1, Class<T> $$2, Predicate<bof> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eoq a(ib $$0) {
      double $$1 = 0.2;
      return new eoq(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      switch ($$1) {
         case c:
            switch ((dni)$$0.c(e)) {
               case c:
                  return $$0.a(e, dni.d);
               case d:
                  return $$0.a(e, dni.c);
               case e:
                  return $$0.a(e, dni.f);
               case f:
                  return $$0.a(e, dni.e);
               case g:
                  return $$0.a(e, dni.i);
               case h:
                  return $$0.a(e, dni.j);
               case i:
                  return $$0.a(e, dni.g);
               case j:
                  return $$0.a(e, dni.h);
            }
         case d:
            switch ((dni)$$0.c(e)) {
               case c:
                  return $$0.a(e, dni.e);
               case d:
                  return $$0.a(e, dni.f);
               case e:
                  return $$0.a(e, dni.d);
               case f:
                  return $$0.a(e, dni.c);
               case g:
                  return $$0.a(e, dni.j);
               case h:
                  return $$0.a(e, dni.g);
               case i:
                  return $$0.a(e, dni.h);
               case j:
                  return $$0.a(e, dni.i);
               case a:
                  return $$0.a(e, dni.b);
               case b:
                  return $$0.a(e, dni.a);
            }
         case b:
            switch ((dni)$$0.c(e)) {
               case c:
                  return $$0.a(e, dni.f);
               case d:
                  return $$0.a(e, dni.e);
               case e:
                  return $$0.a(e, dni.c);
               case f:
                  return $$0.a(e, dni.d);
               case g:
                  return $$0.a(e, dni.h);
               case h:
                  return $$0.a(e, dni.i);
               case i:
                  return $$0.a(e, dni.j);
               case j:
                  return $$0.a(e, dni.g);
               case a:
                  return $$0.a(e, dni.b);
               case b:
                  return $$0.a(e, dni.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      dni $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dni.f);
               case f:
                  return $$0.a(e, dni.e);
               case g:
                  return $$0.a(e, dni.j);
               case h:
                  return $$0.a(e, dni.i);
               case i:
                  return $$0.a(e, dni.h);
               case j:
                  return $$0.a(e, dni.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dni.d);
               case d:
                  return $$0.a(e, dni.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dni.h);
               case h:
                  return $$0.a(e, dni.g);
               case i:
                  return $$0.a(e, dni.j);
               case j:
                  return $$0.a(e, dni.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(e, f, c);
   }
}
