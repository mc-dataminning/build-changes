import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcl extends cua {
   public static final MapCodec<dcl> c = b(dcl::new);

   @Override
   public MapCodec<dcl> a() {
      return c;
   }

   protected dcl(dhm.d $$0) {
      super($$0);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$0, $$2, dfk.B);
   }

   @Override
   protected void a(csf $$0, hx $$1, cdz $$2) {
      dfi $$3 = $$0.c_($$1);
      if ($$3 instanceof dgu) {
         $$2.a((bje)$$3);
         $$2.a(arf.at);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqv.wS, aqw.e, 1.0F, 1.0F, false);
         }

         $$1.a(jw.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
