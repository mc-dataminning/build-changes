import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cew {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cew> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.y.q().fieldOf("type").orElseGet(() -> cfa.c).forGetter($$0x -> $$0x.e),
               kd.z.q().fieldOf("profession").orElseGet(() -> cey.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cew::new)
   );
   private final cfa e;
   private final cey f;
   private final int g;

   public cew(cfa $$0, cey $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cfa a() {
      return this.e;
   }

   public cey b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cew a(cfa $$0) {
      return new cew($$0, this.f, this.g);
   }

   public cew a(cey $$0) {
      return new cew(this.e, $$0, this.g);
   }

   public cew a(int $$0) {
      return new cew(this.e, this.f, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? d[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? d[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }
}
