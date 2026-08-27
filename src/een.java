import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class een extends edw {
   public static final Codec<een> a = RecordCodecBuilder.create($$0 -> a($$0).and(jb.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, een::new));
   private final he<cli> b;

   private een(List<efj> $$0, he<cli> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edy b() {
      return edz.z;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      clk.a($$0, this.b.a());
      return $$0;
   }

   public static edw.a<?> a(cli $$0) {
      return a($$1 -> new een($$1, $$0.c()));
   }
}
