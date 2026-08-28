import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eue(euv b) implements etz {
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(euw.a.fieldOf("chance").forGetter(eue::c)).apply($$0, eue::new));

   @Override
   public eua b() {
      return eub.d;
   }

   public boolean a(eqo $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static etz.a a(float $$0) {
      return () -> new eue(eus.a($$0));
   }

   public static etz.a a(euv $$0) {
      return () -> new eue($$0);
   }

   public euv c() {
      return this.b;
   }
}
