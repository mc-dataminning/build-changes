import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewy extends exg {
   public static final MapCodec<ewy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewy::new)
   );
   private final aku j;

   private ewy(aku $$0, int $$1, int $$2, List<ezx> $$3, List<eyc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public exf a() {
      return exc.e;
   }

   @Override
   public void a(Consumer<cxh> $$0, ewo $$1) {
      $$1.a(this.j, $$0);
   }

   public static exg.a<?> a(aku $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewy($$0, $$1, $$2, $$3, $$4));
   }
}
