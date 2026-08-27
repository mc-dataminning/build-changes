import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bg(ck.c b, ck.c c, ck.c d, ck.c e, ck.c f) {
   public static final Codec<bg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.a(ck.c.d, "x", ck.c.c).forGetter(bg::a),
               atv.a(ck.c.d, "y", ck.c.c).forGetter(bg::b),
               atv.a(ck.c.d, "z", ck.c.c).forGetter(bg::c),
               atv.a(ck.c.d, "horizontal", ck.c.c).forGetter(bg::d),
               atv.a(ck.c.d, "absolute", ck.c.c).forGetter(bg::e)
            )
            .apply($$0, bg::new)
   );

   public static bg a(ck.c $$0) {
      return new bg(ck.c.c, ck.c.c, ck.c.c, $$0, ck.c.c);
   }

   public static bg b(ck.c $$0) {
      return new bg(ck.c.c, $$0, ck.c.c, ck.c.c, ck.c.c);
   }

   public static bg c(ck.c $$0) {
      return new bg(ck.c.c, ck.c.c, ck.c.c, ck.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)aun.e($$6)) || !this.c.d((double)aun.e($$7)) || !this.d.d((double)aun.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public ck.c a() {
      return this.b;
   }

   public ck.c b() {
      return this.c;
   }

   public ck.c c() {
      return this.d;
   }

   public ck.c d() {
      return this.e;
   }

   public ck.c e() {
      return this.f;
   }
}
