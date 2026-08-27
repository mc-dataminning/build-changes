import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cgv {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cgv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.y.q().fieldOf("type").orElseGet(() -> cgz.c).forGetter($$0x -> $$0x.f),
               kf.z.q().fieldOf("profession").orElseGet(() -> cgx.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cgv::new)
   );
   public static final xo<vb, cgv> d = xo.a(xm.a(kg.aq), $$0 -> $$0.f, xm.a(kg.ap), $$0 -> $$0.g, xm.d, $$0 -> $$0.h, cgv::new);
   private final cgz f;
   private final cgx g;
   private final int h;

   public cgv(cgz $$0, cgx $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cgz a() {
      return this.f;
   }

   public cgx b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cgv a(cgz $$0) {
      return new cgv($$0, this.g, this.h);
   }

   public cgv a(cgx $$0) {
      return new cgv(this.f, $$0, this.h);
   }

   public cgv a(int $$0) {
      return new cgv(this.f, this.g, $$0);
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
