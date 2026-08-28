import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class coj {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<coj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mb.w.q().fieldOf("type").orElseGet(() -> coo.c).forGetter($$0x -> $$0x.f),
               mb.x.q().fieldOf("profession").orElseGet(() -> col.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, coj::new)
   );
   public static final yn<wa, coj> d = yn.a(yl.a(mc.aw), $$0 -> $$0.f, yl.a(mc.av), $$0 -> $$0.g, yl.h, $$0 -> $$0.h, coj::new);
   private final coo f;
   private final col g;
   private final int h;

   public coj(coo $$0, col $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public coo a() {
      return this.f;
   }

   public col b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public coj a(coo $$0) {
      return new coj($$0, this.g, this.h);
   }

   public coj a(col $$0) {
      return new coj(this.f, $$0, this.h);
   }

   public coj a(int $$0) {
      return new coj(this.f, this.g, $$0);
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
