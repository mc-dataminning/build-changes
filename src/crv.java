import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crv(jg<crz> e, jg<crx> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<crv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mh.w.r().fieldOf("type").orElseGet(() -> mh.w.b(crz.c)).forGetter($$0x -> $$0x.e),
               mh.x.r().fieldOf("profession").orElseGet(() -> mh.x.b(crx.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, crv::new)
   );
   public static final ze<wp, crv> d = ze.a(zc.b(mi.aE), crv::a, zc.b(mi.aD), crv::b, zc.h, crv::c, crv::new);

   public crv(jg<crz> e, jg<crx> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public crv a(jg<crz> $$0) {
      return new crv($$0, this.f, this.g);
   }

   public crv a(jh.a $$0, alq<crz> $$1) {
      return this.a($$0.d($$1));
   }

   public crv b(jg<crx> $$0) {
      return new crv(this.e, $$0, this.g);
   }

   public crv b(jh.a $$0, alq<crx> $$1) {
      return this.b($$0.d($$1));
   }

   public crv a(int $$0) {
      return new crv(this.e, this.f, $$0);
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

   public jg<crz> a() {
      return this.e;
   }

   public jg<crx> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
