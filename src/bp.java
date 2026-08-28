import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bp(cw.c b, cw.c c, cw.c d, cw.c e, cw.c f) {
   public static final Codec<bp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cw.c.d.optionalFieldOf("x", cw.c.c).forGetter(bp::a),
               cw.c.d.optionalFieldOf("y", cw.c.c).forGetter(bp::b),
               cw.c.d.optionalFieldOf("z", cw.c.c).forGetter(bp::c),
               cw.c.d.optionalFieldOf("horizontal", cw.c.c).forGetter(bp::d),
               cw.c.d.optionalFieldOf("absolute", cw.c.c).forGetter(bp::e)
            )
            .apply($$0, bp::new)
   );

   public static bp a(cw.c $$0) {
      return new bp(cw.c.c, cw.c.c, cw.c.c, $$0, cw.c.c);
   }

   public static bp b(cw.c $$0) {
      return new bp(cw.c.c, $$0, cw.c.c, cw.c.c, cw.c.c);
   }

   public static bp c(cw.c $$0) {
      return new bp(cw.c.c, cw.c.c, cw.c.c, cw.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)azo.e($$6)) || !this.c.d((double)azo.e($$7)) || !this.d.d((double)azo.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public cw.c a() {
      return this.b;
   }

   public cw.c b() {
      return this.c;
   }

   public cw.c c() {
      return this.d;
   }

   public cw.c d() {
      return this.e;
   }

   public cw.c e() {
      return this.f;
   }
}
