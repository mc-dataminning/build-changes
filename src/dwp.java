import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwp(List<dwp.a> b, ih c, dsx d, boolean e) implements dwy {
   public static final Codec<dwp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwp.a.a.listOf().fieldOf("layers").forGetter(dwp::a),
               ih.g.fieldOf("direction").forGetter(dwp::b),
               dsx.b.fieldOf("allowed_placement").forGetter(dwp::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dwp::d)
            )
            .apply($$0, dwp::new)
   );

   public static dwp.a a(blq $$0, dyz $$1) {
      return new dwp.a($$0, $$1);
   }

   public static dwp b(blq $$0, dyz $$1) {
      return new dwp(List.of(a($$0, $$1)), ih.b, dsx.c, false);
   }

   public List<dwp.a> a() {
      return this.b;
   }

   public ih b() {
      return this.c;
   }

   public dsx c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(blq b, dyz c) {
      public static final Codec<dwp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(blq.d.fieldOf("height").forGetter(dwp.a::a), dyz.a.fieldOf("provider").forGetter(dwp.a::b)).apply($$0, dwp.a::new)
      );

      public blq a() {
         return this.b;
      }

      public dyz b() {
         return this.c;
      }
   }
}
