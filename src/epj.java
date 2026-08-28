import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epj implements epm {
   public static final MapCodec<epj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(uf.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, epj::new));
   private final uf b;

   public epj(uf $$0) {
      this.b = $$0;
   }

   @Override
   public uf a(azl $$0, @Nullable uf $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public epn<?> a() {
      return epn.c;
   }
}
