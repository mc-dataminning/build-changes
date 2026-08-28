import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbb extends fbg {
   public static final MapCodec<fbb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cm.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fbj.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbb::new)
   );
   private final cm b;
   private final fbh c;

   private fbb(List<fdc> $$0, cm $$1, fbh $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbi<fbb> b() {
      return fbj.v;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ezz $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
