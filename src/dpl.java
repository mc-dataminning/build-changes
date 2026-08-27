import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpl(List<dpl.a> b, ha c, dlt d, boolean e) implements dpu {
   public static final Codec<dpl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpl.a.a.listOf().fieldOf("layers").forGetter(dpl::a),
               ha.g.fieldOf("direction").forGetter(dpl::b),
               dlt.b.fieldOf("allowed_placement").forGetter(dpl::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dpl::d)
            )
            .apply($$0, dpl::new)
   );

   public static dpl.a a(bgj $$0, drv $$1) {
      return new dpl.a($$0, $$1);
   }

   public static dpl b(bgj $$0, drv $$1) {
      return new dpl(List.of(a($$0, $$1)), ha.b, dlt.c, false);
   }

   public List<dpl.a> a() {
      return this.b;
   }

   public ha b() {
      return this.c;
   }

   public dlt c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bgj b, drv c) {
      public static final Codec<dpl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bgj.d.fieldOf("height").forGetter(dpl.a::a), drv.a.fieldOf("provider").forGetter(dpl.a::b)).apply($$0, dpl.a::new)
      );

      public bgj a() {
         return this.b;
      }

      public drv b() {
         return this.c;
      }
   }
}
