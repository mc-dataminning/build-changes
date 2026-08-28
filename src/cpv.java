import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cpv(js<cpz> e, js<cpx> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cpv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               md.w.r().fieldOf("type").orElseGet(() -> md.w.b(cpz.c)).forGetter($$0x -> $$0x.e),
               md.x.r().fieldOf("profession").orElseGet(() -> md.x.b(cpx.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cpv::new)
   );
   public static final yt<wg, cpv> d = yt.a(yr.b(me.aw), cpv::a, yr.b(me.av), cpv::b, yr.h, cpv::c, cpv::new);

   public cpv(js<cpz> e, js<cpx> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public cpv a(js<cpz> $$0) {
      return new cpv($$0, this.f, this.g);
   }

   public cpv a(jt.a $$0, alc<cpz> $$1) {
      return this.a($$0.d($$1));
   }

   public cpv b(js<cpx> $$0) {
      return new cpv(this.e, $$0, this.g);
   }

   public cpv b(jt.a $$0, alc<cpx> $$1) {
      return this.b($$0.d($$1));
   }

   public cpv a(int $$0) {
      return new cpv(this.e, this.f, $$0);
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

   public js<cpz> a() {
      return this.e;
   }

   public js<cpx> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
