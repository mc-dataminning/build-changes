import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cni {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cni> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lu.w.q().fieldOf("type").orElseGet(() -> cnm.c).forGetter($$0x -> $$0x.f),
               lu.x.q().fieldOf("profession").orElseGet(() -> cnk.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cni::new)
   );
   public static final zb<wo, cni> d = zb.a(yz.a(lv.aw), $$0 -> $$0.f, yz.a(lv.av), $$0 -> $$0.g, yz.g, $$0 -> $$0.h, cni::new);
   private final cnm f;
   private final cnk g;
   private final int h;

   public cni(cnm $$0, cnk $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cnm a() {
      return this.f;
   }

   public cnk b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cni a(cnm $$0) {
      return new cni($$0, this.g, this.h);
   }

   public cni a(cnk $$0) {
      return new cni(this.f, $$0, this.h);
   }

   public cni a(int $$0) {
      return new cni(this.f, this.g, $$0);
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
