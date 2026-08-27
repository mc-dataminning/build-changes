import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cbb {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cbb> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.z.q().fieldOf("type").orElseGet(() -> cbf.c).forGetter($$0x -> $$0x.e),
               jb.A.q().fieldOf("profession").orElseGet(() -> cbd.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cbb::new)
   );
   private final cbf e;
   private final cbd f;
   private final int g;

   public cbb(cbf $$0, cbd $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cbf a() {
      return this.e;
   }

   public cbd b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cbb a(cbf $$0) {
      return new cbb($$0, this.f, this.g);
   }

   public cbb a(cbd $$0) {
      return new cbb(this.e, $$0, this.g);
   }

   public cbb a(int $$0) {
      return new cbb(this.e, this.f, $$0);
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
