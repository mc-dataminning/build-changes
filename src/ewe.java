import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewe extends ewj {
   public static final MapCodec<ewe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwl.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewe::new)
   );
   private final jr<cwl> j;

   private ewe(jr<cwl> $$0, int $$1, int $$2, List<eza> $$3, List<exf> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewi a() {
      return ewf.c;
   }

   @Override
   public void a(Consumer<cwp> $$0, evr $$1) {
      $$0.accept(new cwp(this.j));
   }

   public static ewj.a<?> a(dgh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewe($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
