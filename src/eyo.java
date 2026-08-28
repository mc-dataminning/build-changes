import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyo extends eyb {
   static final MapCodec<eyo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fau.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, eyo::new));
   private final fat b;

   private eyo(List<ezx> $$0, fat $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public eyd<eyo> b() {
      return eye.R;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      $$0.b(ku.p, new czy(this.b.a($$1)));
      return $$0;
   }
}
