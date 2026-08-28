import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqq extends eqv {
   public static final MapCodec<eqq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqq::new)
   );
   private final ji<cuf> j;

   private eqq(ji<cuf> $$0, int $$1, int $$2, List<etn> $$3, List<erq> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public equ a() {
      return eqr.c;
   }

   @Override
   public void a(Consumer<cuk> $$0, eqd $$1) {
      $$0.accept(new cuk(this.j));
   }

   public static eqv.a<?> a(dbs $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqq($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
