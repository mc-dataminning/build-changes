import com.mojang.serialization.Codec;

public enum egr implements ayq {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<egr> e = ayq.a(egr::values);
   private final String f;

   private egr(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
