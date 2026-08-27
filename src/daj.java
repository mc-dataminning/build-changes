import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daj extends ctc {
   public static final MapCodec<daj> a = b(daj::new);
   public static final int b = 8;
   public static final dgd c = dft.aF;
   protected static final eia[] d = new eia[]{
      ehx.a(),
      ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   protected daj(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
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
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public eia b(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public float b(dfd $$0, cph $$1, gw $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2.d());
      if ($$3.a(apv.cg)) {
         return false;
      } else {
         return $$3.a(apv.ch) ? true : ctc.a($$3.k($$1, $$2.d()), ha.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.a(cqk.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ha.b : true;
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }
}
