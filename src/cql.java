import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cql(je<cqp> e, je<cqn> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cql> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               mf.w.r().fieldOf("type").orElseGet(() -> mf.w.b(cqp.c)).forGetter($$0x -> $$0x.e),
               mf.x.r().fieldOf("profession").orElseGet(() -> mf.x.b(cqn.b)).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cql::new)
   );
   public static final yw<wj, cql> d = yw.a(yu.b(mg.aE), cql::a, yu.b(mg.aD), cql::b, yu.h, cql::c, cql::new);

   public cql(je<cqp> e, je<cqn> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public cql a(je<cqp> $$0) {
      return new cql($$0, this.f, this.g);
   }

   public cql a(jf.a $$0, alf<cqp> $$1) {
      return this.a($$0.d($$1));
   }

   public cql b(je<cqn> $$0) {
      return new cql(this.e, $$0, this.g);
   }

   public cql b(jf.a $$0, alf<cqn> $$1) {
      return this.b($$0.d($$1));
   }

   public cql a(int $$0) {
      return new cql(this.e, this.f, $$0);
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

   public je<cqp> a() {
      return this.e;
   }

   public je<cqn> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
