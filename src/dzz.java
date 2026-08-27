import com.mojang.serialization.Codec;

public enum dzz implements avl {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dzz> e = avl.a(dzz::values);
   private final String f;

   private dzz(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
