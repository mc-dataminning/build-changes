import com.mojang.serialization.Codec;

public enum edp implements axq {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<edp> e = axq.a(edp::values);
   private final String f;

   private edp(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
