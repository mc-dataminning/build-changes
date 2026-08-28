import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cog {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cog> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lz.w.q().fieldOf("type").orElseGet(() -> cok.c).forGetter($$0x -> $$0x.f),
               lz.x.q().fieldOf("profession").orElseGet(() -> coi.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cog::new)
   );
   public static final zh<wu, cog> d = zh.a(zf.a(ma.aw), $$0 -> $$0.f, zf.a(ma.av), $$0 -> $$0.g, zf.h, $$0 -> $$0.h, cog::new);
   private final cok f;
   private final coi g;
   private final int h;

   public cog(cok $$0, coi $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cok a() {
      return this.f;
   }

   public coi b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cog a(cok $$0) {
      return new cog($$0, this.g, this.h);
   }

   public cog a(coi $$0) {
      return new cog(this.f, $$0, this.h);
   }

   public cog a(int $$0) {
      return new cog(this.f, this.g, $$0);
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
