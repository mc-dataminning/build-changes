import com.mojang.serialization.Codec;

public enum bkt implements avl {
   a("hurt", art.tD),
   b("thorns", art.yP),
   c("drowning", art.tE),
   d("burning", art.tG),
   e("poking", art.tH),
   f("freezing", art.tF);

   public static final Codec<bkt> g = avl.a(bkt::values);
   private final String h;
   private final ars i;

   private bkt(String $$0, ars $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public ars a() {
      return this.i;
   }
}
