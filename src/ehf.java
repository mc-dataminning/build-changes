import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehf extends ehk {
   public static final Codec<ehf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehf::new)
   );
   private final ih<cmm> j;

   private ehf(ih<cmm> $$0, int $$1, int $$2, List<ejo> $$3, List<eic> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehj a() {
      return ehg.c;
   }

   @Override
   public void a(Consumer<cmr> $$0, egp $$1) {
      $$0.accept(new cmr(this.j));
   }

   public static ehk.a<?> a(cth $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehf($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
