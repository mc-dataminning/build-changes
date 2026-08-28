import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqy extends erg {
   public static final MapCodec<eqy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqy::new)
   );
   private final akk j;

   private eqy(akk $$0, int $$1, int $$2, List<etz> $$3, List<esc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erf a() {
      return erc.e;
   }

   @Override
   public void a(Consumer<cua> $$0, eqo $$1) {
      $$1.a(this.j, $$0);
   }

   public static erg.a<?> a(akk $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqy($$0, $$1, $$2, $$3, $$4));
   }
}
