import com.mojang.serialization.Codec;

public enum eos implements bab {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eos> c = bab.b(eos::values);
   private final String d;

   private eos(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
