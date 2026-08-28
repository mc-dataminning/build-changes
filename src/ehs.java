import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehs(List<ehs.a> b, jn c, edy d, boolean e) implements eib {
   public static final Codec<ehs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehs.a.a.listOf().fieldOf("layers").forGetter(ehs::a),
               jn.g.fieldOf("direction").forGetter(ehs::b),
               edy.b.fieldOf("allowed_placement").forGetter(ehs::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ehs::d)
            )
            .apply($$0, ehs::new)
   );

   public static ehs.a a(bro $$0, ekc $$1) {
      return new ehs.a($$0, $$1);
   }

   public static ehs b(bro $$0, ekc $$1) {
      return new ehs(List.of(a($$0, $$1)), jn.b, edy.c, false);
   }

   public List<ehs.a> a() {
      return this.b;
   }

   public jn b() {
      return this.c;
   }

   public edy c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bro b, ekc c) {
      public static final Codec<ehs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bro.d.fieldOf("height").forGetter(ehs.a::a), ekc.a.fieldOf("provider").forGetter(ehs.a::b)).apply($$0, ehs.a::new)
      );

      public bro a() {
         return this.b;
      }

      public ekc b() {
         return this.c;
      }
   }
}
