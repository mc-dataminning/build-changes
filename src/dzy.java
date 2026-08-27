import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dzy implements eab {
   public static final Codec<dzy> a = RecordCodecBuilder.create($$0 -> $$0.group(rt.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, dzy::new));
   private final rt b;

   public dzy(rt $$0) {
      this.b = $$0;
   }

   @Override
   public rt a(ate $$0, @Nullable rt $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public eac<?> a() {
      return eac.c;
   }
}
