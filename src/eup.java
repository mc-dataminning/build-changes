import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eup extends euu {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cs.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), eux.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eup::new)
   );
   private final cs b;
   private final euv c;

   private eup(List<ews> $$0, cs $$1, euv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public euw<eup> b() {
      return eux.v;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(etn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
