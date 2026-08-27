import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cud extends cut implements dbt {
   public static final dhn d = dhm.C;
   private static final ekb a = cut.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cud(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cud> a();

   protected void a(dgw $$0, crt $$1, ht $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dgw $$0, cqy $$1, ht $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (hx $$3 : hx.values()) {
            if ($$1.b_($$2.a($$3)).a(arh.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(arh.a) && $$1.e() == 8));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return a;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1 == hx.a && !this.a($$0, (crv)$$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hx.b);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(d) ? ech.c.a(false) : super.c_($$0);
   }
}
