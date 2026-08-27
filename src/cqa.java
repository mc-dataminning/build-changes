import com.mojang.serialization.Codec;

public enum cqa implements avl {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final Codec<cqa> e = avl.a(cqa::values);
   private final String f;

   private cqa(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
