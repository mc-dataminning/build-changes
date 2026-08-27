import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxl(List<dxl.a> b, ih c, dtt d, boolean e) implements dxu {
   public static final Codec<dxl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxl.a.a.listOf().fieldOf("layers").forGetter(dxl::a),
               ih.g.fieldOf("direction").forGetter(dxl::b),
               dtt.b.fieldOf("allowed_placement").forGetter(dxl::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dxl::d)
            )
            .apply($$0, dxl::new)
   );

   public static dxl.a a(bmh $$0, dzv $$1) {
      return new dxl.a($$0, $$1);
   }

   public static dxl b(bmh $$0, dzv $$1) {
      return new dxl(List.of(a($$0, $$1)), ih.b, dtt.c, false);
   }

   public List<dxl.a> a() {
      return this.b;
   }

   public ih b() {
      return this.c;
   }

   public dtt c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bmh b, dzv c) {
      public static final Codec<dxl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bmh.d.fieldOf("height").forGetter(dxl.a::a), dzv.a.fieldOf("provider").forGetter(dxl.a::b)).apply($$0, dxl.a::new)
      );

      public bmh a() {
         return this.b;
      }

      public dzv b() {
         return this.c;
      }
   }
}
