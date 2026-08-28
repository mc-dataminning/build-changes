import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eiq(List<eiq.a> b, jm c, eew d, boolean e) implements eiz {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiq.a.a.listOf().fieldOf("layers").forGetter(eiq::a),
               jm.g.fieldOf("direction").forGetter(eiq::b),
               eew.b.fieldOf("allowed_placement").forGetter(eiq::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eiq::d)
            )
            .apply($$0, eiq::new)
   );

   public static eiq.a a(bsn $$0, ela $$1) {
      return new eiq.a($$0, $$1);
   }

   public static eiq b(bsn $$0, ela $$1) {
      return new eiq(List.of(a($$0, $$1)), jm.b, eew.c, false);
   }

   public List<eiq.a> a() {
      return this.b;
   }

   public jm b() {
      return this.c;
   }

   public eew c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bsn b, ela c) {
      public static final Codec<eiq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsn.d.fieldOf("height").forGetter(eiq.a::a), ela.a.fieldOf("provider").forGetter(eiq.a::b)).apply($$0, eiq.a::new)
      );

      public bsn a() {
         return this.b;
      }

      public ela b() {
         return this.c;
      }
   }
}
