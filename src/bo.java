import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bo(dk.c b, dk.c c, dk.c d, dk.c e, dk.c f) {
   public static final Codec<bo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dk.c.d.optionalFieldOf("x", dk.c.c).forGetter(bo::a),
               dk.c.d.optionalFieldOf("y", dk.c.c).forGetter(bo::b),
               dk.c.d.optionalFieldOf("z", dk.c.c).forGetter(bo::c),
               dk.c.d.optionalFieldOf("horizontal", dk.c.c).forGetter(bo::d),
               dk.c.d.optionalFieldOf("absolute", dk.c.c).forGetter(bo::e)
            )
            .apply($$0, bo::new)
   );

   public static bo a(dk.c $$0) {
      return new bo(dk.c.c, dk.c.c, dk.c.c, $$0, dk.c.c);
   }

   public static bo b(dk.c $$0) {
      return new bo(dk.c.c, $$0, dk.c.c, dk.c.c, dk.c.c);
   }

   public static bo c(dk.c $$0) {
      return new bo(dk.c.c, dk.c.c, dk.c.c, dk.c.c, $$0);
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

   public dk.c a() {
      return this.b;
   }

   public dk.c b() {
      return this.c;
   }

   public dk.c c() {
      return this.d;
   }

   public dk.c d() {
      return this.e;
   }

   public dk.c e() {
      return this.f;
   }
}
