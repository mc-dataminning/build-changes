import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends div implements djx {
   public static final MapCodec<djk> c = b(djk::new);
   protected static final exn g = dfc.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djk> a() {
      return c;
   }

   protected djk(dtb.d $$0) {
      super($$0, iw.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dtc $$0) {
      return $$0.a(dfe.al);
   }

   @Override
   protected dfc b() {
      return dfe.nb;
   }

   @Override
   protected boolean m(dtc $$0) {
      return !$$0.a(dfe.lH);
   }

   @Override
   public boolean a(@Nullable cly $$0, dbg $$1, ir $$2, dtc $$3, epd $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, ir $$1, dtc $$2, epe $$3) {
      return false;
   }

   @Override
   protected int a(ayt $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return $$1.a(awj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected epe b_(dtc $$0) {
      return epf.c.a(false);
   }
}
