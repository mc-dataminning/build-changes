import com.mojang.serialization.Codec;

public enum bse implements azz {
   a("hurt", awe.um),
   b("thorns", awe.zD),
   c("drowning", awe.un),
   d("burning", awe.up),
   e("poking", awe.uq),
   f("freezing", awe.uo);

   public static final Codec<bse> g = azz.a(bse::values);
   private final String h;
   private final awd i;

   private bse(final String $$0, final awd $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awd a() {
      return this.i;
   }
}
