import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eoq extends eov {
   public static final Codec<eoq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lc.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eoq::new)
   );
   private final iv<cry> j;

   private eoq(iv<cry> $$0, int $$1, int $$2, List<erh> $$3, List<epp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eou a() {
      return eor.c;
   }

   @Override
   public void a(Consumer<csd> $$0, eoa $$1) {
      $$0.accept(new csd(this.j));
   }

   public static eov.a<?> a(czt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eoq($$0.p().n(), $$1, $$2, $$3, $$4));
   }
}
