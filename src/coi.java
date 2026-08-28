import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class coi {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<coi> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mb.w.q().fieldOf("type").orElseGet(() -> com.c).forGetter($$0x -> $$0x.f),
               mb.x.q().fieldOf("profession").orElseGet(() -> cok.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, coi::new)
   );
   public static final yn<wa, coi> d = yn.a(yl.a(mc.aw), $$0 -> $$0.f, yl.a(mc.av), $$0 -> $$0.g, yl.h, $$0 -> $$0.h, coi::new);
   private final com f;
   private final cok g;
   private final int h;

   public coi(com $$0, cok $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public com a() {
      return this.f;
   }

   public cok b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public coi a(com $$0) {
      return new coi($$0, this.g, this.h);
   }

   public coi a(cok $$0) {
      return new coi(this.f, $$0, this.h);
   }

   public coi a(int $$0) {
      return new coi(this.f, this.g, $$0);
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
