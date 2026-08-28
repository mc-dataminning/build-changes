import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyc extends exf {
   static final MapCodec<eyc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ezy.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eyc::new));
   private final ezx b;

   private eyc(List<ezb> $$0, ezx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public exh<eyc> b() {
      return exi.Q;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      int $$2 = ayz.a(this.b.a($$1), 0, 4);
      $$0.b(kv.aa, new czo($$2));
      return $$0;
   }

   public ezx c() {
      return this.b;
   }

   public static exf.a<?> a(ezx $$0) {
      return a($$1 -> new eyc($$1, $$0));
   }
}
