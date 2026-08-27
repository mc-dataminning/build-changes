import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eej extends eds {
   public static final Codec<eej> a = RecordCodecBuilder.create($$0 -> a($$0).and(jb.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eej::new));
   private final he<cku> b;

   private eej(List<eff> $$0, he<cku> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edu b() {
      return edv.z;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      ckw.a($$0, this.b.a());
      return $$0;
   }

   public static eds.a<?> a(cku $$0) {
      return a($$1 -> new eej($$1, $$0.c()));
   }
}
