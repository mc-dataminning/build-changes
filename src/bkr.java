import com.mojang.serialization.Codec;

public enum bkr implements avk {
   a("hurt", ars.to),
   b("thorns", ars.yA),
   c("drowning", ars.tp),
   d("burning", ars.tr),
   e("poking", ars.ts),
   f("freezing", ars.tq);

   public static final Codec<bkr> g = avk.a(bkr::values);
   private final String h;
   private final arr i;

   private bkr(String $$0, arr $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public arr a() {
      return this.i;
   }
}
