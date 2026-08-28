import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dmw extends dkj {
   public static final MapCodec<dmw> b = b(dmw::new);
   public static final dzk<dzq> c = dzc.ak;
   public static final dzd d = dzc.A;
   private static final int e = 20;

   @Override
   public MapCodec<dmw> a() {
      return b;
   }

   public dmw(dyl.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)).b(c, dzq.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jo.b ? 15 : 0;
      }
   }

   private void a(dhp $$0, jj $$1, dym $$2) {
      if (this.a($$2, (dhs)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<csh> $$5 = this.a($$0, $$1, csh.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dym $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dym $$7 = $$2.b(d, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.b($$1, this);
      }
   }

   protected void b(dhp $$0, jj $$1, dym $$2, boolean $$3) {
      dqz $$4 = new dqz($$0, $$1, $$2);

      for (jj $$6 : $$4.a()) {
         dym $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dym $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dzp<dzq> c() {
      return c;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      if ($$0.c(d)) {
         List<csr> $$3 = this.a($$1, $$2, csr.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<csh> $$4 = this.a($$1, $$2, csh.class, bvz.d);
         if (!$$4.isEmpty()) {
            return ctn.b((btj)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends csh> List<T> a(dhp $$0, jj $$1, Class<T> $$2, Predicate<bvs> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fcp a(jj $$0) {
      double $$1 = 0.2;
      return new fcp(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      switch ($$1) {
         case c:
            switch ((dzq)$$0.c(c)) {
               case c:
                  return $$0.b(c, dzq.d);
               case d:
                  return $$0.b(c, dzq.c);
               case e:
                  return $$0.b(c, dzq.f);
               case f:
                  return $$0.b(c, dzq.e);
               case g:
                  return $$0.b(c, dzq.i);
               case h:
                  return $$0.b(c, dzq.j);
               case i:
                  return $$0.b(c, dzq.g);
               case j:
                  return $$0.b(c, dzq.h);
            }
         case d:
            switch ((dzq)$$0.c(c)) {
               case c:
                  return $$0.b(c, dzq.e);
               case d:
                  return $$0.b(c, dzq.f);
               case e:
                  return $$0.b(c, dzq.d);
               case f:
                  return $$0.b(c, dzq.c);
               case g:
                  return $$0.b(c, dzq.j);
               case h:
                  return $$0.b(c, dzq.g);
               case i:
                  return $$0.b(c, dzq.h);
               case j:
                  return $$0.b(c, dzq.i);
               case a:
                  return $$0.b(c, dzq.b);
               case b:
                  return $$0.b(c, dzq.a);
            }
         case b:
            switch ((dzq)$$0.c(c)) {
               case c:
                  return $$0.b(c, dzq.f);
               case d:
                  return $$0.b(c, dzq.e);
               case e:
                  return $$0.b(c, dzq.c);
               case f:
                  return $$0.b(c, dzq.d);
               case g:
                  return $$0.b(c, dzq.h);
               case h:
                  return $$0.b(c, dzq.i);
               case i:
                  return $$0.b(c, dzq.j);
               case j:
                  return $$0.b(c, dzq.g);
               case a:
                  return $$0.b(c, dzq.b);
               case b:
                  return $$0.b(c, dzq.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      dzq $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, dzq.f);
               case f:
                  return $$0.b(c, dzq.e);
               case g:
                  return $$0.b(c, dzq.j);
               case h:
                  return $$0.b(c, dzq.i);
               case i:
                  return $$0.b(c, dzq.h);
               case j:
                  return $$0.b(c, dzq.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, dzq.d);
               case d:
                  return $$0.b(c, dzq.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, dzq.h);
               case h:
                  return $$0.b(c, dzq.g);
               case i:
                  return $$0.b(c, dzq.j);
               case j:
                  return $$0.b(c, dzq.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d, a);
   }
}
