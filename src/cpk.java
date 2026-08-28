import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpk {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cpk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ma.w.q().fieldOf("type").orElseGet(() -> cpo.c).forGetter($$0x -> $$0x.f),
               ma.x.q().fieldOf("profession").orElseGet(() -> cpm.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cpk::new)
   );
   public static final zt<xg, cpk> d = zt.a(zr.a(mb.aw), $$0 -> $$0.f, zr.a(mb.av), $$0 -> $$0.g, zr.h, $$0 -> $$0.h, cpk::new);
   private final cpo f;
   private final cpm g;
   private final int h;

   public cpk(cpo $$0, cpm $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cpo a() {
      return this.f;
   }

   public cpm b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cpk a(cpo $$0) {
      return new cpk($$0, this.g, this.h);
   }

   public cpk a(cpm $$0) {
      return new cpk(this.f, $$0, this.h);
   }

   public cpk a(int $$0) {
      return new cpk(this.f, this.g, $$0);
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
