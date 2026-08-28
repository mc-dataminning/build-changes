import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqt extends eqy {
   public static final MapCodec<eqt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqt::new)
   );
   private final ji<cui> j;

   private eqt(ji<cui> $$0, int $$1, int $$2, List<etq> $$3, List<ert> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqx a() {
      return equ.c;
   }

   @Override
   public void a(Consumer<cun> $$0, eqg $$1) {
      $$0.accept(new cun(this.j));
   }

   public static eqy.a<?> a(dbv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqt($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
