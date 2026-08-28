import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bm(dh.c b, dh.c c, dh.c d, dh.c e, dh.c f) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dh.c.d.optionalFieldOf("x", dh.c.c).forGetter(bm::a),
               dh.c.d.optionalFieldOf("y", dh.c.c).forGetter(bm::b),
               dh.c.d.optionalFieldOf("z", dh.c.c).forGetter(bm::c),
               dh.c.d.optionalFieldOf("horizontal", dh.c.c).forGetter(bm::d),
               dh.c.d.optionalFieldOf("absolute", dh.c.c).forGetter(bm::e)
            )
            .apply($$0, bm::new)
   );

   public static bm a(dh.c $$0) {
      return new bm(dh.c.c, dh.c.c, dh.c.c, $$0, dh.c.c);
   }

   public static bm b(dh.c $$0) {
      return new bm(dh.c.c, $$0, dh.c.c, dh.c.c, dh.c.c);
   }

   public static bm c(dh.c $$0) {
      return new bm(dh.c.c, dh.c.c, dh.c.c, dh.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)ayo.e($$6)) || !this.c.d((double)ayo.e($$7)) || !this.d.d((double)ayo.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public dh.c a() {
      return this.b;
   }

   public dh.c b() {
      return this.c;
   }

   public dh.c c() {
      return this.d;
   }

   public dh.c d() {
      return this.e;
   }

   public dh.c e() {
      return this.f;
   }
}
