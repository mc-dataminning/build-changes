import com.mojang.serialization.Codec;

public enum dsl implements apr {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dsl> e = apr.a(dsl::values);
   private final String f;

   private dsl(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
