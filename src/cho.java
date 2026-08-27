import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cho {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cho> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kh.y.q().fieldOf("type").orElseGet(() -> chs.c).forGetter($$0x -> $$0x.f),
               kh.z.q().fieldOf("profession").orElseGet(() -> chq.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cho::new)
   );
   public static final xq<vd, cho> d = xq.a(xo.a(ki.aq), $$0 -> $$0.f, xo.a(ki.ap), $$0 -> $$0.g, xo.d, $$0 -> $$0.h, cho::new);
   private final chs f;
   private final chq g;
   private final int h;

   public cho(chs $$0, chq $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public chs a() {
      return this.f;
   }

   public chq b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cho a(chs $$0) {
      return new cho($$0, this.g, this.h);
   }

   public cho a(chq $$0) {
      return new cho(this.f, $$0, this.h);
   }

   public cho a(int $$0) {
      return new cho(this.f, this.g, $$0);
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
