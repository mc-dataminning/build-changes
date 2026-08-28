import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmy extends dno implements duz {
   public static final ech b = ecg.I;
   private static final fgw a = dno.b(12.0, 0.0, 4.0);

   protected dmy(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dmy> a();

   protected void a(ebq $$0, djn $$1, dky $$2, bai $$3, iw $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(ebq $$0, djn $$1, iw $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (jc $$3 : jc.values()) {
            if ($$1.b_($$2.a($$3)).a(axs.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axs.a) && $$1.e() == 8));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4 == jc.a && !this.a($$0, $$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jc.b);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }
}
