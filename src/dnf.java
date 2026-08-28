import com.mojang.serialization.MapCodec;

public class dnf extends dhs {
   public static final MapCodec<dnf> b = b(dnf::new);
   private static final wz c = wz.c("container.upgrade");

   @Override
   public MapCodec<dnf> a() {
      return b;
   }

   protected dnf(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return new brb(($$2x, $$3, $$4) -> new crt($$2x, $$3, cqg.a($$1, $$2)), c);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.aF);
         return bqr.c;
      }
   }
}
