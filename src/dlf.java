import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlf extends dpd {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final ebf<ja> b = dqg.e;
   private static final Map<ja.a, ffk> c = ffh.a(
      ffh.a(dmf.b(12.0, 0.0, 4.0), dmf.a(8.0, 10.0, 4.0, 5.0), dmf.a(4.0, 8.0, 5.0, 10.0), dmf.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final wy d = wy.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c));
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aC);
      }

      return bud.a;
   }

   @Nullable
   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return new bul(($$2x, $$3, $$4) -> new cuy($$2x, $$3, cvi.a($$1, $$2)), d);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cng $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, eah $$3, cng $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dja $$0, iu $$1, cng $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public buu a(bwf $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static eah e(eah $$0) {
      if ($$0.a(dmh.ht)) {
         return dmh.hu.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dmh.hu) ? dmh.hv.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   public int b(eah $$0, dig $$1, iu $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
