import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eub extends ete {
   static final MapCodec<eub> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evz.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eub::new));
   private final evy b;

   private eub(List<evc> $$0, evy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.a();
   }

   @Override
   public etg<eub> b() {
      return eth.Q;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      int $$2 = ayo.a(this.b.a($$1), 0, 4);
      $$0.b(kq.Q, $$2);
      return $$0;
   }

   public evy c() {
      return this.b;
   }

   public static ete.a<?> a(evy $$0) {
      return a($$1 -> new eub($$1, $$0));
   }
}
