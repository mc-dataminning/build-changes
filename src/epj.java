import com.mojang.serialization.Codec;

public enum epj implements bag {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<epj> c = bag.b(epj::values);
   private final String d;

   private epj(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
