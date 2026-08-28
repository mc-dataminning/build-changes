import com.mojang.serialization.Codec;

public enum eiw implements azu {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eiw> f = azu.a(eiw::values);
   private final String g;

   private eiw(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
