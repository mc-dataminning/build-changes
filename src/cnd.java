import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cnd {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cnd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lu.w.q().fieldOf("type").orElseGet(() -> cnh.c).forGetter($$0x -> $$0x.f),
               lu.x.q().fieldOf("profession").orElseGet(() -> cnf.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cnd::new)
   );
   public static final zb<wo, cnd> d = zb.a(yz.a(lv.aw), $$0 -> $$0.f, yz.a(lv.av), $$0 -> $$0.g, yz.g, $$0 -> $$0.h, cnd::new);
   private final cnh f;
   private final cnf g;
   private final int h;

   public cnd(cnh $$0, cnf $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cnh a() {
      return this.f;
   }

   public cnf b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cnd a(cnh $$0) {
      return new cnd($$0, this.g, this.h);
   }

   public cnd a(cnf $$0) {
      return new cnd(this.f, $$0, this.h);
   }

   public cnd a(int $$0) {
      return new cnd(this.f, this.g, $$0);
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
