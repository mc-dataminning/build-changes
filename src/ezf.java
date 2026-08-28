import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezf(ezw b) implements eza {
   public static final MapCodec<ezf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezx.a.fieldOf("chance").forGetter(ezf::c)).apply($$0, ezf::new));

   @Override
   public ezb b() {
      return ezc.d;
   }

   public boolean a(evr $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static eza.a a(float $$0) {
      return () -> new ezf(ezt.a($$0));
   }

   public static eza.a a(ezw $$0) {
      return () -> new ezf($$0);
   }

   public ezw c() {
      return this.b;
   }
}
