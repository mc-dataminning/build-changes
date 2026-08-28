import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esv extends erw {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lp.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, esv::new));
   private final ji<cwq> b;

   private esv(List<etu> $$0, ji<cwq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<esv> b() {
      return erz.F;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      $$0.a(km.G, cws.a, this.b, cws::b);
      return $$0;
   }

   public static erw.a<?> a(ji<cwq> $$0) {
      return a($$1 -> new esv($$1, $$0));
   }
}
