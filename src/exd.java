import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exd extends exf {
   public static final MapCodec<exd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evr.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, exd::new));
   private final evr b;

   private exd(List<ezb> $$0, evr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<exd> b() {
      return exi.w;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static exf.a<?> a(evr $$0) {
      return a($$1 -> new exd($$1, $$0));
   }
}
