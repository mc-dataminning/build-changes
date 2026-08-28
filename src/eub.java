import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eub extends eug {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cs.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), euj.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eub::new)
   );
   private final cs b;
   private final euh c;

   private eub(List<ewe> $$0, cs $$1, euh $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eui<eub> b() {
      return euj.v;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
