import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eji extends ejq {
   public static final Codec<eji> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiy.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eji::new)
   );
   private final aiy j;

   private eji(aiy $$0, int $$1, int $$2, List<elu> $$3, List<eki> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ejp a() {
      return ejm.e;
   }

   @Override
   public void a(Consumer<coz> $$0, eiv $$1) {
      $$1.a(this.j, $$0);
   }

   public static ejq.a<?> a(aiy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eji($$0, $$1, $$2, $$3, $$4));
   }
}
