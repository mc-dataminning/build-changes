import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dsx(List<dsx.a> b, ia c, dpf d, boolean e) implements dtg {
   public static final Codec<dsx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsx.a.a.listOf().fieldOf("layers").forGetter(dsx::a),
               ia.g.fieldOf("direction").forGetter(dsx::b),
               dpf.b.fieldOf("allowed_placement").forGetter(dsx::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dsx::d)
            )
            .apply($$0, dsx::new)
   );

   public static dsx.a a(biq $$0, dvh $$1) {
      return new dsx.a($$0, $$1);
   }

   public static dsx b(biq $$0, dvh $$1) {
      return new dsx(List.of(a($$0, $$1)), ia.b, dpf.c, false);
   }

   public List<dsx.a> a() {
      return this.b;
   }

   public ia b() {
      return this.c;
   }

   public dpf c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(biq b, dvh c) {
      public static final Codec<dsx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(biq.d.fieldOf("height").forGetter(dsx.a::a), dvh.a.fieldOf("provider").forGetter(dsx.a::b)).apply($$0, dsx.a::new)
      );

      public biq a() {
         return this.b;
      }

      public dvh b() {
         return this.c;
      }
   }
}
