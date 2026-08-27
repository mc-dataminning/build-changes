import com.mojang.serialization.Codec;

public class eak extends dyu<ebf> {
   public eak(Codec<ebf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebf> $$0) {
      dap $$1 = $$0.b();
      im $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ir $$3 : ir.values()) {
            if ($$3 != ir.a && dlr.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dcx.ff.n().a(dlr.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
