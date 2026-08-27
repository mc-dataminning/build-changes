import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elq implements elt {
   public static final MapCodec<elq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ud.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, elq::new));
   private final ud b;

   public elq(ud $$0) {
      this.b = $$0;
   }

   @Override
   public ud a(aym $$0, @Nullable ud $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public elu<?> a() {
      return elu.c;
   }
}
