import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class euy extends eug {
   public static final MapCodec<euy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exb.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, euy::new)
   );
   private final exa b;
   private final boolean c;

   private euy(List<ewe> $$0, exa $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eui<euy> b() {
      return euj.e;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.a();
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      int $$2 = this.c ? $$0.J() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static eug.a<?> a(exa $$0) {
      return a($$1 -> new euy($$1, $$0, false));
   }

   public static eug.a<?> a(exa $$0, boolean $$1) {
      return a($$2 -> new euy($$2, $$0, $$1));
   }
}
