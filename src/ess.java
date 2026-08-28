import com.mojang.serialization.Codec;

public enum ess implements bag {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<ess> c = bag.b(ess::values);
   private final String d;

   private ess(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
