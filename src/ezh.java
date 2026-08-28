import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezh extends eyy {
   public static final MapCodec<ezh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ku.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, ezh::new)
   );
   private final ku b;

   private ezh(List<fau> $$0, ku $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<ezh> b() {
      return ezb.k;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eyy.a<?> a(kw<T> $$0, T $$1) {
      return a($$2 -> new ezh($$2, ku.a().a($$0, $$1).a()));
   }
}
