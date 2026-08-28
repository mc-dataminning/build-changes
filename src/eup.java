import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eup extends eug {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ko.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eup::new)
   );
   private final ko b;

   private eup(List<ewe> $$0, ko $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<eup> b() {
      return euj.k;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eug.a<?> a(kq<T> $$0, T $$1) {
      return a($$2 -> new eup($$2, ko.a().a($$0, $$1).a()));
   }
}
