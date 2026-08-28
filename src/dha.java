import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dha extends deo {
   public static final MapCodec<dha> d = b(dha::new);
   public static final dta<dtg> e = dss.ah;
   public static final dst f = dss.w;
   private static final int g = 20;

   @Override
   public MapCodec<dha> a() {
      return d;
   }

   public dha(dsb.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dtg.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == je.b ? 15 : 0;
      }
   }

   private void a(dby $$0, iz $$1, dsc $$2) {
      if (this.a($$2, (dcb)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cot> $$5 = this.a($$0, $$1, cot.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dsc $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dsc $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dby $$0, iz $$1, dsc $$2, boolean $$3) {
      dkz $$4 = new dkz($$0, $$1, $$2);

      for (iz $$6 : $$4.a()) {
         dsc $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dsc $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dtf<dtg> c() {
      return e;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      if ($$0.c(f)) {
         List<cpb> $$3 = this.a($$1, $$2, cpb.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cot> $$4 = this.a($$1, $$2, cot.class, bsz.d);
         if (!$$4.isEmpty()) {
            return cpu.b((bqn)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cot> List<T> a(dby $$0, iz $$1, Class<T> $$2, Predicate<bsu> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private evm a(iz $$0) {
      double $$1 = 0.2;
      return new evm(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      switch ($$1) {
         case c:
            switch ((dtg)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtg.d);
               case d:
                  return $$0.a(e, dtg.c);
               case e:
                  return $$0.a(e, dtg.f);
               case f:
                  return $$0.a(e, dtg.e);
               case g:
                  return $$0.a(e, dtg.i);
               case h:
                  return $$0.a(e, dtg.j);
               case i:
                  return $$0.a(e, dtg.g);
               case j:
                  return $$0.a(e, dtg.h);
            }
         case d:
            switch ((dtg)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtg.e);
               case d:
                  return $$0.a(e, dtg.f);
               case e:
                  return $$0.a(e, dtg.d);
               case f:
                  return $$0.a(e, dtg.c);
               case g:
                  return $$0.a(e, dtg.j);
               case h:
                  return $$0.a(e, dtg.g);
               case i:
                  return $$0.a(e, dtg.h);
               case j:
                  return $$0.a(e, dtg.i);
               case a:
                  return $$0.a(e, dtg.b);
               case b:
                  return $$0.a(e, dtg.a);
            }
         case b:
            switch ((dtg)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtg.f);
               case d:
                  return $$0.a(e, dtg.e);
               case e:
                  return $$0.a(e, dtg.c);
               case f:
                  return $$0.a(e, dtg.d);
               case g:
                  return $$0.a(e, dtg.h);
               case h:
                  return $$0.a(e, dtg.i);
               case i:
                  return $$0.a(e, dtg.j);
               case j:
                  return $$0.a(e, dtg.g);
               case a:
                  return $$0.a(e, dtg.b);
               case b:
                  return $$0.a(e, dtg.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      dtg $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtg.f);
               case f:
                  return $$0.a(e, dtg.e);
               case g:
                  return $$0.a(e, dtg.j);
               case h:
                  return $$0.a(e, dtg.i);
               case i:
                  return $$0.a(e, dtg.h);
               case j:
                  return $$0.a(e, dtg.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtg.d);
               case d:
                  return $$0.a(e, dtg.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtg.h);
               case h:
                  return $$0.a(e, dtg.g);
               case i:
                  return $$0.a(e, dtg.j);
               case j:
                  return $$0.a(e, dtg.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(e, f, c);
   }
}
