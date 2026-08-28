import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmy(jg<awx> e, jg<awx> f, jg<awx> g, jg<awx> h, jg<awx> i, jg<awx> j) {
   public static final Codec<cmy> a = g();
   public static final Codec<cmy> b = g();
   public static final Codec<jg<cmy>> c = alo.a(mi.bn);
   public static final ze<wp, jg<cmy>> d = zc.b(mi.bn);

   private static Codec<cmy> g() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awx.b.fieldOf("ambient_sound").forGetter(cmy::a),
                  awx.b.fieldOf("death_sound").forGetter(cmy::b),
                  awx.b.fieldOf("growl_sound").forGetter(cmy::c),
                  awx.b.fieldOf("hurt_sound").forGetter(cmy::d),
                  awx.b.fieldOf("pant_sound").forGetter(cmy::e),
                  awx.b.fieldOf("whine_sound").forGetter(cmy::f)
               )
               .apply($$0, cmy::new)
      );
   }

   public jg<awx> a() {
      return this.e;
   }

   public jg<awx> b() {
      return this.f;
   }

   public jg<awx> c() {
      return this.g;
   }

   public jg<awx> d() {
      return this.h;
   }

   public jg<awx> e() {
      return this.i;
   }

   public jg<awx> f() {
      return this.j;
   }
}
