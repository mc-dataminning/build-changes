import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bn(dj.c b, dj.c c, dj.c d, dj.c e, dj.c f) {
   public static final Codec<bn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dj.c.d.optionalFieldOf("x", dj.c.c).forGetter(bn::a),
               dj.c.d.optionalFieldOf("y", dj.c.c).forGetter(bn::b),
               dj.c.d.optionalFieldOf("z", dj.c.c).forGetter(bn::c),
               dj.c.d.optionalFieldOf("horizontal", dj.c.c).forGetter(bn::d),
               dj.c.d.optionalFieldOf("absolute", dj.c.c).forGetter(bn::e)
            )
            .apply($$0, bn::new)
   );

   public static bn a(dj.c $$0) {
      return new bn(dj.c.c, dj.c.c, dj.c.c, $$0, dj.c.c);
   }

   public static bn b(dj.c $$0) {
      return new bn(dj.c.c, $$0, dj.c.c, dj.c.c, dj.c.c);
   }

   public static bn c(dj.c $$0) {
      return new bn(dj.c.c, dj.c.c, dj.c.c, dj.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)azn.e($$6)) || !this.c.d((double)azn.e($$7)) || !this.d.d((double)azn.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public dj.c a() {
      return this.b;
   }

   public dj.c b() {
      return this.c;
   }

   public dj.c c() {
      return this.d;
   }

   public dj.c d() {
      return this.e;
   }

   public dj.c e() {
      return this.f;
   }
}
