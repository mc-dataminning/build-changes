import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crk(jf<cro> e, jf<crm> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<crk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mg.w.r().fieldOf("type").orElseGet(() -> mg.w.b(cro.c)).forGetter($$0x -> $$0x.e),
               mg.x.r().fieldOf("profession").orElseGet(() -> mg.x.b(crm.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, crk::new)
   );
   public static final yy<wl, crk> d = yy.a(yw.b(mh.aE), crk::a, yw.b(mh.aD), crk::b, yw.h, crk::c, crk::new);

   public crk(jf<cro> e, jf<crm> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public crk a(jf<cro> $$0) {
      return new crk($$0, this.f, this.g);
   }

   public crk a(jg.a $$0, alh<cro> $$1) {
      return this.a($$0.d($$1));
   }

   public crk b(jf<crm> $$0) {
      return new crk(this.e, $$0, this.g);
   }

   public crk b(jg.a $$0, alh<crm> $$1) {
      return this.b($$0.d($$1));
   }

   public crk a(int $$0) {
      return new crk(this.e, this.f, $$0);
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

   public jf<cro> a() {
      return this.e;
   }

   public jf<crm> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
