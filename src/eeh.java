import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeh(egt b, eab c, bpf d, int e) implements eek {
   public static final Codec<eeh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egt.a.fieldOf("state_provider").forGetter(eeh::a),
               eab.b.fieldOf("target").forGetter(eeh::b),
               bpf.b(0, 8).fieldOf("radius").forGetter(eeh::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eeh::d)
            )
            .apply($$0, eeh::new)
   );

   public egt a() {
      return this.b;
   }

   public eab b() {
      return this.c;
   }

   public bpf c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
