import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmg {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cmg> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.y.q().fieldOf("type").orElseGet(() -> cmk.c).forGetter($$0x -> $$0x.f),
               lp.z.q().fieldOf("profession").orElseGet(() -> cmi.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cmg::new)
   );
   public static final zj<ww, cmg> d = zj.a(zh.a(lq.ar), $$0 -> $$0.f, zh.a(lq.aq), $$0 -> $$0.g, zh.g, $$0 -> $$0.h, cmg::new);
   private final cmk f;
   private final cmi g;
   private final int h;

   public cmg(cmk $$0, cmi $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cmk a() {
      return this.f;
   }

   public cmi b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cmg a(cmk $$0) {
      return new cmg($$0, this.g, this.h);
   }

   public cmg a(cmi $$0) {
      return new cmg(this.f, $$0, this.h);
   }

   public cmg a(int $$0) {
      return new cmg(this.f, this.g, $$0);
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
