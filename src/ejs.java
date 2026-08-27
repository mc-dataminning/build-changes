import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejs extends ejx {
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ejs::new)
   );
   private final ij<coy> j;

   private ejs(ij<coy> $$0, int $$1, int $$2, List<emb> $$3, List<ekp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ejw a() {
      return ejt.c;
   }

   @Override
   public void a(Consumer<cpd> $$0, ejc $$1) {
      $$0.accept(new cpd(this.j));
   }

   public static ejx.a<?> a(cvq $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ejs($$0.j().i(), $$1, $$2, $$3, $$4));
   }
}
