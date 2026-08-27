import com.mojang.serialization.Codec;

public enum dvn implements asu {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dvn> e = asu.a(dvn::values);
   private final String f;

   private dvn(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
