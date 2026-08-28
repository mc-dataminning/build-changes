import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewz extends exh {
   public static final MapCodec<ewz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alz.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewz::new)
   );
   private final alz j;

   private ewz(alz $$0, int $$1, int $$2, List<ezy> $$3, List<eyd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public exg a() {
      return exd.e;
   }

   @Override
   public void a(Consumer<cxp> $$0, ewp $$1) {
      $$1.a(this.j, $$0);
   }

   public static exh.a<?> a(alz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewz($$0, $$1, $$2, $$3, $$4));
   }
}
