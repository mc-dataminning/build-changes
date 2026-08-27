import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzq(List<dzq.a> b, ih c, dvy d, boolean e) implements dzz {
   public static final Codec<dzq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzq.a.a.listOf().fieldOf("layers").forGetter(dzq::a),
               ih.g.fieldOf("direction").forGetter(dzq::b),
               dvy.b.fieldOf("allowed_placement").forGetter(dzq::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dzq::d)
            )
            .apply($$0, dzq::new)
   );

   public static dzq.a a(bnf $$0, eca $$1) {
      return new dzq.a($$0, $$1);
   }

   public static dzq b(bnf $$0, eca $$1) {
      return new dzq(List.of(a($$0, $$1)), ih.b, dvy.c, false);
   }

   public List<dzq.a> a() {
      return this.b;
   }

   public ih b() {
      return this.c;
   }

   public dvy c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bnf b, eca c) {
      public static final Codec<dzq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bnf.d.fieldOf("height").forGetter(dzq.a::a), eca.a.fieldOf("provider").forGetter(dzq.a::b)).apply($$0, dzq.a::new)
      );

      public bnf a() {
         return this.b;
      }

      public eca b() {
         return this.c;
      }
   }
}
