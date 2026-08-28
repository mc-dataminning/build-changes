import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dmg extends djt {
   public static final MapCodec<dmg> b = b(dmg::new);
   public static final dyo<dyu> c = dyg.ak;
   public static final dyh d = dyg.A;
   private static final int e = 20;

   @Override
   public MapCodec<dmg> a() {
      return b;
   }

   public dmg(dxp.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)).b(c, dyu.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jn.b ? 15 : 0;
      }
   }

   private void a(dgz $$0, ji $$1, dxq $$2) {
      if (this.a($$2, (dhc)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<crq> $$5 = this.a($$0, $$1, crq.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dxq $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dxq $$7 = $$2.b(d, Boolean.valueOf(false));
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

   protected void b(dgz $$0, ji $$1, dxq $$2, boolean $$3) {
      dqj $$4 = new dqj($$0, $$1, $$2);

      for (ji $$6 : $$4.a()) {
         dxq $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dxq $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dyt<dyu> c() {
      return c;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      if ($$0.c(d)) {
         List<csa> $$3 = this.a($$1, $$2, csa.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<crq> $$4 = this.a($$1, $$2, crq.class, bvg.d);
         if (!$$4.isEmpty()) {
            return csw.b((bsr)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends crq> List<T> a(dgz $$0, ji $$1, Class<T> $$2, Predicate<bva> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fbs a(ji $$0) {
      double $$1 = 0.2;
      return new fbs(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      switch ($$1) {
         case c:
            switch ((dyu)$$0.c(c)) {
               case c:
                  return $$0.b(c, dyu.d);
               case d:
                  return $$0.b(c, dyu.c);
               case e:
                  return $$0.b(c, dyu.f);
               case f:
                  return $$0.b(c, dyu.e);
               case g:
                  return $$0.b(c, dyu.i);
               case h:
                  return $$0.b(c, dyu.j);
               case i:
                  return $$0.b(c, dyu.g);
               case j:
                  return $$0.b(c, dyu.h);
            }
         case d:
            switch ((dyu)$$0.c(c)) {
               case c:
                  return $$0.b(c, dyu.e);
               case d:
                  return $$0.b(c, dyu.f);
               case e:
                  return $$0.b(c, dyu.d);
               case f:
                  return $$0.b(c, dyu.c);
               case g:
                  return $$0.b(c, dyu.j);
               case h:
                  return $$0.b(c, dyu.g);
               case i:
                  return $$0.b(c, dyu.h);
               case j:
                  return $$0.b(c, dyu.i);
               case a:
                  return $$0.b(c, dyu.b);
               case b:
                  return $$0.b(c, dyu.a);
            }
         case b:
            switch ((dyu)$$0.c(c)) {
               case c:
                  return $$0.b(c, dyu.f);
               case d:
                  return $$0.b(c, dyu.e);
               case e:
                  return $$0.b(c, dyu.c);
               case f:
                  return $$0.b(c, dyu.d);
               case g:
                  return $$0.b(c, dyu.h);
               case h:
                  return $$0.b(c, dyu.i);
               case i:
                  return $$0.b(c, dyu.j);
               case j:
                  return $$0.b(c, dyu.g);
               case a:
                  return $$0.b(c, dyu.b);
               case b:
                  return $$0.b(c, dyu.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      dyu $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, dyu.f);
               case f:
                  return $$0.b(c, dyu.e);
               case g:
                  return $$0.b(c, dyu.j);
               case h:
                  return $$0.b(c, dyu.i);
               case i:
                  return $$0.b(c, dyu.h);
               case j:
                  return $$0.b(c, dyu.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, dyu.d);
               case d:
                  return $$0.b(c, dyu.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, dyu.h);
               case h:
                  return $$0.b(c, dyu.g);
               case i:
                  return $$0.b(c, dyu.j);
               case j:
                  return $$0.b(c, dyu.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d, a);
   }
}
