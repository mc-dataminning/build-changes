import com.mojang.serialization.Codec;

public enum bml implements axc {
   a("hurt", atk.tD),
   b("thorns", atk.yP),
   c("drowning", atk.tE),
   d("burning", atk.tG),
   e("poking", atk.tH),
   f("freezing", atk.tF);

   public static final Codec<bml> g = axc.a(bml::values);
   private final String h;
   private final atj i;

   private bml(String $$0, atj $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public atj a() {
      return this.i;
   }
}
