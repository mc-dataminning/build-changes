import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record feh(fey b) implements fec {
   public static final MapCodec<feh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fez.a.fieldOf("chance").forGetter(feh::c)).apply($$0, feh::new));

   @Override
   public fed b() {
      return fee.d;
   }

   public boolean a(fat $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fec.a a(float $$0) {
      return () -> new feh(fev.a($$0));
   }

   public static fec.a a(fey $$0) {
      return () -> new feh($$0);
   }

   public fey c() {
      return this.b;
   }
}
