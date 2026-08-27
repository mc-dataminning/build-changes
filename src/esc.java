import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esc extends esh {
   public static final Codec<esc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lh.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, esc::new)
   );
   private final ja<cuc> j;

   private esc(ja<cuc> $$0, int $$1, int $$2, List<euu> $$3, List<etb> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esg a() {
      return esd.c;
   }

   @Override
   public void a(Consumer<cuh> $$0, erp $$1) {
      $$0.accept(new cuh(this.j));
   }

   public static esh.a<?> a(dbz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esc($$0.q().n(), $$1, $$2, $$3, $$4));
   }
}
