import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewx extends ewa {
   static final MapCodec<ewx> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eyv.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ewx::new));
   private final eyu b;

   private ewx(List<exy> $$0, eyu $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.a();
   }

   @Override
   public ewc<ewx> b() {
      return ewd.Q;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      int $$2 = azm.a(this.b.a($$1), 0, 4);
      $$0.b(ku.aa, new czk($$2));
      return $$0;
   }

   public eyu c() {
      return this.b;
   }

   public static ewa.a<?> a(eyu $$0) {
      return a($$1 -> new ewx($$1, $$0));
   }
}
