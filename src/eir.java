import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eir(List<eir.a> b, jm c, eex d, boolean e) implements eja {
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eir.a.a.listOf().fieldOf("layers").forGetter(eir::a),
               jm.g.fieldOf("direction").forGetter(eir::b),
               eex.b.fieldOf("allowed_placement").forGetter(eir::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eir::d)
            )
            .apply($$0, eir::new)
   );

   public static eir.a a(bso $$0, elb $$1) {
      return new eir.a($$0, $$1);
   }

   public static eir b(bso $$0, elb $$1) {
      return new eir(List.of(a($$0, $$1)), jm.b, eex.c, false);
   }

   public List<eir.a> a() {
      return this.b;
   }

   public jm b() {
      return this.c;
   }

   public eex c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bso b, elb c) {
      public static final Codec<eir.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bso.d.fieldOf("height").forGetter(eir.a::a), elb.a.fieldOf("provider").forGetter(eir.a::b)).apply($$0, eir.a::new)
      );

      public bso a() {
         return this.b;
      }

      public elb b() {
         return this.c;
      }
   }
}
