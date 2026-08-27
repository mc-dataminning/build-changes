import com.mojang.serialization.Codec;

public enum bkq implements avj {
   a("hurt", arr.to),
   b("thorns", arr.yA),
   c("drowning", arr.tp),
   d("burning", arr.tr),
   e("poking", arr.ts),
   f("freezing", arr.tq);

   public static final Codec<bkq> g = avj.a(bkq::values);
   private final String h;
   private final arq i;

   private bkq(String $$0, arq $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public arq a() {
      return this.i;
   }
}
