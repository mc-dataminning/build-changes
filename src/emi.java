import com.mojang.serialization.Codec;

public enum emi implements bag {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<emi> f = bag.a(emi::values);
   private final String g;

   private emi(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
