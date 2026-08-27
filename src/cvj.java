import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvj extends cvz implements dcz {
   public static final djg d = djf.C;
   private static final elu a = cvz.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cvj(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cvj> a();

   protected void a(dip $$0, csz $$1, hv $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(dip $$0, cse $$1, hv $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ia $$3 : ia.values()) {
            if ($$1.b_($$2.a($$3)).a(arw.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(arw.a) && $$1.e() == 8));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return a;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$1 == ia.a && !this.a($$0, (ctb)$$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ia.b);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(d) ? eea.c.a(false) : super.c_($$0);
   }
}
