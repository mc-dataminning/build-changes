import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eip(List<eip.a> b, jn c, eev d, boolean e) implements eiy {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eip.a.a.listOf().fieldOf("layers").forGetter(eip::a),
               jn.g.fieldOf("direction").forGetter(eip::b),
               eev.b.fieldOf("allowed_placement").forGetter(eip::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eip::d)
            )
            .apply($$0, eip::new)
   );

   public static eip.a a(bsd $$0, ekz $$1) {
      return new eip.a($$0, $$1);
   }

   public static eip b(bsd $$0, ekz $$1) {
      return new eip(List.of(a($$0, $$1)), jn.b, eev.c, false);
   }

   public List<eip.a> a() {
      return this.b;
   }

   public jn b() {
      return this.c;
   }

   public eev c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bsd b, ekz c) {
      public static final Codec<eip.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsd.d.fieldOf("height").forGetter(eip.a::a), ekz.a.fieldOf("provider").forGetter(eip.a::b)).apply($$0, eip.a::new)
      );

      public bsd a() {
         return this.b;
      }

      public ekz b() {
         return this.c;
      }
   }
}
