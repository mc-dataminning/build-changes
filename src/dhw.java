import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dhw extends dlt implements dib, doz {
   public static final MapCodec<dhw> a = b(dhw::new);
   private static final dvu f = dvt.C;
   private static final int g = 6;
   protected static final fab b = dhy.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fab c = dhy.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fab d = dhy.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fab e = dhy.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   protected dhw(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jl.c));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl)$$0.c(aF)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(f) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      dvd $$4 = $$1.a_($$3);
      dvd $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awz.bz)) && ($$5.a(this) || $$5.a(dia.sD));
   }

   protected static boolean a(dew $$0, jg $$1, ere $$2, jl $$3) {
      dvd $$4 = dia.sE.m().b(f, Boolean.valueOf($$2.a(erf.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (($$1 == jl.a || $$1 == jl.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      Optional<jg> $$3 = l.a($$0, $$1, $$2.b(), jl.b, dia.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jg $$4 = $$3.get().d();
         dvd $$5 = $$0.a_($$4);
         return dhv.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      Optional<jg> $$4 = l.a($$0, $$2, $$3.b(), jl.b, dia.sD);
      if (!$$4.isEmpty()) {
         jg $$5 = $$4.get();
         jg $$6 = $$5.d();
         jl $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dhv.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(dia.sD);
   }
}
