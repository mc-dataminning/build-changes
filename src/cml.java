import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cml {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cml> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lt.w.r().fieldOf("type").orElseGet(() -> cmp.c).forGetter($$0x -> $$0x.f),
               lt.x.r().fieldOf("profession").orElseGet(() -> cmn.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cml::new)
   );
   public static final yx<wk, cml> d = yx.a(yv.a(lu.aw), $$0 -> $$0.f, yv.a(lu.av), $$0 -> $$0.g, yv.g, $$0 -> $$0.h, cml::new);
   private final cmp f;
   private final cmn g;
   private final int h;

   public cml(cmp $$0, cmn $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cmp a() {
      return this.f;
   }

   public cmn b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cml a(cmp $$0) {
      return new cml($$0, this.g, this.h);
   }

   public cml a(cmn $$0) {
      return new cml(this.f, $$0, this.h);
   }

   public cml a(int $$0) {
      return new cml(this.f, this.g, $$0);
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
