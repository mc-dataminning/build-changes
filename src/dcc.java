import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcc extends cvo implements cvi, czv {
   public static final MapCodec<dcc> a = b(dcc::new);
   protected static final float b = 6.0F;
   protected static final eks c = cvf.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   protected dcc(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.d($$1, $$2, ib.b) && !$$0.a(cvh.kJ);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      return $$1.a(arp.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      dhn $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public ecx c_(dhn $$0) {
      return ecy.c.a(false);
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      dhn $$4 = cvh.bx.o();
      dhn $$5 = $$4.a(ddk.d, dij.a);
      hx $$6 = $$2.c();
      if ($$0.a_($$6).a(cvh.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cdz $$0, crl $$1, hx $$2, dhn $$3, ecw $$4) {
      return false;
   }

   @Override
   public boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      return false;
   }
}
