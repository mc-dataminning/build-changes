import com.mojang.serialization.Codec;

public enum bnt implements axq {
   a("hurt", aty.tH),
   b("thorns", aty.yT),
   c("drowning", aty.tI),
   d("burning", aty.tK),
   e("poking", aty.tL),
   f("freezing", aty.tJ);

   public static final Codec<bnt> g = axq.a(bnt::values);
   private final String h;
   private final atx i;

   private bnt(String $$0, atx $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public atx a() {
      return this.i;
   }
}
