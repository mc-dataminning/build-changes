import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dto(List<dto.a> b, ic c, dpw d, boolean e) implements dtx {
   public static final Codec<dto> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dto.a.a.listOf().fieldOf("layers").forGetter(dto::a),
               ic.g.fieldOf("direction").forGetter(dto::b),
               dpw.b.fieldOf("allowed_placement").forGetter(dto::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dto::d)
            )
            .apply($$0, dto::new)
   );

   public static dto.a a(bjf $$0, dvy $$1) {
      return new dto.a($$0, $$1);
   }

   public static dto b(bjf $$0, dvy $$1) {
      return new dto(List.of(a($$0, $$1)), ic.b, dpw.c, false);
   }

   public List<dto.a> a() {
      return this.b;
   }

   public ic b() {
      return this.c;
   }

   public dpw c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bjf b, dvy c) {
      public static final Codec<dto.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bjf.d.fieldOf("height").forGetter(dto.a::a), dvy.a.fieldOf("provider").forGetter(dto.a::b)).apply($$0, dto.a::new)
      );

      public bjf a() {
         return this.b;
      }

      public dvy b() {
         return this.c;
      }
   }
}
