import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cup extends cvf implements dcf {
   public static final die d = did.C;
   private static final eks a = cvf.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cup(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cup> a();

   protected void a(dhn $$0, csg $$1, hx $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(dhn $$0, crl $$1, hx $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ib $$3 : ib.values()) {
            if ($$1.b_($$2.a($$3)).a(arp.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(arp.a) && $$1.e() == 8));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return a;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1 == ib.a && !this.a($$0, (csi)$$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ib.b);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(d) ? ecy.c.a(false) : super.c_($$0);
   }
}
