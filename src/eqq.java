import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqq extends eqy {
   public static final MapCodec<eqq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqq::new)
   );
   private final ale j;

   private eqq(ale $$0, int $$1, int $$2, List<etq> $$3, List<ert> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqx a() {
      return equ.e;
   }

   @Override
   public void a(Consumer<cun> $$0, eqg $$1) {
      $$1.a(this.j, $$0);
   }

   public static eqy.a<?> a(ale $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqq($$0, $$1, $$2, $$3, $$4));
   }
}
