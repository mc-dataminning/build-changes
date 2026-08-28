import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyh extends exu {
   static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fap.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, eyh::new));
   private final fao b;

   private eyh(List<ezs> $$0, fao $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.a();
   }

   @Override
   public exw<eyh> b() {
      return exx.R;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      $$0.b(ku.p, new czu(this.b.a($$1)));
      return $$0;
   }
}
