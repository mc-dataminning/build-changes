import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cii {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cii> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ki.y.q().fieldOf("type").orElseGet(() -> cim.c).forGetter($$0x -> $$0x.f),
               ki.z.q().fieldOf("profession").orElseGet(() -> cik.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cii::new)
   );
   public static final xs<vf, cii> d = xs.a(xq.a(kj.aq), $$0 -> $$0.f, xq.a(kj.ap), $$0 -> $$0.g, xq.d, $$0 -> $$0.h, cii::new);
   private final cim f;
   private final cik g;
   private final int h;

   public cii(cim $$0, cik $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cim a() {
      return this.f;
   }

   public cik b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cii a(cim $$0) {
      return new cii($$0, this.g, this.h);
   }

   public cii a(cik $$0) {
      return new cii(this.f, $$0, this.h);
   }

   public cii a(int $$0) {
      return new cii(this.f, this.g, $$0);
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
