import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxr(ead b, dtt c, bmh d, int e) implements dxu {
   public static final Codec<dxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ead.a.fieldOf("state_provider").forGetter(dxr::a),
               dtt.b.fieldOf("target").forGetter(dxr::b),
               bmh.b(0, 8).fieldOf("radius").forGetter(dxr::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dxr::d)
            )
            .apply($$0, dxr::new)
   );

   public ead a() {
      return this.b;
   }

   public dtt b() {
      return this.c;
   }

   public bmh c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
