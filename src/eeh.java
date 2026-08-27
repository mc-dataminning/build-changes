import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeh extends edw {
   public static final Codec<eeh> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqk.b(jc.C).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eeh::new)
   );
   private final aqk<cjd> b;

   private eeh(List<efj> $$0, aqk<cjd> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edy b() {
      return edz.A;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      cje.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static edw.a<?> a(aqk<cjd> $$0) {
      return a($$1 -> new eeh($$1, $$0));
   }
}
