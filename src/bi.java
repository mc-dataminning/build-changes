import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bi(cm.c b, cm.c c, cm.c d, cm.c e, cm.c f) {
   public static final Codec<bi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.a(cm.c.d, "x", cm.c.c).forGetter(bi::a),
               avu.a(cm.c.d, "y", cm.c.c).forGetter(bi::b),
               avu.a(cm.c.d, "z", cm.c.c).forGetter(bi::c),
               avu.a(cm.c.d, "horizontal", cm.c.c).forGetter(bi::d),
               avu.a(cm.c.d, "absolute", cm.c.c).forGetter(bi::e)
            )
            .apply($$0, bi::new)
   );

   public static bi a(cm.c $$0) {
      return new bi(cm.c.c, cm.c.c, cm.c.c, $$0, cm.c.c);
   }

   public static bi b(cm.c $$0) {
      return new bi(cm.c.c, $$0, cm.c.c, cm.c.c, cm.c.c);
   }

   public static bi c(cm.c $$0) {
      return new bi(cm.c.c, cm.c.c, cm.c.c, cm.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)awm.e($$6)) || !this.c.d((double)awm.e($$7)) || !this.d.d((double)awm.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public cm.c a() {
      return this.b;
   }

   public cm.c b() {
      return this.c;
   }

   public cm.c c() {
      return this.d;
   }

   public cm.c d() {
      return this.e;
   }

   public cm.c e() {
      return this.f;
   }
}
