import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cdn {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cdn> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kc.z.q().fieldOf("type").orElseGet(() -> cdr.c).forGetter($$0x -> $$0x.e),
               kc.A.q().fieldOf("profession").orElseGet(() -> cdp.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cdn::new)
   );
   private final cdr e;
   private final cdp f;
   private final int g;

   public cdn(cdr $$0, cdp $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cdr a() {
      return this.e;
   }

   public cdp b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cdn a(cdr $$0) {
      return new cdn($$0, this.f, this.g);
   }

   public cdn a(cdp $$0) {
      return new cdn(this.e, $$0, this.g);
   }

   public cdn a(int $$0) {
      return new cdn(this.e, this.f, $$0);
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
