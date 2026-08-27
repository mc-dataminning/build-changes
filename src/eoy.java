import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eoy extends epd {
   public static final Codec<eoy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ld.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eoy::new)
   );
   private final iw<csu> j;

   private eoy(iw<csu> $$0, int $$1, int $$2, List<erq> $$3, List<epx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epc a() {
      return eoz.c;
   }

   @Override
   public void a(Consumer<csz> $$0, eol $$1) {
      $$0.accept(new csz(this.j));
   }

   public static epd.a<?> a(dac $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eoy($$0.q().n(), $$1, $$2, $$3, $$4));
   }
}
