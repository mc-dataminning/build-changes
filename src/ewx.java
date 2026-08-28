import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ewx(exo b) implements ews {
   public static final MapCodec<ewx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(exp.a.fieldOf("chance").forGetter(ewx::c)).apply($$0, ewx::new));

   @Override
   public ewt b() {
      return ewu.d;
   }

   public boolean a(eth $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static ews.a a(float $$0) {
      return () -> new ewx(exl.a($$0));
   }

   public static ews.a a(exo $$0) {
      return () -> new ewx($$0);
   }

   public exo c() {
      return this.b;
   }
}
