import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgc extends dmc implements dmr {
   public static final MapCodec<dgc> a = b(dgc::new);
   public static final dtt b = dts.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final exn e = dfc.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final exn f = dfc.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final exn g = dfc.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public dgc(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, iw.a.b));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((iw.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(b) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
