import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class egr extends egz {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agt.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, egr::new)
   );
   private final agt j;

   private egr(agt $$0, int $$1, int $$2, List<ejd> $$3, List<ehr> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public egy a() {
      return egv.e;
   }

   @Override
   public void a(Consumer<cmh> $$0, ege $$1) {
      $$1.a(this.j, $$0);
   }

   public static egz.a<?> a(agt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new egr($$0, $$1, $$2, $$3, $$4));
   }
}
