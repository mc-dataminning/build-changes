import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edv extends edw {
   public static final Codec<edv> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecj.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, edv::new));
   private final ecj b;

   private edv(List<efj> $$0, ecj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edy b() {
      return edz.q;
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.a();
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static edw.a<?> a(ecj $$0) {
      return a($$1 -> new edv($$1, $$0));
   }
}
