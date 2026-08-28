import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emq implements emt {
   public static final MapCodec<emq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(us.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, emq::new));
   private final us b;

   public emq(us $$0) {
      this.b = $$0;
   }

   @Override
   public us a(azh $$0, @Nullable us $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public emu<?> a() {
      return emu.c;
   }
}
