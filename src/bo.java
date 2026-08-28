import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bo(cv.c b, cv.c c, cv.c d, cv.c e, cv.c f) {
   public static final Codec<bo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cv.c.d.optionalFieldOf("x", cv.c.c).forGetter(bo::a),
               cv.c.d.optionalFieldOf("y", cv.c.c).forGetter(bo::b),
               cv.c.d.optionalFieldOf("z", cv.c.c).forGetter(bo::c),
               cv.c.d.optionalFieldOf("horizontal", cv.c.c).forGetter(bo::d),
               cv.c.d.optionalFieldOf("absolute", cv.c.c).forGetter(bo::e)
            )
            .apply($$0, bo::new)
   );

   public static bo a(cv.c $$0) {
      return new bo(cv.c.c, cv.c.c, cv.c.c, $$0, cv.c.c);
   }

   public static bo b(cv.c $$0) {
      return new bo(cv.c.c, $$0, cv.c.c, cv.c.c, cv.c.c);
   }

   public static bo c(cv.c $$0) {
      return new bo(cv.c.c, cv.c.c, cv.c.c, cv.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)azk.e($$6)) || !this.c.d((double)azk.e($$7)) || !this.d.d((double)azk.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public cv.c a() {
      return this.b;
   }

   public cv.c b() {
      return this.c;
   }

   public cv.c c() {
      return this.d;
   }

   public cv.c d() {
      return this.e;
   }

   public cv.c e() {
      return this.f;
   }
}
