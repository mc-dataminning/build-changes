import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class caz {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<caz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jc.z.q().fieldOf("type").orElseGet(() -> cbd.c).forGetter($$0x -> $$0x.e),
               jc.A.q().fieldOf("profession").orElseGet(() -> cbb.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, caz::new)
   );
   private final cbd e;
   private final cbb f;
   private final int g;

   public caz(cbd $$0, cbb $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cbd a() {
      return this.e;
   }

   public cbb b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public caz a(cbd $$0) {
      return new caz($$0, this.f, this.g);
   }

   public caz a(cbb $$0) {
      return new caz(this.e, $$0, this.g);
   }

   public caz a(int $$0) {
      return new caz(this.e, this.f, $$0);
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
