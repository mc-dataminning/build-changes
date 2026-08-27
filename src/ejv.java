import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ejv implements ejy {
   public static final Codec<ejv> a = RecordCodecBuilder.create($$0 -> $$0.group(to.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ejv::new));
   private final to b;

   public ejv(to $$0) {
      this.b = $$0;
   }

   @Override
   public to a(axt $$0, @Nullable to $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ejz<?> a() {
      return ejz.c;
   }
}
