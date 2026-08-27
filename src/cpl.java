import com.mojang.serialization.Codec;

public enum cpl implements ave {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final Codec<cpl> e = ave.a(cpl::values);
   private final String f;

   private cpl(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
