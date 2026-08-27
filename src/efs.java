import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efs extends efx {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, efs::new)
   );
   private final ig<clj> j;

   private efs(ig<clj> $$0, int $$1, int $$2, List<eib> $$3, List<egp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public efw a() {
      return eft.c;
   }

   @Override
   public void a(Consumer<clo> $$0, efc $$1) {
      $$0.accept(new clo(this.j));
   }

   public static efx.a<?> a(cse $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efs($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
