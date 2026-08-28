import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exn extends exe {
   public static final MapCodec<exn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ks.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, exn::new)
   );
   private final ks b;

   private exn(List<eza> $$0, ks $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<exn> b() {
      return exh.k;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> exe.a<?> a(ku<T> $$0, T $$1) {
      return a($$2 -> new exn($$2, ks.a().a($$0, $$1).a()));
   }
}
