import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class esk implements esn {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(um.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, esk::new));
   private final um b;

   public esk(um $$0) {
      this.b = $$0;
   }

   @Override
   public um a(bac $$0, @Nullable um $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eso<?> a() {
      return eso.c;
   }
}
