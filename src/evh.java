import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evh(evy b) implements evc {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evz.a.fieldOf("chance").forGetter(evh::c)).apply($$0, evh::new));

   @Override
   public evd b() {
      return eve.d;
   }

   public boolean a(err $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static evc.a a(float $$0) {
      return () -> new evh(evv.a($$0));
   }

   public static evc.a a(evy $$0) {
      return () -> new evh($$0);
   }

   public evy c() {
      return this.b;
   }
}
