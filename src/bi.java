import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bi(cs.c b, cs.c c, cs.c d, cs.c e, cs.c f) {
   public static final Codec<bi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(cs.c.d, "x", cs.c.c).forGetter(bi::a),
               axe.a(cs.c.d, "y", cs.c.c).forGetter(bi::b),
               axe.a(cs.c.d, "z", cs.c.c).forGetter(bi::c),
               axe.a(cs.c.d, "horizontal", cs.c.c).forGetter(bi::d),
               axe.a(cs.c.d, "absolute", cs.c.c).forGetter(bi::e)
            )
            .apply($$0, bi::new)
   );

   public static bi a(cs.c $$0) {
      return new bi(cs.c.c, cs.c.c, cs.c.c, $$0, cs.c.c);
   }

   public static bi b(cs.c $$0) {
      return new bi(cs.c.c, $$0, cs.c.c, cs.c.c, cs.c.c);
   }

   public static bi c(cs.c $$0) {
      return new bi(cs.c.c, cs.c.c, cs.c.c, cs.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)axw.e($$6)) || !this.c.d((double)axw.e($$7)) || !this.d.d((double)axw.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public cs.c a() {
      return this.b;
   }

   public cs.c b() {
      return this.c;
   }

   public cs.c c() {
      return this.d;
   }

   public cs.c d() {
      return this.e;
   }

   public cs.c e() {
      return this.f;
   }
}
