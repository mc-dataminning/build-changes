import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elh(List<elh.a> b, ja c, ehn d, boolean e) implements elq {
   public static final Codec<elh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elh.a.a.listOf().fieldOf("layers").forGetter(elh::a),
               ja.g.fieldOf("direction").forGetter(elh::b),
               ehn.b.fieldOf("allowed_placement").forGetter(elh::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(elh::d)
            )
            .apply($$0, elh::new)
   );

   public static elh.a a(bti $$0, enr $$1) {
      return new elh.a($$0, $$1);
   }

   public static elh b(bti $$0, enr $$1) {
      return new elh(List.of(a($$0, $$1)), ja.b, ehn.c, false);
   }

   public List<elh.a> a() {
      return this.b;
   }

   public ja b() {
      return this.c;
   }

   public ehn c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bti b, enr c) {
      public static final Codec<elh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bti.d.fieldOf("height").forGetter(elh.a::a), enr.a.fieldOf("provider").forGetter(elh.a::b)).apply($$0, elh.a::new)
      );

      public bti a() {
         return this.b;
      }

      public enr b() {
         return this.c;
      }
   }
}
