import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecv(List<ecv.a> b, je c, dzd d, boolean e) implements ede {
   public static final Codec<ecv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecv.a.a.listOf().fieldOf("layers").forGetter(ecv::a),
               je.g.fieldOf("direction").forGetter(ecv::b),
               dzd.b.fieldOf("allowed_placement").forGetter(ecv::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ecv::d)
            )
            .apply($$0, ecv::new)
   );

   public static ecv.a a(bqb $$0, eff $$1) {
      return new ecv.a($$0, $$1);
   }

   public static ecv b(bqb $$0, eff $$1) {
      return new ecv(List.of(a($$0, $$1)), je.b, dzd.c, false);
   }

   public List<ecv.a> a() {
      return this.b;
   }

   public je b() {
      return this.c;
   }

   public dzd c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bqb b, eff c) {
      public static final Codec<ecv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bqb.d.fieldOf("height").forGetter(ecv.a::a), eff.a.fieldOf("provider").forGetter(ecv.a::b)).apply($$0, ecv.a::new)
      );

      public bqb a() {
         return this.b;
      }

      public eff b() {
         return this.c;
      }
   }
}
