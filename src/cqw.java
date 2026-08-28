import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqw(jf<cra> e, jf<cqy> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cqw> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mg.w.r().fieldOf("type").orElseGet(() -> mg.w.b(cra.c)).forGetter($$0x -> $$0x.e),
               mg.x.r().fieldOf("profession").orElseGet(() -> mg.x.b(cqy.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cqw::new)
   );
   public static final yw<wj, cqw> d = yw.a(yu.b(mh.aE), cqw::a, yu.b(mh.aD), cqw::b, yu.h, cqw::c, cqw::new);

   public cqw(jf<cra> e, jf<cqy> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public cqw a(jf<cra> $$0) {
      return new cqw($$0, this.f, this.g);
   }

   public cqw a(jg.a $$0, alf<cra> $$1) {
      return this.a($$0.d($$1));
   }

   public cqw b(jf<cqy> $$0) {
      return new cqw(this.e, $$0, this.g);
   }

   public cqw b(jg.a $$0, alf<cqy> $$1) {
      return this.b($$0.d($$1));
   }

   public cqw a(int $$0) {
      return new cqw(this.e, this.f, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? h[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? h[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }

   public jf<cra> a() {
      return this.e;
   }

   public jf<cqy> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
