import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class epu extends epz {
   public static final MapCodec<epu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, epu::new)
   );
   private final ix<ctl> j;

   private epu(ix<ctl> $$0, int $$1, int $$2, List<esn> $$3, List<eqt> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epy a() {
      return epv.c;
   }

   @Override
   public void a(Consumer<ctq> $$0, eph $$1) {
      $$0.accept(new ctq(this.j));
   }

   public static epz.a<?> a(day $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epu($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
