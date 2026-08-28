import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewc extends ewk {
   public static final MapCodec<ewc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akv.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewc::new)
   );
   private final akv j;

   private ewc(akv $$0, int $$1, int $$2, List<ezb> $$3, List<exg> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewj a() {
      return ewg.e;
   }

   @Override
   public void a(Consumer<cwq> $$0, evs $$1) {
      $$1.a(this.j, $$0);
   }

   public static ewk.a<?> a(akv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewc($$0, $$1, $$2, $$3, $$4));
   }
}
