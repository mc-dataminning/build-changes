import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dza implements dzd {
   public static final Codec<dza> a = RecordCodecBuilder.create($$0 -> $$0.group(qw.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, dza::new));
   private final qw b;

   public dza(qw $$0) {
      this.b = $$0;
   }

   @Override
   public qw a(ash $$0, @Nullable qw $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public dze<?> a() {
      return dze.c;
   }
}
