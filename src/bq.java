import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bq(cx.c b, cx.c c, cx.c d, cx.c e, cx.c f) {
   public static final Codec<bq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cx.c.d.optionalFieldOf("x", cx.c.c).forGetter(bq::a),
               cx.c.d.optionalFieldOf("y", cx.c.c).forGetter(bq::b),
               cx.c.d.optionalFieldOf("z", cx.c.c).forGetter(bq::c),
               cx.c.d.optionalFieldOf("horizontal", cx.c.c).forGetter(bq::d),
               cx.c.d.optionalFieldOf("absolute", cx.c.c).forGetter(bq::e)
            )
            .apply($$0, bq::new)
   );

   public static bq a(cx.c $$0) {
      return new bq(cx.c.c, cx.c.c, cx.c.c, $$0, cx.c.c);
   }

   public static bq b(cx.c $$0) {
      return new bq(cx.c.c, $$0, cx.c.c, cx.c.c, cx.c.c);
   }

   public static bq c(cx.c $$0) {
      return new bq(cx.c.c, cx.c.c, cx.c.c, cx.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)azq.e($$6)) || !this.c.d((double)azq.e($$7)) || !this.d.d((double)azq.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public cx.c a() {
      return this.b;
   }

   public cx.c b() {
      return this.c;
   }

   public cx.c c() {
      return this.d;
   }

   public cx.c d() {
      return this.e;
   }

   public cx.c e() {
      return this.f;
   }
}
