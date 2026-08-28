import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exb extends exg {
   public static final MapCodec<exb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxd.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exb::new)
   );
   private final jr<cxd> j;

   private exb(jr<cxd> $$0, int $$1, int $$2, List<ezx> $$3, List<eyc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public exf a() {
      return exc.c;
   }

   @Override
   public void a(Consumer<cxh> $$0, ewo $$1) {
      $$0.accept(new cxh(this.j));
   }

   public static exg.a<?> a(dgy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exb($$0.i().f(), $$1, $$2, $$3, $$4));
   }
}
