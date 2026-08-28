import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewv extends exa {
   public static final MapCodec<ewv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxc.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewv::new)
   );
   private final jq<cxc> j;

   private ewv(jq<cxc> $$0, int $$1, int $$2, List<ezr> $$3, List<exw> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewz a() {
      return eww.c;
   }

   @Override
   public void a(Consumer<cxg> $$0, ewi $$1) {
      $$0.accept(new cxg(this.j));
   }

   public static exa.a<?> a(dgy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewv($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
