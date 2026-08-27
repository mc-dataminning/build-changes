import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eet extends eec {
   public static final Codec<eet> a = RecordCodecBuilder.create($$0 -> a($$0).and(jb.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eet::new));
   private final he<clc> b;

   private eet(List<efp> $$0, he<clc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eee b() {
      return eef.z;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      cle.a($$0, this.b.a());
      return $$0;
   }

   public static eec.a<?> a(clc $$0) {
      return a($$1 -> new eet($$1, $$0.c()));
   }
}
