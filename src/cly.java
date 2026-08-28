import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cly {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cly> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lq.w.r().fieldOf("type").orElseGet(() -> cmc.c).forGetter($$0x -> $$0x.f),
               lq.x.r().fieldOf("profession").orElseGet(() -> cma.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cly::new)
   );
   public static final ys<wf, cly> d = ys.a(yq.a(lr.av), $$0 -> $$0.f, yq.a(lr.au), $$0 -> $$0.g, yq.g, $$0 -> $$0.h, cly::new);
   private final cmc f;
   private final cma g;
   private final int h;

   public cly(cmc $$0, cma $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cmc a() {
      return this.f;
   }

   public cma b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cly a(cmc $$0) {
      return new cly($$0, this.g, this.h);
   }

   public cly a(cma $$0) {
      return new cly(this.f, $$0, this.h);
   }

   public cly a(int $$0) {
      return new cly(this.f, this.g, $$0);
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
