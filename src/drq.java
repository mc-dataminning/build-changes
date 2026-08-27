import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record drq(List<drq.a> b, hx c, dny d, boolean e) implements drz {
   public static final Codec<drq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drq.a.a.listOf().fieldOf("layers").forGetter(drq::a),
               hx.g.fieldOf("direction").forGetter(drq::b),
               dny.b.fieldOf("allowed_placement").forGetter(drq::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(drq::d)
            )
            .apply($$0, drq::new)
   );

   public static drq.a a(bic $$0, dua $$1) {
      return new drq.a($$0, $$1);
   }

   public static drq b(bic $$0, dua $$1) {
      return new drq(List.of(a($$0, $$1)), hx.b, dny.c, false);
   }

   public List<drq.a> a() {
      return this.b;
   }

   public hx b() {
      return this.c;
   }

   public dny c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bic b, dua c) {
      public static final Codec<drq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bic.d.fieldOf("height").forGetter(drq.a::a), dua.a.fieldOf("provider").forGetter(drq.a::b)).apply($$0, drq.a::new)
      );

      public bic a() {
         return this.b;
      }

      public dua b() {
         return this.c;
      }
   }
}
