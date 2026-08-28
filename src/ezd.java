import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezd(ezu b) implements eyy {
   public static final MapCodec<ezd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezv.a.fieldOf("chance").forGetter(ezd::c)).apply($$0, ezd::new));

   @Override
   public eyz b() {
      return eza.d;
   }

   public boolean a(evp $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static eyy.a a(float $$0) {
      return () -> new ezd(ezr.a($$0));
   }

   public static eyy.a a(ezu $$0) {
      return () -> new ezd($$0);
   }

   public ezu c() {
      return this.b;
   }
}
