import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbz extends fbb {
   public static final MapCodec<fbz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dbe.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fbz::new));
   private final jf<dbe> b;

   private fbz(List<fcx> $$0, jf<dbe> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<fbz> b() {
      return fbe.F;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      $$0.a(kk.R, dbg.a, this.b, dbg::b);
      return $$0;
   }

   public static fbb.a<?> a(jf<dbe> $$0) {
      return a($$1 -> new fbz($$1, $$0));
   }
}
