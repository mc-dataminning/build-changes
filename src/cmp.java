import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmp(jg<awq> e, jg<awq> f, jg<awq> g, jg<awq> h, jg<awq> i, jg<awq> j) {
   public static final Codec<cmp> a = g();
   public static final Codec<cmp> b = g();
   public static final Codec<jg<cmp>> c = alh.a(mi.bn);
   public static final za<wn, jg<cmp>> d = yy.b(mi.bn);

   private static Codec<cmp> g() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awq.b.fieldOf("ambient_sound").forGetter(cmp::a),
                  awq.b.fieldOf("death_sound").forGetter(cmp::b),
                  awq.b.fieldOf("growl_sound").forGetter(cmp::c),
                  awq.b.fieldOf("hurt_sound").forGetter(cmp::d),
                  awq.b.fieldOf("pant_sound").forGetter(cmp::e),
                  awq.b.fieldOf("whine_sound").forGetter(cmp::f)
               )
               .apply($$0, cmp::new)
      );
   }

   public jg<awq> a() {
      return this.e;
   }

   public jg<awq> b() {
      return this.f;
   }

   public jg<awq> c() {
      return this.g;
   }

   public jg<awq> d() {
      return this.h;
   }

   public jg<awq> e() {
      return this.i;
   }

   public jg<awq> f() {
      return this.j;
   }
}
