import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyv implements dyy {
   public static final Codec<dyv> a = RecordCodecBuilder.create($$0 -> $$0.group(qs.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, dyv::new));
   private final qs b;

   public dyv(qs $$0) {
      this.b = $$0;
   }

   @Override
   public qs a(art $$0, @Nullable qs $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public dyz<?> a() {
      return dyz.c;
   }
}
