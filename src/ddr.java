import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddr extends cwj {
   public static final MapCodec<ddr> a = b(ddr::new);
   public static final int b = 8;
   public static final dka c = djq.aF;
   protected static final emf[] d = new emf[]{
      emc.a(),
      cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   protected ddr(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      switch ($$3) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public emf b_(dja $$0, cso $$1, hx $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public emf c(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public float d(dja $$0, cso $$1, hx $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      dja $$3 = $$1.a_($$2.d());
      if ($$3.a(asb.cg)) {
         return false;
      } else {
         return $$3.a(asb.ch) ? true : cwj.a($$3.k($$1, $$2.d()), ic.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.a(ctr.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ic.b : true;
      }
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }
}
