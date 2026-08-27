import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class elk extends elp {
   public static final Codec<elk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, elk::new)
   );
   private final il<cqf> j;

   private elk(il<cqf> $$0, int $$1, int $$2, List<ent> $$3, List<emh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public elo a() {
      return ell.c;
   }

   @Override
   public void a(Consumer<cqk> $$0, eku $$1) {
      $$0.accept(new cqk(this.j));
   }

   public static elp.a<?> a(cwy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new elk($$0.l().k(), $$1, $$2, $$3, $$4));
   }
}
