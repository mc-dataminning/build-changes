import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmm {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cmm> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.y.q().fieldOf("type").orElseGet(() -> cmq.c).forGetter($$0x -> $$0x.f),
               lp.z.q().fieldOf("profession").orElseGet(() -> cmo.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cmm::new)
   );
   public static final zn<xa, cmm> d = zn.a(zl.a(lq.ar), $$0 -> $$0.f, zl.a(lq.aq), $$0 -> $$0.g, zl.g, $$0 -> $$0.h, cmm::new);
   private final cmq f;
   private final cmo g;
   private final int h;

   public cmm(cmq $$0, cmo $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cmq a() {
      return this.f;
   }

   public cmo b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cmm a(cmq $$0) {
      return new cmm($$0, this.g, this.h);
   }

   public cmm a(cmo $$0) {
      return new cmm(this.f, $$0, this.h);
   }

   public cmm a(int $$0) {
      return new cmm(this.f, this.g, $$0);
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
