import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eko extends ekt {
   public static final Codec<eko> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eko::new)
   );
   private final il<cpl> j;

   private eko(il<cpl> $$0, int $$1, int $$2, List<emx> $$3, List<ell> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eks a() {
      return ekp.c;
   }

   @Override
   public void a(Consumer<cpq> $$0, ejy $$1) {
      $$0.accept(new cpq(this.j));
   }

   public static ekt.a<?> a(cwd $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eko($$0.l().k(), $$1, $$2, $$3, $$4));
   }
}
