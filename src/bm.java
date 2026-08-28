import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bm(di.c b, di.c c, di.c d, di.c e, di.c f) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               di.c.d.optionalFieldOf("x", di.c.c).forGetter(bm::a),
               di.c.d.optionalFieldOf("y", di.c.c).forGetter(bm::b),
               di.c.d.optionalFieldOf("z", di.c.c).forGetter(bm::c),
               di.c.d.optionalFieldOf("horizontal", di.c.c).forGetter(bm::d),
               di.c.d.optionalFieldOf("absolute", di.c.c).forGetter(bm::e)
            )
            .apply($$0, bm::new)
   );

   public static bm a(di.c $$0) {
      return new bm(di.c.c, di.c.c, di.c.c, $$0, di.c.c);
   }

   public static bm b(di.c $$0) {
      return new bm(di.c.c, $$0, di.c.c, di.c.c, di.c.c);
   }

   public static bm c(di.c $$0) {
      return new bm(di.c.c, di.c.c, di.c.c, di.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)azj.e($$6)) || !this.c.d((double)azj.e($$7)) || !this.d.d((double)azj.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public di.c a() {
      return this.b;
   }

   public di.c b() {
      return this.c;
   }

   public di.c c() {
      return this.d;
   }

   public di.c d() {
      return this.e;
   }

   public di.c e() {
      return this.f;
   }
}
