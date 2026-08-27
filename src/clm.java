import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class clm {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<clm> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lh.y.q().fieldOf("type").orElseGet(() -> clq.c).forGetter($$0x -> $$0x.f),
               lh.z.q().fieldOf("profession").orElseGet(() -> clo.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, clm::new)
   );
   public static final zc<wp, clm> d = zc.a(za.a(li.ar), $$0 -> $$0.f, za.a(li.aq), $$0 -> $$0.g, za.g, $$0 -> $$0.h, clm::new);
   private final clq f;
   private final clo g;
   private final int h;

   public clm(clq $$0, clo $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public clq a() {
      return this.f;
   }

   public clo b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public clm a(clq $$0) {
      return new clm($$0, this.g, this.h);
   }

   public clm a(clo $$0) {
      return new clm(this.f, $$0, this.h);
   }

   public clm a(int $$0) {
      return new clm(this.f, this.g, $$0);
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
