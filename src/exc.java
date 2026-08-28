import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exc extends exh {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxl.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exc::new)
   );
   private final jq<cxl> j;

   private exc(jq<cxl> $$0, int $$1, int $$2, List<ezy> $$3, List<eyd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public exg a() {
      return exd.c;
   }

   @Override
   public void a(Consumer<cxp> $$0, ewp $$1) {
      $$0.accept(new cxp(this.j));
   }

   public static exh.a<?> a(dhh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exc($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
