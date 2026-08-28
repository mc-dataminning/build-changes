import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eij(List<eij.a> b, jm c, eep d, boolean e) implements eis {
   public static final Codec<eij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eij.a.a.listOf().fieldOf("layers").forGetter(eij::a),
               jm.g.fieldOf("direction").forGetter(eij::b),
               eep.b.fieldOf("allowed_placement").forGetter(eij::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eij::d)
            )
            .apply($$0, eij::new)
   );

   public static eij.a a(bsj $$0, ekt $$1) {
      return new eij.a($$0, $$1);
   }

   public static eij b(bsj $$0, ekt $$1) {
      return new eij(List.of(a($$0, $$1)), jm.b, eep.c, false);
   }

   public List<eij.a> a() {
      return this.b;
   }

   public jm b() {
      return this.c;
   }

   public eep c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bsj b, ekt c) {
      public static final Codec<eij.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsj.d.fieldOf("height").forGetter(eij.a::a), ekt.a.fieldOf("provider").forGetter(eij.a::b)).apply($$0, eij.a::new)
      );

      public bsj a() {
         return this.b;
      }

      public ekt b() {
         return this.c;
      }
   }
}
