import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbr extends dch implements djh {
   public static final dpz d = dpy.C;
   private static final etc a = dch.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dbr(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dbr> a();

   protected void a(dpi $$0, czh $$1, id $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dpi $$0, cym $$1, id $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ij $$3 : ij.values()) {
            if ($$1.b_($$2.a($$3)).a(avj.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(avj.a) && $$1.e() == 8));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return a;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1 == ij.a && !this.a($$0, (czj)$$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ij.b);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(d);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(d) ? elc.c.a(false) : super.c_($$0);
   }
}
