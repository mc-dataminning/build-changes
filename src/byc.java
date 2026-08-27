import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class byc {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<byc> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.z.q().fieldOf("type").orElseGet(() -> byg.c).forGetter($$0x -> $$0x.e),
               jb.A.q().fieldOf("profession").orElseGet(() -> bye.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, byc::new)
   );
   private final byg e;
   private final bye f;
   private final int g;

   public byc(byg $$0, bye $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public byg a() {
      return this.e;
   }

   public bye b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public byc a(byg $$0) {
      return new byc($$0, this.f, this.g);
   }

   public byc a(bye $$0) {
      return new byc(this.e, $$0, this.g);
   }

   public byc a(int $$0) {
      return new byc(this.e, this.f, $$0);
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
