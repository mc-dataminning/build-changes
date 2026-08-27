import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bi(ct.c b, ct.c c, ct.c d, ct.c e, ct.c f) {
   public static final Codec<bi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(ct.c.d, "x", ct.c.c).forGetter(bi::a),
               axh.a(ct.c.d, "y", ct.c.c).forGetter(bi::b),
               axh.a(ct.c.d, "z", ct.c.c).forGetter(bi::c),
               axh.a(ct.c.d, "horizontal", ct.c.c).forGetter(bi::d),
               axh.a(ct.c.d, "absolute", ct.c.c).forGetter(bi::e)
            )
            .apply($$0, bi::new)
   );

   public static bi a(ct.c $$0) {
      return new bi(ct.c.c, ct.c.c, ct.c.c, $$0, ct.c.c);
   }

   public static bi b(ct.c $$0) {
      return new bi(ct.c.c, $$0, ct.c.c, ct.c.c, ct.c.c);
   }

   public static bi c(ct.c $$0) {
      return new bi(ct.c.c, ct.c.c, ct.c.c, ct.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)axz.e($$6)) || !this.c.d((double)axz.e($$7)) || !this.d.d((double)axz.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public ct.c a() {
      return this.b;
   }

   public ct.c b() {
      return this.c;
   }

   public ct.c c() {
      return this.d;
   }

   public ct.c d() {
      return this.e;
   }

   public ct.c e() {
      return this.f;
   }
}
