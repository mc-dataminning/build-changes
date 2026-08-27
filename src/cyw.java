import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyw extends cvf implements dcf {
   public static final MapCodec<cyw> a = b(cyw::new);
   private static final die c = did.C;
   protected static final eks b = cvf.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<cyw> a() {
      return a;
   }

   protected cyw(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = super.a($$0);
      if ($$1 != null) {
         ecx $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == ecy.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.c();
      dhn $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ib.a);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.b && !this.a($$0, $$3, $$4)) {
         return cvh.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
