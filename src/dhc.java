import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dhc extends deq {
   public static final MapCodec<dhc> d = b(dhc::new);
   public static final dtc<dti> e = dsu.ah;
   public static final dsv f = dsu.w;
   private static final int g = 20;

   @Override
   public MapCodec<dhc> a() {
      return d;
   }

   public dhc(dsd.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dti.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == je.b ? 15 : 0;
      }
   }

   private void a(dca $$0, iz $$1, dse $$2) {
      if (this.a($$2, (dcd)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cov> $$5 = this.a($$0, $$1, cov.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dse $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dse $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dca $$0, iz $$1, dse $$2, boolean $$3) {
      dlb $$4 = new dlb($$0, $$1, $$2);

      for (iz $$6 : $$4.a()) {
         dse $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dse $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dth<dti> c() {
      return e;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      if ($$0.c(f)) {
         List<cpd> $$3 = this.a($$1, $$2, cpd.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cov> $$4 = this.a($$1, $$2, cov.class, btb.d);
         if (!$$4.isEmpty()) {
            return cpw.b((bqp)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cov> List<T> a(dca $$0, iz $$1, Class<T> $$2, Predicate<bsw> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private evo a(iz $$0) {
      double $$1 = 0.2;
      return new evo(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      switch ($$1) {
         case c:
            switch ((dti)$$0.c(e)) {
               case c:
                  return $$0.a(e, dti.d);
               case d:
                  return $$0.a(e, dti.c);
               case e:
                  return $$0.a(e, dti.f);
               case f:
                  return $$0.a(e, dti.e);
               case g:
                  return $$0.a(e, dti.i);
               case h:
                  return $$0.a(e, dti.j);
               case i:
                  return $$0.a(e, dti.g);
               case j:
                  return $$0.a(e, dti.h);
            }
         case d:
            switch ((dti)$$0.c(e)) {
               case c:
                  return $$0.a(e, dti.e);
               case d:
                  return $$0.a(e, dti.f);
               case e:
                  return $$0.a(e, dti.d);
               case f:
                  return $$0.a(e, dti.c);
               case g:
                  return $$0.a(e, dti.j);
               case h:
                  return $$0.a(e, dti.g);
               case i:
                  return $$0.a(e, dti.h);
               case j:
                  return $$0.a(e, dti.i);
               case a:
                  return $$0.a(e, dti.b);
               case b:
                  return $$0.a(e, dti.a);
            }
         case b:
            switch ((dti)$$0.c(e)) {
               case c:
                  return $$0.a(e, dti.f);
               case d:
                  return $$0.a(e, dti.e);
               case e:
                  return $$0.a(e, dti.c);
               case f:
                  return $$0.a(e, dti.d);
               case g:
                  return $$0.a(e, dti.h);
               case h:
                  return $$0.a(e, dti.i);
               case i:
                  return $$0.a(e, dti.j);
               case j:
                  return $$0.a(e, dti.g);
               case a:
                  return $$0.a(e, dti.b);
               case b:
                  return $$0.a(e, dti.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      dti $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dti.f);
               case f:
                  return $$0.a(e, dti.e);
               case g:
                  return $$0.a(e, dti.j);
               case h:
                  return $$0.a(e, dti.i);
               case i:
                  return $$0.a(e, dti.h);
               case j:
                  return $$0.a(e, dti.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dti.d);
               case d:
                  return $$0.a(e, dti.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dti.h);
               case h:
                  return $$0.a(e, dti.g);
               case i:
                  return $$0.a(e, dti.j);
               case j:
                  return $$0.a(e, dti.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e, f, c);
   }
}
