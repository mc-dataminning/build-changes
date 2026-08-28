import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dml extends dhy implements doz {
   public static final MapCodec<dml> a = b(dml::new);
   public static final int b = 15;
   public static final dwd c = dvt.aP;
   public static final dvu d = dvt.C;
   public static final ToIntFunction<dvd> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$3.gH()) {
         $$1.a($$2, $$0.a(c), 2);
         return bry.b;
      } else {
         return bry.c;
      }
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return $$3.a(cwb.hC) ? ezy.b() : ezy.a();
   }

   @Override
   protected boolean e_(dvd $$0) {
      return $$0.y().c();
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.a;
   }

   @Override
   protected float c(dvd $$0, dea $$1, jg $$2) {
      return 1.0F;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(d) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cvx a(cvx $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kt.al, cxz.a.a(c, $$1));
      }

      return $$0;
   }
}
