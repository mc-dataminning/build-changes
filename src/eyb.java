import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyb extends exe {
   static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ezx.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eyb::new));
   private final ezw b;

   private eyb(List<eza> $$0, ezw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public exg<eyb> b() {
      return exh.Q;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      int $$2 = ayz.a(this.b.a($$1), 0, 4);
      $$0.b(kv.aa, new czn($$2));
      return $$0;
   }

   public ezw c() {
      return this.b;
   }

   public static exe.a<?> a(ezw $$0) {
      return a($$1 -> new eyb($$1, $$0));
   }
}
