import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erb extends erg {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.g.s().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erb::new)
   );
   private final jj<ctv> j;

   private erb(jj<ctv> $$0, int $$1, int $$2, List<etz> $$3, List<esc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erf a() {
      return erc.c;
   }

   @Override
   public void a(Consumer<cua> $$0, eqo $$1) {
      $$0.accept(new cua(this.j));
   }

   public static erg.a<?> a(dcc $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erb($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
