import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyc extends cys implements dfs {
   public static final dma d = dlz.C;
   private static final eos a = cys.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cyc(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cyc> a();

   protected void a(dlj $$0, cvs $$1, hz $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(dlj $$0, cux $$1, hz $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ie $$3 : ie.values()) {
            if ($$1.b_($$2.a($$3)).a(auf.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(auf.a) && $$1.e() == 8));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return a;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return $$1 == ie.a && !this.a($$0, (cvu)$$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ie.b);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(d);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(d) ? egx.c.a(false) : super.c_($$0);
   }
}
