import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class clz {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<clz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lq.w.r().fieldOf("type").orElseGet(() -> cmd.c).forGetter($$0x -> $$0x.f),
               lq.x.r().fieldOf("profession").orElseGet(() -> cmb.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, clz::new)
   );
   public static final ys<wf, clz> d = ys.a(yq.a(lr.av), $$0 -> $$0.f, yq.a(lr.au), $$0 -> $$0.g, yq.g, $$0 -> $$0.h, clz::new);
   private final cmd f;
   private final cmb g;
   private final int h;

   public clz(cmd $$0, cmb $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cmd a() {
      return this.f;
   }

   public cmb b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public clz a(cmd $$0) {
      return new clz($$0, this.g, this.h);
   }

   public clz a(cmb $$0) {
      return new clz(this.f, $$0, this.h);
   }

   public clz a(int $$0) {
      return new clz(this.f, this.g, $$0);
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
