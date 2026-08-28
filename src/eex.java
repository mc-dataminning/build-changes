import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eex(List<eex.a> b, jj c, ebd d, boolean e) implements efg {
   public static final Codec<eex> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eex.a.a.listOf().fieldOf("layers").forGetter(eex::a),
               jj.g.fieldOf("direction").forGetter(eex::b),
               ebd.b.fieldOf("allowed_placement").forGetter(eex::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eex::d)
            )
            .apply($$0, eex::new)
   );

   public static eex.a a(bqp $$0, ehh $$1) {
      return new eex.a($$0, $$1);
   }

   public static eex b(bqp $$0, ehh $$1) {
      return new eex(List.of(a($$0, $$1)), jj.b, ebd.c, false);
   }

   public List<eex.a> a() {
      return this.b;
   }

   public jj b() {
      return this.c;
   }

   public ebd c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bqp b, ehh c) {
      public static final Codec<eex.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bqp.d.fieldOf("height").forGetter(eex.a::a), ehh.a.fieldOf("provider").forGetter(eex.a::b)).apply($$0, eex.a::new)
      );

      public bqp a() {
         return this.b;
      }

      public ehh b() {
         return this.c;
      }
   }
}
