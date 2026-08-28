import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eys extends exv {
   static final MapCodec<eys> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fao.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eys::new));
   private final fan b;

   private eys(List<ezr> $$0, fan $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.a();
   }

   @Override
   public exx<eys> b() {
      return exy.Q;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      int $$2 = azu.a(this.b.a($$1), 0, 4);
      $$0.b(ku.aa, new dae($$2));
      return $$0;
   }

   public fan c() {
      return this.b;
   }

   public static exv.a<?> a(fan $$0) {
      return a($$1 -> new eys($$1, $$0));
   }
}
