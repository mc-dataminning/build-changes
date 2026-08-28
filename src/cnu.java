import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cnu {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cnu> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lx.w.q().fieldOf("type").orElseGet(() -> cny.c).forGetter($$0x -> $$0x.f),
               lx.x.q().fieldOf("profession").orElseGet(() -> cnw.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cnu::new)
   );
   public static final zf<ws, cnu> d = zf.a(zd.a(ly.aw), $$0 -> $$0.f, zd.a(ly.av), $$0 -> $$0.g, zd.h, $$0 -> $$0.h, cnu::new);
   private final cny f;
   private final cnw g;
   private final int h;

   public cnu(cny $$0, cnw $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cny a() {
      return this.f;
   }

   public cnw b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cnu a(cny $$0) {
      return new cnu($$0, this.g, this.h);
   }

   public cnu a(cnw $$0) {
      return new cnu(this.f, $$0, this.h);
   }

   public cnu a(int $$0) {
      return new cnu(this.f, this.g, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? e[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? e[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }
}
