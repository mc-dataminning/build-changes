import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eyx extends ezf {
   public static final MapCodec<eyx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eyx::new)
   );
   private final ale j;

   private eyx(ale $$0, int $$1, int $$2, List<fbw> $$3, List<fab> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eze a() {
      return ezb.e;
   }

   @Override
   public void a(Consumer<cys> $$0, eyn $$1) {
      $$1.a(this.j, $$0);
   }

   public static ezf.a<?> a(ale $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eyx($$0, $$1, $$2, $$3, $$4));
   }
}
