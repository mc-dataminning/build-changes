import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elo implements elr {
   public static final MapCodec<elo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ud.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, elo::new));
   private final ud b;

   public elo(ud $$0) {
      this.b = $$0;
   }

   @Override
   public ud a(ayk $$0, @Nullable ud $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public els<?> a() {
      return els.c;
   }
}
