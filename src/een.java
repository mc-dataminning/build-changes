import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class een extends eec {
   public static final Codec<een> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqi.b(je.B).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, een::new)
   );
   private final aqi<cix> b;

   private een(List<efp> $$0, aqi<cix> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eee b() {
      return eef.A;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      ciy.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eec.a<?> a(aqi<cix> $$0) {
      return a($$1 -> new een($$1, $$0));
   }
}
