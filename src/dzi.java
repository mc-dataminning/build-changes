import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dzi implements dzl {
   public static final Codec<dzi> a = RecordCodecBuilder.create($$0 -> $$0.group(qy.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, dzi::new));
   private final qy b;

   public dzi(qy $$0) {
      this.b = $$0;
   }

   @Override
   public qy a(ase $$0, @Nullable qy $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public dzm<?> a() {
      return dzm.c;
   }
}
