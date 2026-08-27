import com.mojang.serialization.Codec;

public enum eel implements ayg {
   a(ij.b, 1, "ceiling"),
   b(ij.a, -1, "floor");

   public static final Codec<eel> c = ayg.a(eel::values);
   private final ij d;
   private final int e;
   private final String f;

   private eel(ij $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ij a() {
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
