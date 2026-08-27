import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eem extends edw {
   public static final Codec<eem> a = RecordCodecBuilder.create($$0 -> a($$0).and(rr.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eem::new));
   private final qw b;

   private eem(List<efj> $$0, qw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edy b() {
      return edz.g;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static edw.a<?> a(qw $$0) {
      return a($$1 -> new eem($$1, $$0));
   }
}
