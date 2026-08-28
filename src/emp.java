import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emp implements ems {
   public static final MapCodec<emp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(us.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, emp::new));
   private final us b;

   public emp(us $$0) {
      this.b = $$0;
   }

   @Override
   public us a(azh $$0, @Nullable us $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public emt<?> a() {
      return emt.c;
   }
}
