import com.mojang.serialization.Codec;

public enum epr implements bag {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<epr> f = bag.a(epr::values);
   private final String g;

   private epr(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
