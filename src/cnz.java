import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cnz {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cnz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ly.w.q().fieldOf("type").orElseGet(() -> cod.c).forGetter($$0x -> $$0x.f),
               ly.x.q().fieldOf("profession").orElseGet(() -> cob.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cnz::new)
   );
   public static final zg<wt, cnz> d = zg.a(ze.a(lz.aw), $$0 -> $$0.f, ze.a(lz.av), $$0 -> $$0.g, ze.h, $$0 -> $$0.h, cnz::new);
   private final cod f;
   private final cob g;
   private final int h;

   public cnz(cod $$0, cob $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cod a() {
      return this.f;
   }

   public cob b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cnz a(cod $$0) {
      return new cnz($$0, this.g, this.h);
   }

   public cnz a(cob $$0) {
      return new cnz(this.f, $$0, this.h);
   }

   public cnz a(int $$0) {
      return new cnz(this.f, this.g, $$0);
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
