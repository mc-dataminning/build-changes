import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbg extends fau {
   public static final MapCodec<fbg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ux.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fbg::new));
   private final tz b;

   private fbg(List<fcq> $$0, tz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<fbg> b() {
      return fax.j;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      dbl.a(kj.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static fau.a<?> a(tz $$0) {
      return a($$1 -> new fbg($$1, $$0));
   }
}
