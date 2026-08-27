import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cdi {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cdi> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.z.q().fieldOf("type").orElseGet(() -> cdm.c).forGetter($$0x -> $$0x.e),
               jy.A.q().fieldOf("profession").orElseGet(() -> cdk.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cdi::new)
   );
   private final cdm e;
   private final cdk f;
   private final int g;

   public cdi(cdm $$0, cdk $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cdm a() {
      return this.e;
   }

   public cdk b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cdi a(cdm $$0) {
      return new cdi($$0, this.f, this.g);
   }

   public cdi a(cdk $$0) {
      return new cdi(this.e, $$0, this.g);
   }

   public cdi a(int $$0) {
      return new cdi(this.e, this.f, $$0);
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
