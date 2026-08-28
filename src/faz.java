import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record faz(fbq b) implements fau {
   public static final MapCodec<faz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fbr.a.fieldOf("chance").forGetter(faz::c)).apply($$0, faz::new));

   @Override
   public fav b() {
      return faw.d;
   }

   public boolean a(exl $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fau.a a(float $$0) {
      return () -> new faz(fbn.a($$0));
   }

   public static fau.a a(fbq $$0) {
      return () -> new faz($$0);
   }

   public fbq c() {
      return this.b;
   }
}
