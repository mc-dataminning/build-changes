import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewf extends ewk {
   public static final MapCodec<ewf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwm.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewf::new)
   );
   private final jr<cwm> j;

   private ewf(jr<cwm> $$0, int $$1, int $$2, List<ezb> $$3, List<exg> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewj a() {
      return ewg.c;
   }

   @Override
   public void a(Consumer<cwq> $$0, evs $$1) {
      $$0.accept(new cwq(this.j));
   }

   public static ewk.a<?> a(dgi $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewf($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
