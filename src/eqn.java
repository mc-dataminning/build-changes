import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqn extends eqv {
   public static final MapCodec<eqn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqn::new)
   );
   private final alb j;

   private eqn(alb $$0, int $$1, int $$2, List<etn> $$3, List<erq> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public equ a() {
      return eqr.e;
   }

   @Override
   public void a(Consumer<cuk> $$0, eqd $$1) {
      $$1.a(this.j, $$0);
   }

   public static eqv.a<?> a(alb $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqn($$0, $$1, $$2, $$3, $$4));
   }
}
