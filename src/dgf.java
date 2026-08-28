import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgf extends dgv implements dnx {
   public static final dur d = duq.C;
   private static final eyx a = dgv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dgf(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dgf> a();

   protected void a(dua $$0, ddt $$1, je $$2) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.C_().a(40));
      }
   }

   protected static boolean d(dua $$0, dcx $$1, je $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jj $$3 : jj.values()) {
            if ($$1.b_($$2.a($$3)).a(awy.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return this.o().b(d, Boolean.valueOf($$1.a(awy.a) && $$1.e() == 8));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return a;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1 == jj.a && !this.a($$0, (ddv)$$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jj.b);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(d);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(d) ? eqc.c.a(false) : super.b_($$0);
   }
}
