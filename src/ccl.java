import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ccl {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<ccl> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.z.q().fieldOf("type").orElseGet(() -> ccp.c).forGetter($$0x -> $$0x.e),
               jy.A.q().fieldOf("profession").orElseGet(() -> ccn.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ccl::new)
   );
   private final ccp e;
   private final ccn f;
   private final int g;

   public ccl(ccp $$0, ccn $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public ccp a() {
      return this.e;
   }

   public ccn b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public ccl a(ccp $$0) {
      return new ccl($$0, this.f, this.g);
   }

   public ccl a(ccn $$0) {
      return new ccl(this.e, $$0, this.g);
   }

   public ccl a(int $$0) {
      return new ccl(this.e, this.f, $$0);
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
