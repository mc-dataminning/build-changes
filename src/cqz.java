import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqz(jf<crd> e, jf<crb> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cqz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mg.w.r().fieldOf("type").orElseGet(() -> mg.w.b(crd.c)).forGetter($$0x -> $$0x.e),
               mg.x.r().fieldOf("profession").orElseGet(() -> mg.x.b(crb.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cqz::new)
   );
   public static final yw<wj, cqz> d = yw.a(yu.b(mh.aE), cqz::a, yu.b(mh.aD), cqz::b, yu.h, cqz::c, cqz::new);

   public cqz(jf<crd> e, jf<crb> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public cqz a(jf<crd> $$0) {
      return new cqz($$0, this.f, this.g);
   }

   public cqz a(jg.a $$0, alf<crd> $$1) {
      return this.a($$0.d($$1));
   }

   public cqz b(jf<crb> $$0) {
      return new cqz(this.e, $$0, this.g);
   }

   public cqz b(jg.a $$0, alf<crb> $$1) {
      return this.b($$0.d($$1));
   }

   public cqz a(int $$0) {
      return new cqz(this.e, this.f, $$0);
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

   public jf<crd> a() {
      return this.e;
   }

   public jf<crb> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
