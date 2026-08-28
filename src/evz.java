import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class evz extends ewh {
   public static final MapCodec<evz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, evz::new)
   );
   private final aku j;

   private evz(aku $$0, int $$1, int $$2, List<eyy> $$3, List<exd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewg a() {
      return ewd.e;
   }

   @Override
   public void a(Consumer<cwn> $$0, evp $$1) {
      $$1.a(this.j, $$0);
   }

   public static ewh.a<?> a(aku $$0) {
      return a(($$1, $$2, $$3, $$4) -> new evz($$0, $$1, $$2, $$3, $$4));
   }
}
