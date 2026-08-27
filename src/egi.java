import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egi extends efx {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arr.b(jz.C).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, egi::new)
   );
   private final arr<ckt> b;

   private egi(List<ehk> $$0, arr<ckt> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public efz b() {
      return ega.A;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      cku.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static efx.a<?> a(arr<ckt> $$0) {
      return a($$1 -> new egi($$1, $$0));
   }
}
