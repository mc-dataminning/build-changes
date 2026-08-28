import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqp(je<cqt> e, je<cqr> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cqp> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mf.w.r().fieldOf("type").orElseGet(() -> mf.w.b(cqt.c)).forGetter($$0x -> $$0x.e),
               mf.x.r().fieldOf("profession").orElseGet(() -> mf.x.b(cqr.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cqp::new)
   );
   public static final yw<wj, cqp> d = yw.a(yu.b(mg.aE), cqp::a, yu.b(mg.aD), cqp::b, yu.h, cqp::c, cqp::new);

   public cqp(je<cqt> e, je<cqr> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public cqp a(je<cqt> $$0) {
      return new cqp($$0, this.f, this.g);
   }

   public cqp a(jf.a $$0, alf<cqt> $$1) {
      return this.a($$0.d($$1));
   }

   public cqp b(je<cqr> $$0) {
      return new cqp(this.e, $$0, this.g);
   }

   public cqp b(jf.a $$0, alf<cqr> $$1) {
      return this.b($$0.d($$1));
   }

   public cqp a(int $$0) {
      return new cqp(this.e, this.f, $$0);
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

   public je<cqt> a() {
      return this.e;
   }

   public je<cqr> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
