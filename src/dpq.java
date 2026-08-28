import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dpq extends dnd {
   public static final MapCodec<dpq> b = b(dpq::new);
   public static final eco<ecu> c = ecg.ak;
   public static final ech d = ecg.A;
   private static final int e = 20;

   @Override
   public MapCodec<dpq> a() {
      return b;
   }

   public dpq(ebp.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)).b(c, ecu.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jc.b ? 15 : 0;
      }
   }

   private void a(dkj $$0, iw $$1, ebq $$2) {
      if (this.a($$2, (dkm)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<cuv> $$5 = this.a($$0, $$1, cuv.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            ebq $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            ebq $$7 = $$2.b(d, Boolean.valueOf(false));
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

   protected void b(dkj $$0, iw $$1, ebq $$2, boolean $$3) {
      dtv $$4 = new dtv($$0, $$1, $$2);

      for (iw $$6 : $$4.a()) {
         ebq $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         ebq $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ect<ecu> c() {
      return c;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      if ($$0.c(d)) {
         List<cvf> $$3 = this.a($$1, $$2, cvf.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<cuv> $$4 = this.a($$1, $$2, cuv.class, bxl.d);
         if (!$$4.isEmpty()) {
            return cwb.b((buv)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cuv> List<T> a(dkj $$0, iw $$1, Class<T> $$2, Predicate<bxe> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ffx a(iw $$0) {
      double $$1 = 0.2;
      return new ffx(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      switch ($$1) {
         case c:
            switch ((ecu)$$0.c(c)) {
               case c:
                  return $$0.b(c, ecu.d);
               case d:
                  return $$0.b(c, ecu.c);
               case e:
                  return $$0.b(c, ecu.f);
               case f:
                  return $$0.b(c, ecu.e);
               case g:
                  return $$0.b(c, ecu.i);
               case h:
                  return $$0.b(c, ecu.j);
               case i:
                  return $$0.b(c, ecu.g);
               case j:
                  return $$0.b(c, ecu.h);
            }
         case d:
            switch ((ecu)$$0.c(c)) {
               case c:
                  return $$0.b(c, ecu.e);
               case d:
                  return $$0.b(c, ecu.f);
               case e:
                  return $$0.b(c, ecu.d);
               case f:
                  return $$0.b(c, ecu.c);
               case g:
                  return $$0.b(c, ecu.j);
               case h:
                  return $$0.b(c, ecu.g);
               case i:
                  return $$0.b(c, ecu.h);
               case j:
                  return $$0.b(c, ecu.i);
               case a:
                  return $$0.b(c, ecu.b);
               case b:
                  return $$0.b(c, ecu.a);
            }
         case b:
            switch ((ecu)$$0.c(c)) {
               case c:
                  return $$0.b(c, ecu.f);
               case d:
                  return $$0.b(c, ecu.e);
               case e:
                  return $$0.b(c, ecu.c);
               case f:
                  return $$0.b(c, ecu.d);
               case g:
                  return $$0.b(c, ecu.h);
               case h:
                  return $$0.b(c, ecu.i);
               case i:
                  return $$0.b(c, ecu.j);
               case j:
                  return $$0.b(c, ecu.g);
               case a:
                  return $$0.b(c, ecu.b);
               case b:
                  return $$0.b(c, ecu.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      ecu $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ecu.f);
               case f:
                  return $$0.b(c, ecu.e);
               case g:
                  return $$0.b(c, ecu.j);
               case h:
                  return $$0.b(c, ecu.i);
               case i:
                  return $$0.b(c, ecu.h);
               case j:
                  return $$0.b(c, ecu.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ecu.d);
               case d:
                  return $$0.b(c, ecu.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ecu.h);
               case h:
                  return $$0.b(c, ecu.g);
               case i:
                  return $$0.b(c, ecu.j);
               case j:
                  return $$0.b(c, ecu.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d, a);
   }
}
