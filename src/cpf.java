import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpf {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] e = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cpf> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ma.w.q().fieldOf("type").orElseGet(() -> cpj.c).forGetter($$0x -> $$0x.f),
               ma.x.q().fieldOf("profession").orElseGet(() -> cph.b).forGetter($$0x -> $$0x.g),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cpf::new)
   );
   public static final zt<xg, cpf> d = zt.a(zr.a(mb.aw), $$0 -> $$0.f, zr.a(mb.av), $$0 -> $$0.g, zr.h, $$0 -> $$0.h, cpf::new);
   private final cpj f;
   private final cph g;
   private final int h;

   public cpf(cpj $$0, cph $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = Math.max(1, $$2);
   }

   public cpj a() {
      return this.f;
   }

   public cph b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cpf a(cpj $$0) {
      return new cpf($$0, this.g, this.h);
   }

   public cpf a(cph $$0) {
      return new cpf(this.f, $$0, this.h);
   }

   public cpf a(int $$0) {
      return new cpf(this.f, this.g, $$0);
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
