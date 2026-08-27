import com.mojang.serialization.Codec;

public enum dwl implements atr {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dwl> e = atr.a(dwl::values);
   private final String f;

   private dwl(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
