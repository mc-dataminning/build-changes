import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efn extends efs {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, efn::new)
   );
   private final ib<cle> j;

   private efn(ib<cle> $$0, int $$1, int $$2, List<ehw> $$3, List<egk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public efr a() {
      return efo.c;
   }

   @Override
   public void a(Consumer<clj> $$0, eex $$1) {
      $$0.accept(new clj(this.j));
   }

   public static efs.a<?> a(crz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efn($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
