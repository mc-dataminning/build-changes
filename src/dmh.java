import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dmh extends dhy implements doz {
   public static final MapCodec<dmh> b = b(dmh::new);
   public static final int c = 7;
   public static final dwd d = dvt.aC;
   public static final dvu e = dvt.v;
   public static final dvu f = dvt.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dmh> a() {
      return b;
   }

   public dmh(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      return ezy.a();
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dvd $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dvd $$0) {
      return 1;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      int $$6 = r($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dvd a(dvd $$0, dew $$1, jg $$2) {
      int $$3 = 7;
      jg.a $$4 = new jg.a();

      for (jl $$5 : jl.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(d, Integer.valueOf($$3));
   }

   private static int r(dvd $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dvd $$0) {
      if ($$0.a(awz.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(f) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jg $$4 = $$2.e();
            dvd $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jl.b)) {
               azn.a($$1, $$2, $$3, lq.l);
            }
         }
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      dvd $$2 = this.m().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == erf.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
