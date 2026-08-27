import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class egu extends egz {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kb.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, egu::new)
   );
   private final ie<cmc> j;

   private egu(ie<cmc> $$0, int $$1, int $$2, List<ejd> $$3, List<ehr> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public egy a() {
      return egv.c;
   }

   @Override
   public void a(Consumer<cmh> $$0, ege $$1) {
      $$0.accept(new cmh(this.j));
   }

   public static egz.a<?> a(csx $$0) {
      return a(($$1, $$2, $$3, $$4) -> new egu($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
