import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euk extends eug {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(esr.e.fieldOf("component").forGetter($$0x -> $$0x.b), euj.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, euk::new)
   );
   private final esq<?> b;
   private final euh c;

   private euk(List<ewe> $$0, esq<?> $$1, euh $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eui<euk> b() {
      return euj.u;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
