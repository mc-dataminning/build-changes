import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyy extends eyb {
   static final MapCodec<eyy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fau.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eyy::new));
   private final fat b;

   private eyy(List<ezx> $$0, fat $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public eyd<eyy> b() {
      return eye.Q;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      int $$2 = bae.a(this.b.a($$1), 0, 4);
      $$0.b(ku.aa, new dam($$2));
      return $$0;
   }

   public fat c() {
      return this.b;
   }

   public static eyb.a<?> a(fat $$0) {
      return a($$1 -> new eyy($$1, $$0));
   }
}
