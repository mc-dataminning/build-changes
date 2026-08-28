import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exo(exr b) implements exr {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(exr.e.fieldOf("term").forGetter(exo::c)).apply($$0, exo::new));

   @Override
   public exs b() {
      return ext.a;
   }

   public boolean a(eug $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eum $$0) {
      exr.super.a($$0);
      this.b.a($$0);
   }

   public static exr.a a(exr.a $$0) {
      exo $$1 = new exo($$0.build());
      return () -> $$1;
   }

   public exr c() {
      return this.b;
   }
}
