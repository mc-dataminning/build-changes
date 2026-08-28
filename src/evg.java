import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evg extends euu {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vd.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, evg::new));
   private final uf b;

   private evg(List<ews> $$0, uf $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<evg> b() {
      return eux.j;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      cye.a(kr.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static euu.a<?> a(uf $$0) {
      return a($$1 -> new evg($$1, $$0));
   }
}
