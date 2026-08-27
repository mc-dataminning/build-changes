import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehl extends ehq {
   public static final Codec<ehl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehl::new)
   );
   private final ih<cms> j;

   private ehl(ih<cms> $$0, int $$1, int $$2, List<eju> $$3, List<eii> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehp a() {
      return ehm.c;
   }

   @Override
   public void a(Consumer<cmx> $$0, egv $$1) {
      $$0.accept(new cmx(this.j));
   }

   public static ehq.a<?> a(ctn $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehl($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
