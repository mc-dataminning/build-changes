import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exc extends exe {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evq.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, exc::new));
   private final evq b;

   private exc(List<eza> $$0, evq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<exc> b() {
      return exh.w;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static exe.a<?> a(evq $$0) {
      return a($$1 -> new exc($$1, $$0));
   }
}
