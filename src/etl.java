import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etl extends esy {
   static final MapCodec<etl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evt.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, etl::new));
   private final evs b;

   private etl(List<euw> $$0, evs $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.a();
   }

   @Override
   public eta<etl> b() {
      return etb.R;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      $$0.b(kq.o, new cxg(this.b.a($$1)));
      return $$0;
   }
}
