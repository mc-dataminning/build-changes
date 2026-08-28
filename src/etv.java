import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etv extends esy {
   static final MapCodec<etv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evt.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, etv::new));
   private final evs b;

   private etv(List<euw> $$0, evs $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.a();
   }

   @Override
   public eta<etv> b() {
      return etb.Q;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      int $$2 = ayn.a(this.b.a($$1), 0, 4);
      $$0.b(kq.Q, Integer.valueOf($$2));
      return $$0;
   }

   public evs c() {
      return this.b;
   }

   public static esy.a<?> a(evs $$0) {
      return a($$1 -> new etv($$1, $$0));
   }
}
