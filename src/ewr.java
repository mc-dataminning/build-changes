import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewr extends ewz {
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alz.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewr::new)
   );
   private final alz j;

   private ewr(alz $$0, int $$1, int $$2, List<ezs> $$3, List<exv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewy a() {
      return ewv.e;
   }

   @Override
   public void a(Consumer<cxk> $$0, ewh $$1) {
      $$1.a(this.j, $$0);
   }

   public static ewz.a<?> a(alz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewr($$0, $$1, $$2, $$3, $$4));
   }
}
