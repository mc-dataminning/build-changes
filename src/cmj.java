import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmj {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cmj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.y.q().fieldOf("type").orElseGet(() -> cmn.c).forGetter($$0x -> $$0x.f),
               lp.z.q().fieldOf("profession").orElseGet(() -> cml.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cmj::new)
   );
   public static final zm<wz, cmj> d = zm.a(zk.a(lq.ar), $$0 -> $$0.f, zk.a(lq.aq), $$0 -> $$0.g, zk.g, $$0 -> $$0.h, cmj::new);
   private final cmn f;
   private final cml g;
   private final int h;

   public cmj(cmn $$0, cml $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cmn a() {
      return this.f;
   }

   public cml b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cmj a(cmn $$0) {
      return new cmj($$0, this.g, this.h);
   }

   public cmj a(cml $$0) {
      return new cmj(this.f, $$0, this.h);
   }

   public cmj a(int $$0) {
      return new cmj(this.f, this.g, $$0);
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
