import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eya extends exd {
   static final MapCodec<eya> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ezw.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eya::new));
   private final ezv b;

   private eya(List<eyz> $$0, ezv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public exf<eya> b() {
      return exg.Q;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      int $$2 = ayz.a(this.b.a($$1), 0, 4);
      $$0.b(kv.aa, new czm($$2));
      return $$0;
   }

   public ezv c() {
      return this.b;
   }

   public static exd.a<?> a(ezv $$0) {
      return a($$1 -> new eya($$1, $$0));
   }
}
