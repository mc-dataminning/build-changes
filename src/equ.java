import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class equ extends eqz {
   public static final MapCodec<equ> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, equ::new)
   );
   private final ji<cuj> j;

   private equ(ji<cuj> $$0, int $$1, int $$2, List<etr> $$3, List<eru> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqy a() {
      return eqv.c;
   }

   @Override
   public void a(Consumer<cuo> $$0, eqh $$1) {
      $$0.accept(new cuo(this.j));
   }

   public static eqz.a<?> a(dbw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new equ($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
