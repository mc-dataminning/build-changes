import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dmf extends djs {
   public static final MapCodec<dmf> d = b(dmf::new);
   public static final dyl<dyr> e = dye.ak;
   public static final dyf f = dye.B;
   private static final int g = 20;

   @Override
   public MapCodec<dmf> a() {
      return d;
   }

   public dmf(dxn.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dyr.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jm.b ? 15 : 0;
      }
   }

   private void a(dgz $$0, jh $$1, dxo $$2) {
      if (this.a($$2, (dhc)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<crn> $$5 = this.a($$0, $$1, crn.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dxo $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dxo $$7 = $$2.b(f, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.c($$1, this);
      }
   }

   protected void b(dgz $$0, jh $$1, dxo $$2, boolean $$3) {
      dqi $$4 = new dqi($$0, $$1, $$2);

      for (jh $$6 : $$4.a()) {
         dxo $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dxo $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dyq<dyr> c() {
      return e;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      if ($$0.c(f)) {
         List<crx> $$3 = this.a($$1, $$2, crx.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<crn> $$4 = this.a($$1, $$2, crn.class, bvg.d);
         if (!$$4.isEmpty()) {
            return cst.b((bst)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends crn> List<T> a(dgz $$0, jh $$1, Class<T> $$2, Predicate<bvb> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fbm a(jh $$0) {
      double $$1 = 0.2;
      return new fbm(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      switch ($$1) {
         case c:
            switch ((dyr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyr.d);
               case d:
                  return $$0.b(e, dyr.c);
               case e:
                  return $$0.b(e, dyr.f);
               case f:
                  return $$0.b(e, dyr.e);
               case g:
                  return $$0.b(e, dyr.i);
               case h:
                  return $$0.b(e, dyr.j);
               case i:
                  return $$0.b(e, dyr.g);
               case j:
                  return $$0.b(e, dyr.h);
            }
         case d:
            switch ((dyr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyr.e);
               case d:
                  return $$0.b(e, dyr.f);
               case e:
                  return $$0.b(e, dyr.d);
               case f:
                  return $$0.b(e, dyr.c);
               case g:
                  return $$0.b(e, dyr.j);
               case h:
                  return $$0.b(e, dyr.g);
               case i:
                  return $$0.b(e, dyr.h);
               case j:
                  return $$0.b(e, dyr.i);
               case a:
                  return $$0.b(e, dyr.b);
               case b:
                  return $$0.b(e, dyr.a);
            }
         case b:
            switch ((dyr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyr.f);
               case d:
                  return $$0.b(e, dyr.e);
               case e:
                  return $$0.b(e, dyr.c);
               case f:
                  return $$0.b(e, dyr.d);
               case g:
                  return $$0.b(e, dyr.h);
               case h:
                  return $$0.b(e, dyr.i);
               case i:
                  return $$0.b(e, dyr.j);
               case j:
                  return $$0.b(e, dyr.g);
               case a:
                  return $$0.b(e, dyr.b);
               case b:
                  return $$0.b(e, dyr.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      dyr $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyr.f);
               case f:
                  return $$0.b(e, dyr.e);
               case g:
                  return $$0.b(e, dyr.j);
               case h:
                  return $$0.b(e, dyr.i);
               case i:
                  return $$0.b(e, dyr.h);
               case j:
                  return $$0.b(e, dyr.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyr.d);
               case d:
                  return $$0.b(e, dyr.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyr.h);
               case h:
                  return $$0.b(e, dyr.g);
               case i:
                  return $$0.b(e, dyr.j);
               case j:
                  return $$0.b(e, dyr.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(e, f, c);
   }
}
