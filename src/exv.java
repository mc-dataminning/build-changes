import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exv extends eyd {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exv::new)
   );
   private final ald j;

   private exv(ald $$0, int $$1, int $$2, List<fau> $$3, List<eyz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eyc a() {
      return exz.e;
   }

   @Override
   public void a(Consumer<cxy> $$0, exl $$1) {
      $$1.a(this.j, $$0);
   }

   public static eyd.a<?> a(ald $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exv($$0, $$1, $$2, $$3, $$4));
   }
}
