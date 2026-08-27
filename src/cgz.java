import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cgz {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cgz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.y.q().fieldOf("type").orElseGet(() -> chd.c).forGetter($$0x -> $$0x.f),
               kf.z.q().fieldOf("profession").orElseGet(() -> chb.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cgz::new)
   );
   public static final xo<vb, cgz> d = xo.a(xm.a(kg.aq), $$0 -> $$0.f, xm.a(kg.ap), $$0 -> $$0.g, xm.d, $$0 -> $$0.h, cgz::new);
   private final chd f;
   private final chb g;
   private final int h;

   public cgz(chd $$0, chb $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public chd a() {
      return this.f;
   }

   public chb b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cgz a(chd $$0) {
      return new cgz($$0, this.g, this.h);
   }

   public cgz a(chb $$0) {
      return new cgz(this.f, $$0, this.h);
   }

   public cgz a(int $$0) {
      return new cgz(this.f, this.g, $$0);
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
