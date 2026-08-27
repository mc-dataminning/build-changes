import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class del extends dfc implements dmr {
   public static final dtt d = dts.C;
   private static final exn a = dfc.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected del(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends del> a();

   protected void a(dtc $$0, dcb $$1, ir $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(dtc $$0, dbg $$1, ir $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (iw $$3 : iw.values()) {
            if ($$1.b_($$2.a($$3)).a(awj.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(awj.a) && $$1.e() == 8));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return a;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1 == iw.a && !this.a($$0, (dcd)$$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, iw.b);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(d) ? epf.c.a(false) : super.b_($$0);
   }
}
