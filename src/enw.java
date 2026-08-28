import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class enw implements enz {
   public static final MapCodec<enw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ub.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, enw::new));
   private final ub b;

   public enw(ub $$0) {
      this.b = $$0;
   }

   @Override
   public ub a(ayw $$0, @Nullable ub $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eoa<?> a() {
      return eoa.c;
   }
}
