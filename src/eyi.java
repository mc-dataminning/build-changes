import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyi extends exv {
   static final MapCodec<eyi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fao.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, eyi::new));
   private final fan b;

   private eyi(List<ezr> $$0, fan $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.a();
   }

   @Override
   public exx<eyi> b() {
      return exy.R;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      $$0.b(ku.p, new czq(this.b.a($$1)));
      return $$0;
   }
}
