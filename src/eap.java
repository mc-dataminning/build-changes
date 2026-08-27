import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eap(List<eap.a> b, ir c, dwx d, boolean e) implements eay {
   public static final Codec<eap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eap.a.a.listOf().fieldOf("layers").forGetter(eap::a),
               ir.g.fieldOf("direction").forGetter(eap::b),
               dwx.b.fieldOf("allowed_placement").forGetter(eap::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eap::d)
            )
            .apply($$0, eap::new)
   );

   public static eap.a a(bnv $$0, ecz $$1) {
      return new eap.a($$0, $$1);
   }

   public static eap b(bnv $$0, ecz $$1) {
      return new eap(List.of(a($$0, $$1)), ir.b, dwx.c, false);
   }

   public List<eap.a> a() {
      return this.b;
   }

   public ir b() {
      return this.c;
   }

   public dwx c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bnv b, ecz c) {
      public static final Codec<eap.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bnv.d.fieldOf("height").forGetter(eap.a::a), ecz.a.fieldOf("provider").forGetter(eap.a::b)).apply($$0, eap.a::new)
      );

      public bnv a() {
         return this.b;
      }

      public ecz b() {
         return this.c;
      }
   }
}
