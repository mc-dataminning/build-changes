import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ers implements erv {
   public static final MapCodec<ers> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tq.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ers::new));
   private final tq b;

   public ers(tq $$0) {
      this.b = $$0;
   }

   @Override
   public tq a(azh $$0, @Nullable tq $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public erw<?> a() {
      return erw.c;
   }
}
