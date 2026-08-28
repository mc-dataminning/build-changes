import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpb {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cpb> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ma.w.q().fieldOf("type").orElseGet(() -> cpf.c).forGetter($$0x -> $$0x.f),
               ma.x.q().fieldOf("profession").orElseGet(() -> cpd.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cpb::new)
   );
   public static final zi<wv, cpb> d = zi.a(zg.a(mb.aw), $$0 -> $$0.f, zg.a(mb.av), $$0 -> $$0.g, zg.h, $$0 -> $$0.h, cpb::new);
   private final cpf f;
   private final cpd g;
   private final int h;

   public cpb(cpf $$0, cpd $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cpf a() {
      return this.f;
   }

   public cpd b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cpb a(cpf $$0) {
      return new cpb($$0, this.g, this.h);
   }

   public cpb a(cpd $$0) {
      return new cpb(this.f, $$0, this.h);
   }

   public cpb a(int $$0) {
      return new cpb(this.f, this.g, $$0);
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
