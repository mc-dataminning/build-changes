import com.mojang.serialization.Codec;

public enum eha implements ayt {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<eha> e = ayt.a(eha::values);
   private final String f;

   private eha(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
