import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cbd {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cbd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.z.q().fieldOf("type").orElseGet(() -> cbh.c).forGetter($$0x -> $$0x.e),
               jd.A.q().fieldOf("profession").orElseGet(() -> cbf.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cbd::new)
   );
   private final cbh e;
   private final cbf f;
   private final int g;

   public cbd(cbh $$0, cbf $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cbh a() {
      return this.e;
   }

   public cbf b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cbd a(cbh $$0) {
      return new cbd($$0, this.f, this.g);
   }

   public cbd a(cbf $$0) {
      return new cbd(this.e, $$0, this.g);
   }

   public cbd a(int $$0) {
      return new cbd(this.e, this.f, $$0);
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
