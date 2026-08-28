import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eco(List<eco.a> b, je c, dyw d, boolean e) implements ecx {
   public static final Codec<eco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eco.a.a.listOf().fieldOf("layers").forGetter(eco::a),
               je.g.fieldOf("direction").forGetter(eco::b),
               dyw.b.fieldOf("allowed_placement").forGetter(eco::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eco::d)
            )
            .apply($$0, eco::new)
   );

   public static eco.a a(bpu $$0, eey $$1) {
      return new eco.a($$0, $$1);
   }

   public static eco b(bpu $$0, eey $$1) {
      return new eco(List.of(a($$0, $$1)), je.b, dyw.c, false);
   }

   public List<eco.a> a() {
      return this.b;
   }

   public je b() {
      return this.c;
   }

   public dyw c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpu b, eey c) {
      public static final Codec<eco.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpu.d.fieldOf("height").forGetter(eco.a::a), eey.a.fieldOf("provider").forGetter(eco.a::b)).apply($$0, eco.a::new)
      );

      public bpu a() {
         return this.b;
      }

      public eey b() {
         return this.c;
      }
   }
}
