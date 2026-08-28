import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record emh(List<emh.a> b, jc c, eim d, boolean e) implements emr {
   public static final Codec<emh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emh.a.a.listOf().fieldOf("layers").forGetter(emh::a),
               jc.g.fieldOf("direction").forGetter(emh::b),
               eim.b.fieldOf("allowed_placement").forGetter(emh::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(emh::d)
            )
            .apply($$0, emh::new)
   );

   public static emh.a a(bty $$0, eos $$1) {
      return new emh.a($$0, $$1);
   }

   public static emh b(bty $$0, eos $$1) {
      return new emh(List.of(a($$0, $$1)), jc.b, eim.c, false);
   }

   public List<emh.a> a() {
      return this.b;
   }

   public jc b() {
      return this.c;
   }

   public eim c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bty b, eos c) {
      public static final Codec<emh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bty.d.fieldOf("height").forGetter(emh.a::a), eos.a.fieldOf("provider").forGetter(emh.a::b)).apply($$0, emh.a::new)
      );

      public bty a() {
         return this.b;
      }

      public eos b() {
         return this.c;
      }
   }
}
