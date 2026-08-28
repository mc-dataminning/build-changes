import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esb extends esj {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akr.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, esb::new)
   );
   private final akr j;

   private esb(akr $$0, int $$1, int $$2, List<evc> $$3, List<etf> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esi a() {
      return esf.e;
   }

   @Override
   public void a(Consumer<cuq> $$0, err $$1) {
      $$1.a(this.j, $$0);
   }

   public static esj.a<?> a(akr $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esb($$0, $$1, $$2, $$3, $$4));
   }
}
