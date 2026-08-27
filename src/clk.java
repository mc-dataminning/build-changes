import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class clk {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<clk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               le.y.q().fieldOf("type").orElseGet(() -> clo.c).forGetter($$0x -> $$0x.f),
               le.z.q().fieldOf("profession").orElseGet(() -> clm.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, clk::new)
   );
   public static final yv<wi, clk> d = yv.a(yt.a(lf.ar), $$0 -> $$0.f, yt.a(lf.aq), $$0 -> $$0.g, yt.f, $$0 -> $$0.h, clk::new);
   private final clo f;
   private final clm g;
   private final int h;

   public clk(clo $$0, clm $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public clo a() {
      return this.f;
   }

   public clm b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public clk a(clo $$0) {
      return new clk($$0, this.g, this.h);
   }

   public clk a(clm $$0) {
      return new clk(this.f, $$0, this.h);
   }

   public clk a(int $$0) {
      return new clk(this.f, this.g, $$0);
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
