import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dix extends dfc implements dmr {
   public static final MapCodec<dix> a = b(dix::new);
   private static final dtt c = dts.C;
   protected static final exn b = dfc.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   protected dix(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      if ($$1 != null) {
         epe $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == epf.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.c();
      dtc $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, iw.a);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.b && !this.a($$0, $$3, $$4)) {
         return dfe.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
