import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exx extends eyc {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cu.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), eyf.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exx::new)
   );
   private final cu b;
   private final eyd c;

   private exx(List<ezy> $$0, cu $$1, eyd $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eye<exx> b() {
      return eyf.v;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
