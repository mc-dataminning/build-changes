import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqf(je<cqj> e, je<cqh> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cqf> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mf.w.r().fieldOf("type").orElseGet(() -> mf.w.b(cqj.c)).forGetter($$0x -> $$0x.e),
               mf.x.r().fieldOf("profession").orElseGet(() -> mf.x.b(cqh.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cqf::new)
   );
   public static final yu<wh, cqf> d = yu.a(ys.b(mg.aE), cqf::a, ys.b(mg.aD), cqf::b, ys.h, cqf::c, cqf::new);

   public cqf(je<cqj> e, je<cqh> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public cqf a(je<cqj> $$0) {
      return new cqf($$0, this.f, this.g);
   }

   public cqf a(jf.a $$0, ald<cqj> $$1) {
      return this.a($$0.d($$1));
   }

   public cqf b(je<cqh> $$0) {
      return new cqf(this.e, $$0, this.g);
   }

   public cqf b(jf.a $$0, ald<cqh> $$1) {
      return this.b($$0.d($$1));
   }

   public cqf a(int $$0) {
      return new cqf(this.e, this.f, $$0);
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

   public je<cqj> a() {
      return this.e;
   }

   public je<cqh> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
