import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evb(evs b) implements euw {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evt.a.fieldOf("chance").forGetter(evb::c)).apply($$0, evb::new));

   @Override
   public eux b() {
      return euy.d;
   }

   public boolean a(erl $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static euw.a a(float $$0) {
      return () -> new evb(evp.a($$0));
   }

   public static euw.a a(evs $$0) {
      return () -> new evb($$0);
   }

   public evs c() {
      return this.b;
   }
}
