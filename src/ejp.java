import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejp extends ejx {
   public static final Codec<ejp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiy.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ejp::new)
   );
   private final aiy j;

   private ejp(aiy $$0, int $$1, int $$2, List<emb> $$3, List<ekp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ejw a() {
      return ejt.e;
   }

   @Override
   public void a(Consumer<cpd> $$0, ejc $$1) {
      $$1.a(this.j, $$0);
   }

   public static ejx.a<?> a(aiy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ejp($$0, $$1, $$2, $$3, $$4));
   }
}
