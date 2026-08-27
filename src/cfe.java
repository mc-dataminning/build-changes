import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cfe {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cfe> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.y.q().fieldOf("type").orElseGet(() -> cfi.c).forGetter($$0x -> $$0x.e),
               kd.z.q().fieldOf("profession").orElseGet(() -> cfg.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cfe::new)
   );
   private final cfi e;
   private final cfg f;
   private final int g;

   public cfe(cfi $$0, cfg $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cfi a() {
      return this.e;
   }

   public cfg b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cfe a(cfi $$0) {
      return new cfe($$0, this.f, this.g);
   }

   public cfe a(cfg $$0) {
      return new cfe(this.e, $$0, this.g);
   }

   public cfe a(int $$0) {
      return new cfe(this.e, this.f, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? d[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? d[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }
}
