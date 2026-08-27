import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ehh implements ehk {
   public static final Codec<ehh> a = RecordCodecBuilder.create($$0 -> $$0.group(ta.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ehh::new));
   private final ta b;

   public ehh(ta $$0) {
      this.b = $$0;
   }

   @Override
   public ta a(axd $$0, @Nullable ta $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ehl<?> a() {
      return ehl.c;
   }
}
