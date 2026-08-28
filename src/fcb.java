import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcb extends fcg {
   public static final MapCodec<fcb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cn.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fcj.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fcb::new)
   );
   private final cn b;
   private final fch c;

   private fcb(List<fec> $$0, cn $$1, fch $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fci<fcb> b() {
      return fcj.v;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(faz $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
