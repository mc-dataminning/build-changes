import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezx(fao b) implements ezs {
   public static final MapCodec<ezx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fap.a.fieldOf("chance").forGetter(ezx::c)).apply($$0, ezx::new));

   @Override
   public ezt b() {
      return ezu.d;
   }

   public boolean a(ewh $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static ezs.a a(float $$0) {
      return () -> new ezx(fal.a($$0));
   }

   public static ezs.a a(fao $$0) {
      return () -> new ezx($$0);
   }

   public fao c() {
      return this.b;
   }
}
