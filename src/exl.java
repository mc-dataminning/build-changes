import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exl(boolean b) implements exr {
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(exl::e)).apply($$0, exl::new));

   public boolean a(eug $$0) {
      return $$0.b(exc.l) == this.b;
   }

   @Override
   public exs b() {
      return ext.s;
   }

   @Override
   public Set<ewz<?>> a() {
      return Set.of(exc.l);
   }

   public static exr.a c() {
      return () -> new exl(true);
   }

   public static exr.a d() {
      return () -> new exl(false);
   }

   public boolean e() {
      return this.b;
   }
}
