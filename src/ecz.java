import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecz(List<ecz.a> b, jf c, dzg d, boolean e) implements edi {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.a.a.listOf().fieldOf("layers").forGetter(ecz::a),
               jf.g.fieldOf("direction").forGetter(ecz::b),
               dzg.b.fieldOf("allowed_placement").forGetter(ecz::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ecz::d)
            )
            .apply($$0, ecz::new)
   );

   public static ecz.a a(bpi $$0, efj $$1) {
      return new ecz.a($$0, $$1);
   }

   public static ecz b(bpi $$0, efj $$1) {
      return new ecz(List.of(a($$0, $$1)), jf.b, dzg.c, false);
   }

   public List<ecz.a> a() {
      return this.b;
   }

   public jf b() {
      return this.c;
   }

   public dzg c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpi b, efj c) {
      public static final Codec<ecz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpi.d.fieldOf("height").forGetter(ecz.a::a), efj.a.fieldOf("provider").forGetter(ecz.a::b)).apply($$0, ecz.a::new)
      );

      public bpi a() {
         return this.b;
      }

      public efj b() {
         return this.c;
      }
   }
}
