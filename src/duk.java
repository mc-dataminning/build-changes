import com.mojang.serialization.MapCodec;

public class duk extends dpp implements dnf {
   public static final MapCodec<duk> b = b(duk::new);
   private static final fgk c = dnc.b(12.0, 0.0, 10.0);

   @Override
   public MapCodec<duk> a() {
      return b;
   }

   protected duk(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return true;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      $$0.b($$2, dne.bF.m());
   }
}
