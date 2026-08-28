import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exw(eyn b) implements exr {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eyo.a.fieldOf("chance").forGetter(exw::c)).apply($$0, exw::new));

   @Override
   public exs b() {
      return ext.d;
   }

   public boolean a(eug $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static exr.a a(float $$0) {
      return () -> new exw(eyk.a($$0));
   }

   public static exr.a a(eyn $$0) {
      return () -> new exw($$0);
   }

   public eyn c() {
      return this.b;
   }
}
