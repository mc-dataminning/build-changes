import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egg(List<egg.a> b, jm c, ecm d, boolean e) implements egp {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egg.a.a.listOf().fieldOf("layers").forGetter(egg::a),
               jm.g.fieldOf("direction").forGetter(egg::b),
               ecm.b.fieldOf("allowed_placement").forGetter(egg::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(egg::d)
            )
            .apply($$0, egg::new)
   );

   public static egg.a a(bri $$0, eiq $$1) {
      return new egg.a($$0, $$1);
   }

   public static egg b(bri $$0, eiq $$1) {
      return new egg(List.of(a($$0, $$1)), jm.b, ecm.c, false);
   }

   public List<egg.a> a() {
      return this.b;
   }

   public jm b() {
      return this.c;
   }

   public ecm c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bri b, eiq c) {
      public static final Codec<egg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bri.d.fieldOf("height").forGetter(egg.a::a), eiq.a.fieldOf("provider").forGetter(egg.a::b)).apply($$0, egg.a::new)
      );

      public bri a() {
         return this.b;
      }

      public eiq b() {
         return this.c;
      }
   }
}
