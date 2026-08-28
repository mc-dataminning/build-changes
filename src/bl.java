import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bl(de.c b, de.c c, de.c d, de.c e, de.c f) {
   public static final Codec<bl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               de.c.d.optionalFieldOf("x", de.c.c).forGetter(bl::a),
               de.c.d.optionalFieldOf("y", de.c.c).forGetter(bl::b),
               de.c.d.optionalFieldOf("z", de.c.c).forGetter(bl::c),
               de.c.d.optionalFieldOf("horizontal", de.c.c).forGetter(bl::d),
               de.c.d.optionalFieldOf("absolute", de.c.c).forGetter(bl::e)
            )
            .apply($$0, bl::new)
   );

   public static bl a(de.c $$0) {
      return new bl(de.c.c, de.c.c, de.c.c, $$0, de.c.c);
   }

   public static bl b(de.c $$0) {
      return new bl(de.c.c, $$0, de.c.c, de.c.c, de.c.c);
   }

   public static bl c(de.c $$0) {
      return new bl(de.c.c, de.c.c, de.c.c, de.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)aye.e($$6)) || !this.c.d((double)aye.e($$7)) || !this.d.d((double)aye.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public de.c a() {
      return this.b;
   }

   public de.c b() {
      return this.c;
   }

   public de.c c() {
      return this.d;
   }

   public de.c d() {
      return this.e;
   }

   public de.c e() {
      return this.f;
   }
}
