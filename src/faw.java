import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class faw extends fbb {
   public static final MapCodec<faw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cm.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fbe.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, faw::new)
   );
   private final cm b;
   private final fbc c;

   private faw(List<fcx> $$0, cm $$1, fbc $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbd<faw> b() {
      return fbe.v;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ezu $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
