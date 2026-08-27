import com.mojang.serialization.Codec;

public enum bmn implements axc {
   a("hurt", atl.tE),
   b("thorns", atl.yQ),
   c("drowning", atl.tF),
   d("burning", atl.tH),
   e("poking", atl.tI),
   f("freezing", atl.tG);

   public static final Codec<bmn> g = axc.a(bmn::values);
   private final String h;
   private final atk i;

   private bmn(String $$0, atk $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public atk a() {
      return this.i;
   }
}
