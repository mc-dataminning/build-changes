import com.mojang.serialization.Codec;

public enum evz implements bax {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<evz> c = bax.b(evz::values);
   private final String d;

   private evz(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
