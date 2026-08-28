import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crm(jg<crq> e, jg<cro> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<crm> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mh.w.r().fieldOf("type").orElseGet(() -> mh.w.b(crq.c)).forGetter($$0x -> $$0x.e),
               mh.x.r().fieldOf("profession").orElseGet(() -> mh.x.b(cro.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, crm::new)
   );
   public static final za<wn, crm> d = za.a(yy.b(mi.aE), crm::a, yy.b(mi.aD), crm::b, yy.h, crm::c, crm::new);

   public crm(jg<crq> e, jg<cro> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public crm a(jg<crq> $$0) {
      return new crm($$0, this.f, this.g);
   }

   public crm a(jh.a $$0, alj<crq> $$1) {
      return this.a($$0.d($$1));
   }

   public crm b(jg<cro> $$0) {
      return new crm(this.e, $$0, this.g);
   }

   public crm b(jh.a $$0, alj<cro> $$1) {
      return this.b($$0.d($$1));
   }

   public crm a(int $$0) {
      return new crm(this.e, this.f, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? h[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? h[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }

   public jg<crq> a() {
      return this.e;
   }

   public jg<cro> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
