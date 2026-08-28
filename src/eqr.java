import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqr extends eqz {
   public static final MapCodec<eqr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqr::new)
   );
   private final ale j;

   private eqr(ale $$0, int $$1, int $$2, List<etr> $$3, List<eru> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqy a() {
      return eqv.e;
   }

   @Override
   public void a(Consumer<cuo> $$0, eqh $$1) {
      $$1.a(this.j, $$0);
   }

   public static eqz.a<?> a(ale $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqr($$0, $$1, $$2, $$3, $$4));
   }
}
