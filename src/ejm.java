import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ejm implements ejp {
   public static final Codec<ejm> a = RecordCodecBuilder.create($$0 -> $$0.group(tm.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ejm::new));
   private final tm b;

   public ejm(tm $$0) {
      this.b = $$0;
   }

   @Override
   public tm a(axr $$0, @Nullable tm $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ejq<?> a() {
      return ejq.c;
   }
}
