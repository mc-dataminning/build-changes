import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebs(List<ebs.a> b, it c, dya d, boolean e) implements ecb {
   public static final Codec<ebs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebs.a.a.listOf().fieldOf("layers").forGetter(ebs::a),
               it.g.fieldOf("direction").forGetter(ebs::b),
               dya.b.fieldOf("allowed_placement").forGetter(ebs::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ebs::d)
            )
            .apply($$0, ebs::new)
   );

   public static ebs.a a(boz $$0, eec $$1) {
      return new ebs.a($$0, $$1);
   }

   public static ebs b(boz $$0, eec $$1) {
      return new ebs(List.of(a($$0, $$1)), it.b, dya.c, false);
   }

   public List<ebs.a> a() {
      return this.b;
   }

   public it b() {
      return this.c;
   }

   public dya c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(boz b, eec c) {
      public static final Codec<ebs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(boz.d.fieldOf("height").forGetter(ebs.a::a), eec.a.fieldOf("provider").forGetter(ebs.a::b)).apply($$0, ebs.a::new)
      );

      public boz a() {
         return this.b;
      }

      public eec b() {
         return this.c;
      }
   }
}
