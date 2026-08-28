import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cod {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cod> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lz.w.q().fieldOf("type").orElseGet(() -> coh.c).forGetter($$0x -> $$0x.f),
               lz.x.q().fieldOf("profession").orElseGet(() -> cof.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cod::new)
   );
   public static final zj<ww, cod> d = zj.a(zh.a(ma.aw), $$0 -> $$0.f, zh.a(ma.av), $$0 -> $$0.g, zh.h, $$0 -> $$0.h, cod::new);
   private final coh f;
   private final cof g;
   private final int h;

   public cod(coh $$0, cof $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public coh a() {
      return this.f;
   }

   public cof b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cod a(coh $$0) {
      return new cod($$0, this.g, this.h);
   }

   public cod a(cof $$0) {
      return new cod(this.f, $$0, this.h);
   }

   public cod a(int $$0) {
      return new cod(this.f, this.g, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? e[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? e[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }
}
