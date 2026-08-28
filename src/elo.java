import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elo(List<elo.a> b, jb c, ehu d, boolean e) implements elx {
   public static final Codec<elo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elo.a.a.listOf().fieldOf("layers").forGetter(elo::a),
               jb.g.fieldOf("direction").forGetter(elo::b),
               ehu.b.fieldOf("allowed_placement").forGetter(elo::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(elo::d)
            )
            .apply($$0, elo::new)
   );

   public static elo.a a(btl $$0, eny $$1) {
      return new elo.a($$0, $$1);
   }

   public static elo b(btl $$0, eny $$1) {
      return new elo(List.of(a($$0, $$1)), jb.b, ehu.c, false);
   }

   public List<elo.a> a() {
      return this.b;
   }

   public jb b() {
      return this.c;
   }

   public ehu c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(btl b, eny c) {
      public static final Codec<elo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btl.d.fieldOf("height").forGetter(elo.a::a), eny.a.fieldOf("provider").forGetter(elo.a::b)).apply($$0, elo.a::new)
      );

      public btl a() {
         return this.b;
      }

      public eny b() {
         return this.c;
      }
   }
}
