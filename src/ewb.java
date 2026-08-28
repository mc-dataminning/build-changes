import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewb extends ewj {
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akv.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewb::new)
   );
   private final akv j;

   private ewb(akv $$0, int $$1, int $$2, List<eza> $$3, List<exf> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewi a() {
      return ewf.e;
   }

   @Override
   public void a(Consumer<cwp> $$0, evr $$1) {
      $$1.a(this.j, $$0);
   }

   public static ewj.a<?> a(akv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewb($$0, $$1, $$2, $$3, $$4));
   }
}
