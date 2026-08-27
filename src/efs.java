import com.mojang.serialization.Codec;

public enum efs implements aye {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<efs> e = aye.a(efs::values);
   private final String f;

   private efs(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
