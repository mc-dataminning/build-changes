import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsm(int b) implements fsp {
   public static final MapCodec<fsm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.i.fieldOf("default").forGetter(fsm::b)).apply($$0, fsm::new));

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      return dcn.a($$0, this.b);
   }

   @Override
   public MapCodec<fsm> a() {
      return a;
   }
}
