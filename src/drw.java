import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drw(dui b, dny c, bic d, int e) implements drz {
   public static final Codec<drw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dui.a.fieldOf("state_provider").forGetter(drw::a),
               dny.b.fieldOf("target").forGetter(drw::b),
               bic.b(0, 8).fieldOf("radius").forGetter(drw::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(drw::d)
            )
            .apply($$0, drw::new)
   );

   public dui a() {
      return this.b;
   }

   public dny b() {
      return this.c;
   }

   public bic c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
