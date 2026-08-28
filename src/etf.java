import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etf extends esh {
   public static final MapCodec<etf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lq.h.s().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, etf::new));
   private final jj<cwb> b;

   private etf(List<euf> $$0, jj<cwb> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<etf> b() {
      return esk.F;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      $$0.a(kn.G, cwd.a, this.b, cwd::b);
      return $$0;
   }

   public static esh.a<?> a(jj<cwb> $$0) {
      return a($$1 -> new etf($$1, $$0));
   }
}
