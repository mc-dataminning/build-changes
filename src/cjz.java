import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cjz {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cjz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lc.y.q().fieldOf("type").orElseGet(() -> ckd.c).forGetter($$0x -> $$0x.f),
               lc.z.q().fieldOf("profession").orElseGet(() -> ckb.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cjz::new)
   );
   public static final yq<wd, cjz> d = yq.a(yo.a(ld.ar), $$0 -> $$0.f, yo.a(ld.aq), $$0 -> $$0.g, yo.f, $$0 -> $$0.h, cjz::new);
   private final ckd f;
   private final ckb g;
   private final int h;

   public cjz(ckd $$0, ckb $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public ckd a() {
      return this.f;
   }

   public ckb b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cjz a(ckd $$0) {
      return new cjz($$0, this.g, this.h);
   }

   public cjz a(ckb $$0) {
      return new cjz(this.f, $$0, this.h);
   }

   public cjz a(int $$0) {
      return new cjz(this.f, this.g, $$0);
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
