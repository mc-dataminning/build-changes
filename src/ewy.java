import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewy extends exe {
   public static final MapCodec<ewy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(evr.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ewy::new)
   );
   private final evr.b b;

   public ewy(List<eza> $$0, evr.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<ewy> b() {
      return exh.B;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$0.a(cwt.vm) && $$1.c(this.b.a()) instanceof cox $$2) {
         $$0.b(kv.ag, new czo($$2.gh()));
      }

      return $$0;
   }

   public static exe.a<?> a(evr.b $$0) {
      return a($$1 -> new ewy($$1, $$0));
   }
}
