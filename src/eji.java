import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eji extends eir {
   public static final Codec<eji> a = RecordCodecBuilder.create($$0 -> a($$0).and(kd.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eji::new));
   private final ih<cpe> b;

   private eji(List<eke> $$0, ih<cpe> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eit b() {
      return eiu.z;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      cpg.a($$0, this.b);
      return $$0;
   }

   public static eir.a<?> a(ih<cpe> $$0) {
      return a($$1 -> new eji($$1, $$0));
   }
}
