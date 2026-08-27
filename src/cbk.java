import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cbk {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cbk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.z.q().fieldOf("type").orElseGet(() -> cbo.c).forGetter($$0x -> $$0x.e),
               jd.A.q().fieldOf("profession").orElseGet(() -> cbm.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cbk::new)
   );
   private final cbo e;
   private final cbm f;
   private final int g;

   public cbk(cbo $$0, cbm $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cbo a() {
      return this.e;
   }

   public cbm b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cbk a(cbo $$0) {
      return new cbk($$0, this.f, this.g);
   }

   public cbk a(cbm $$0) {
      return new cbk(this.e, $$0, this.g);
   }

   public cbk a(int $$0) {
      return new cbk(this.e, this.f, $$0);
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
