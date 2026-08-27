import com.mojang.serialization.Codec;

public enum efb implements ayq {
   a(ir.b, 1, "ceiling"),
   b(ir.a, -1, "floor");

   public static final Codec<efb> c = ayq.a(efb::values);
   private final ir d;
   private final int e;
   private final String f;

   private efb(ir $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ir a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   @Override
   public String c() {
      return this.f;
   }
}
