import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eum(evd b) implements euh {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eve.a.fieldOf("chance").forGetter(eum::c)).apply($$0, eum::new));

   @Override
   public eui b() {
      return euj.d;
   }

   public boolean a(eqw $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static euh.a a(float $$0) {
      return () -> new eum(eva.a($$0));
   }

   public static euh.a a(evd $$0) {
      return () -> new eum($$0);
   }

   public evd c() {
      return this.b;
   }
}
