import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cbi {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cbi> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.z.q().fieldOf("type").orElseGet(() -> cbm.c).forGetter($$0x -> $$0x.e),
               jb.A.q().fieldOf("profession").orElseGet(() -> cbk.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cbi::new)
   );
   private final cbm e;
   private final cbk f;
   private final int g;

   public cbi(cbm $$0, cbk $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cbm a() {
      return this.e;
   }

   public cbk b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cbi a(cbm $$0) {
      return new cbi($$0, this.f, this.g);
   }

   public cbi a(cbk $$0) {
      return new cbi(this.e, $$0, this.g);
   }

   public cbi a(int $$0) {
      return new cbi(this.e, this.f, $$0);
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
