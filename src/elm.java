import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class elm extends elr {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, elm::new)
   );
   private final il<cqh> j;

   private elm(il<cqh> $$0, int $$1, int $$2, List<env> $$3, List<emj> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public elq a() {
      return eln.c;
   }

   @Override
   public void a(Consumer<cqm> $$0, ekw $$1) {
      $$0.accept(new cqm(this.j));
   }

   public static elr.a<?> a(cxa $$0) {
      return a(($$1, $$2, $$3, $$4) -> new elm($$0.l().k(), $$1, $$2, $$3, $$4));
   }
}
