import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ewj(exa b) implements ewe {
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(exb.a.fieldOf("chance").forGetter(ewj::c)).apply($$0, ewj::new));

   @Override
   public ewf b() {
      return ewg.d;
   }

   public boolean a(est $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static ewe.a a(float $$0) {
      return () -> new ewj(ewx.a($$0));
   }

   public static ewe.a a(exa $$0) {
      return () -> new ewj($$0);
   }

   public exa c() {
      return this.b;
   }
}
