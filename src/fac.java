import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fac(fat b) implements ezx {
   public static final MapCodec<fac> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fau.a.fieldOf("chance").forGetter(fac::c)).apply($$0, fac::new));

   @Override
   public ezy b() {
      return ezz.d;
   }

   public boolean a(ewo $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static ezx.a a(float $$0) {
      return () -> new fac(faq.a($$0));
   }

   public static ezx.a a(fat $$0) {
      return () -> new fac($$0);
   }

   public fat c() {
      return this.b;
   }
}
