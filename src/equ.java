import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class equ extends erc {
   public static final MapCodec<equ> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, equ::new)
   );
   private final alf j;

   private equ(alf $$0, int $$1, int $$2, List<etu> $$3, List<erx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erb a() {
      return eqy.e;
   }

   @Override
   public void a(Consumer<cur> $$0, eqk $$1) {
      $$1.a(this.j, $$0);
   }

   public static erc.a<?> a(alf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new equ($$0, $$1, $$2, $$3, $$4));
   }
}
