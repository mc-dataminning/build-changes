import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class egl implements ego {
   public static final Codec<egl> a = RecordCodecBuilder.create($$0 -> $$0.group(sy.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, egl::new));
   private final sy b;

   public egl(sy $$0) {
      this.b = $$0;
   }

   @Override
   public sy a(awt $$0, @Nullable sy $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public egp<?> a() {
      return egp.c;
   }
}
