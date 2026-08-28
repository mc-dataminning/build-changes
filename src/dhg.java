import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dhg extends deu {
   public static final MapCodec<dhg> d = b(dhg::new);
   public static final dtf<dtl> e = dsx.ah;
   public static final dsy f = dsx.w;
   private static final int g = 20;

   @Override
   public MapCodec<dhg> a() {
      return d;
   }

   public dhg(dsg.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dtl.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jf.b ? 15 : 0;
      }
   }

   private void a(dcd $$0, ja $$1, dsh $$2) {
      if (this.a($$2, (dcg)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<coc> $$5 = this.a($$0, $$1, coc.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dsh $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dsh $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dcd $$0, ja $$1, dsh $$2, boolean $$3) {
      dlf $$4 = new dlf($$0, $$1, $$2);

      for (ja $$6 : $$4.a()) {
         dsh $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dsh $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dtk<dtl> c() {
      return e;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      if ($$0.c(f)) {
         List<cok> $$3 = this.a($$1, $$2, cok.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<coc> $$4 = this.a($$1, $$2, coc.class, bsi.d);
         if (!$$4.isEmpty()) {
            return cpe.b((bpw)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends coc> List<T> a(dcd $$0, ja $$1, Class<T> $$2, Predicate<bsd> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private evu a(ja $$0) {
      double $$1 = 0.2;
      return new evu(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      switch ($$1) {
         case c:
            switch ((dtl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtl.d);
               case d:
                  return $$0.a(e, dtl.c);
               case e:
                  return $$0.a(e, dtl.f);
               case f:
                  return $$0.a(e, dtl.e);
               case g:
                  return $$0.a(e, dtl.i);
               case h:
                  return $$0.a(e, dtl.j);
               case i:
                  return $$0.a(e, dtl.g);
               case j:
                  return $$0.a(e, dtl.h);
            }
         case d:
            switch ((dtl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtl.e);
               case d:
                  return $$0.a(e, dtl.f);
               case e:
                  return $$0.a(e, dtl.d);
               case f:
                  return $$0.a(e, dtl.c);
               case g:
                  return $$0.a(e, dtl.j);
               case h:
                  return $$0.a(e, dtl.g);
               case i:
                  return $$0.a(e, dtl.h);
               case j:
                  return $$0.a(e, dtl.i);
               case a:
                  return $$0.a(e, dtl.b);
               case b:
                  return $$0.a(e, dtl.a);
            }
         case b:
            switch ((dtl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtl.f);
               case d:
                  return $$0.a(e, dtl.e);
               case e:
                  return $$0.a(e, dtl.c);
               case f:
                  return $$0.a(e, dtl.d);
               case g:
                  return $$0.a(e, dtl.h);
               case h:
                  return $$0.a(e, dtl.i);
               case i:
                  return $$0.a(e, dtl.j);
               case j:
                  return $$0.a(e, dtl.g);
               case a:
                  return $$0.a(e, dtl.b);
               case b:
                  return $$0.a(e, dtl.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      dtl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtl.f);
               case f:
                  return $$0.a(e, dtl.e);
               case g:
                  return $$0.a(e, dtl.j);
               case h:
                  return $$0.a(e, dtl.i);
               case i:
                  return $$0.a(e, dtl.h);
               case j:
                  return $$0.a(e, dtl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtl.d);
               case d:
                  return $$0.a(e, dtl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtl.h);
               case h:
                  return $$0.a(e, dtl.g);
               case i:
                  return $$0.a(e, dtl.j);
               case j:
                  return $$0.a(e, dtl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e, f, c);
   }
}
