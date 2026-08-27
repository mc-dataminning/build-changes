import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzz(List<dzz.a> b, ij c, dwh d, boolean e) implements eai {
   public static final Codec<dzz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzz.a.a.listOf().fieldOf("layers").forGetter(dzz::a),
               ij.g.fieldOf("direction").forGetter(dzz::b),
               dwh.b.fieldOf("allowed_placement").forGetter(dzz::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dzz::d)
            )
            .apply($$0, dzz::new)
   );

   public static dzz.a a(bnk $$0, ecj $$1) {
      return new dzz.a($$0, $$1);
   }

   public static dzz b(bnk $$0, ecj $$1) {
      return new dzz(List.of(a($$0, $$1)), ij.b, dwh.c, false);
   }

   public List<dzz.a> a() {
      return this.b;
   }

   public ij b() {
      return this.c;
   }

   public dwh c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bnk b, ecj c) {
      public static final Codec<dzz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bnk.d.fieldOf("height").forGetter(dzz.a::a), ecj.a.fieldOf("provider").forGetter(dzz.a::b)).apply($$0, dzz.a::new)
      );

      public bnk a() {
         return this.b;
      }

      public ecj b() {
         return this.c;
      }
   }
}
