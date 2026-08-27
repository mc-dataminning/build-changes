import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eav(int b, int c, int d, in<eeu> e) implements eai {
   public static final Codec<eav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.j.fieldOf("tries").orElse(128).forGetter(eav::a),
               awu.i.fieldOf("xz_spread").orElse(7).forGetter(eav::b),
               awu.i.fieldOf("y_spread").orElse(3).forGetter(eav::c),
               eeu.b.fieldOf("feature").forGetter(eav::d)
            )
            .apply($$0, eav::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public in<eeu> d() {
      return this.e;
   }
}
