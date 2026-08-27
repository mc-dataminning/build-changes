import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bj(cu.c b, cu.c c, cu.c d, cu.c e, cu.c f) {
   public static final Codec<bj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(cu.c.d, "x", cu.c.c).forGetter(bj::a),
               axu.a(cu.c.d, "y", cu.c.c).forGetter(bj::b),
               axu.a(cu.c.d, "z", cu.c.c).forGetter(bj::c),
               axu.a(cu.c.d, "horizontal", cu.c.c).forGetter(bj::d),
               axu.a(cu.c.d, "absolute", cu.c.c).forGetter(bj::e)
            )
            .apply($$0, bj::new)
   );

   public static bj a(cu.c $$0) {
      return new bj(cu.c.c, cu.c.c, cu.c.c, $$0, cu.c.c);
   }

   public static bj b(cu.c $$0) {
      return new bj(cu.c.c, $$0, cu.c.c, cu.c.c, cu.c.c);
   }

   public static bj c(cu.c $$0) {
      return new bj(cu.c.c, cu.c.c, cu.c.c, cu.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)aym.e($$6)) || !this.c.d((double)aym.e($$7)) || !this.d.d((double)aym.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public cu.c a() {
      return this.b;
   }

   public cu.c b() {
      return this.c;
   }

   public cu.c c() {
      return this.d;
   }

   public cu.c d() {
      return this.e;
   }

   public cu.c e() {
      return this.f;
   }
}
