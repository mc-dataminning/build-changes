import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cws extends cur implements dcf {
   public static final MapCodec<cws> a = b(cws::new);
   public static final die b = did.C;
   private static final int d = 3;
   protected static final eks c = cvf.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cws> a() {
      return a;
   }

   public cws(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.z, $$0.B ? dfu::a : dfu::b);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.b;
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(b) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dfd) {
            ((dfd)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(arp.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
