import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ens implements env {
   public static final MapCodec<ens> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ua.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ens::new));
   private final ua b;

   public ens(ua $$0) {
      this.b = $$0;
   }

   @Override
   public ua a(ayv $$0, @Nullable ua $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public enw<?> a() {
      return enw.c;
   }
}
