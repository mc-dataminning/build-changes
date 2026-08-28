import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eia(ekm b, eea c, brq d, int e) implements eid {
   public static final Codec<eia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekm.a.fieldOf("state_provider").forGetter(eia::a),
               eea.b.fieldOf("target").forGetter(eia::b),
               brq.b(0, 8).fieldOf("radius").forGetter(eia::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eia::d)
            )
            .apply($$0, eia::new)
   );

   public ekm a() {
      return this.b;
   }

   public eea b() {
      return this.c;
   }

   public brq c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
