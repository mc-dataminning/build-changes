import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eov extends epd {
   public static final Codec<eov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eov::new)
   );
   private final akh j;

   private eov(akh $$0, int $$1, int $$2, List<erq> $$3, List<epx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epc a() {
      return eoz.e;
   }

   @Override
   public void a(Consumer<csz> $$0, eol $$1) {
      $$1.a(this.j, $$0);
   }

   public static epd.a<?> a(akh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eov($$0, $$1, $$2, $$3, $$4));
   }
}
