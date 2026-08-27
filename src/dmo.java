import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends dfl implements dff, djx {
   public static final MapCodec<dmo> a = b(dmo::new);
   protected static final float b = 6.0F;
   protected static final exn c = dfc.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.d($$1, $$2, iw.b) && !$$0.a(dfe.lH);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return $$1.a(awj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      dtc $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   protected epe b_(dtc $$0) {
      return epf.c.a(false);
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      dtc $$4 = dfe.ch.n();
      dtc $$5 = $$4.a(dnx.d, dty.a);
      ir $$6 = $$2.c();
      if ($$0.a_($$6).a(dfe.al)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cly $$0, dbg $$1, ir $$2, dtc $$3, epd $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, ir $$1, dtc $$2, epe $$3) {
      return false;
   }
}
