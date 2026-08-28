import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eov implements eoy {
   public static final MapCodec<eov> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(uf.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eov::new));
   private final uf b;

   public eov(uf $$0) {
      this.b = $$0;
   }

   @Override
   public uf a(azk $$0, @Nullable uf $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eoz<?> a() {
      return eoz.c;
   }
}
