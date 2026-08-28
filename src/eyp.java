import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyp extends eyc {
   static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fav.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, eyp::new));
   private final fau b;

   private eyp(List<ezy> $$0, fau $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public eye<eyp> b() {
      return eyf.R;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      $$0.b(ku.p, new czz(this.b.a($$1)));
      return $$0;
   }
}
