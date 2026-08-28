import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmc(jf<awm> e, jf<awm> f, jf<awm> g, jf<awm> h, jf<awm> i, jf<awm> j) {
   public static final Codec<cmc> a = g();
   public static final Codec<cmc> b = g();
   public static final Codec<jf<cmc>> c = ald.a(mh.bn);
   public static final yw<wj, jf<cmc>> d = yu.b(mh.bn);

   private static Codec<cmc> g() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awm.b.fieldOf("ambient_sound").forGetter(cmc::a),
                  awm.b.fieldOf("death_sound").forGetter(cmc::b),
                  awm.b.fieldOf("growl_sound").forGetter(cmc::c),
                  awm.b.fieldOf("hurt_sound").forGetter(cmc::d),
                  awm.b.fieldOf("pant_sound").forGetter(cmc::e),
                  awm.b.fieldOf("whine_sound").forGetter(cmc::f)
               )
               .apply($$0, cmc::new)
      );
   }

   public jf<awm> a() {
      return this.e;
   }

   public jf<awm> b() {
      return this.f;
   }

   public jf<awm> c() {
      return this.g;
   }

   public jf<awm> d() {
      return this.h;
   }

   public jf<awm> e() {
      return this.i;
   }

   public jf<awm> f() {
      return this.j;
   }
}
