import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record due(int b, int c, int d, ih<dyd> e) implements dtr {
   public static final Codec<due> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.j.fieldOf("tries").orElse(128).forGetter(due::a),
               atq.i.fieldOf("xz_spread").orElse(7).forGetter(due::b),
               atq.i.fieldOf("y_spread").orElse(3).forGetter(due::c),
               dyd.b.fieldOf("feature").forGetter(due::d)
            )
            .apply($$0, due::new)
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

   public ih<dyd> d() {
      return this.e;
   }
}
