import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cnl {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cnl> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lv.w.q().fieldOf("type").orElseGet(() -> cnp.c).forGetter($$0x -> $$0x.f),
               lv.x.q().fieldOf("profession").orElseGet(() -> cnn.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cnl::new)
   );
   public static final zc<wp, cnl> d = zc.a(za.a(lw.aw), $$0 -> $$0.f, za.a(lw.av), $$0 -> $$0.g, za.h, $$0 -> $$0.h, cnl::new);
   private final cnp f;
   private final cnn g;
   private final int h;

   public cnl(cnp $$0, cnn $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cnp a() {
      return this.f;
   }

   public cnn b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cnl a(cnp $$0) {
      return new cnl($$0, this.g, this.h);
   }

   public cnl a(cnn $$0) {
      return new cnl(this.f, $$0, this.h);
   }

   public cnl a(int $$0) {
      return new cnl(this.f, this.g, $$0);
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
