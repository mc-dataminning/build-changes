import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ckv {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<ckv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ld.y.q().fieldOf("type").orElseGet(() -> ckz.c).forGetter($$0x -> $$0x.f),
               ld.z.q().fieldOf("profession").orElseGet(() -> ckx.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ckv::new)
   );
   public static final ys<wf, ckv> d = ys.a(yq.a(le.ar), $$0 -> $$0.f, yq.a(le.aq), $$0 -> $$0.g, yq.f, $$0 -> $$0.h, ckv::new);
   private final ckz f;
   private final ckx g;
   private final int h;

   public ckv(ckz $$0, ckx $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public ckz a() {
      return this.f;
   }

   public ckx b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public ckv a(ckz $$0) {
      return new ckv($$0, this.g, this.h);
   }

   public ckv a(ckx $$0) {
      return new ckv(this.f, $$0, this.h);
   }

   public ckv a(int $$0) {
      return new ckv(this.f, this.g, $$0);
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
