import com.mojang.serialization.Codec;

public enum bqd implements ayt {
   a("hurt", avc.tX),
   b("thorns", avc.zj),
   c("drowning", avc.tY),
   d("burning", avc.ua),
   e("poking", avc.ub),
   f("freezing", avc.tZ);

   public static final Codec<bqd> g = ayt.a(bqd::values);
   private final String h;
   private final avb i;

   private bqd(String $$0, avb $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avb a() {
      return this.i;
   }
}
