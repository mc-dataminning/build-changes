import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record emf(List<emf.a> b, jb c, eik d, boolean e) implements emp {
   public static final Codec<emf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emf.a.a.listOf().fieldOf("layers").forGetter(emf::a),
               jb.g.fieldOf("direction").forGetter(emf::b),
               eik.b.fieldOf("allowed_placement").forGetter(emf::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(emf::d)
            )
            .apply($$0, emf::new)
   );

   public static emf.a a(btw $$0, eoq $$1) {
      return new emf.a($$0, $$1);
   }

   public static emf b(btw $$0, eoq $$1) {
      return new emf(List.of(a($$0, $$1)), jb.b, eik.c, false);
   }

   public List<emf.a> a() {
      return this.b;
   }

   public jb b() {
      return this.c;
   }

   public eik c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(btw b, eoq c) {
      public static final Codec<emf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btw.d.fieldOf("height").forGetter(emf.a::a), eoq.a.fieldOf("provider").forGetter(emf.a::b)).apply($$0, emf.a::new)
      );

      public btw a() {
         return this.b;
      }

      public eoq b() {
         return this.c;
      }
   }
}
