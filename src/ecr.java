import com.mojang.serialization.Codec;

public enum ecr implements axg {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<ecr> e = axg.a(ecr::values);
   private final String f;

   private ecr(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
