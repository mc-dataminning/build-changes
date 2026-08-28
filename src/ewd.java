import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewd extends ewi {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwk.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewd::new)
   );
   private final jr<cwk> j;

   private ewd(jr<cwk> $$0, int $$1, int $$2, List<eyz> $$3, List<exe> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewh a() {
      return ewe.c;
   }

   @Override
   public void a(Consumer<cwo> $$0, evq $$1) {
      $$0.accept(new cwo(this.j));
   }

   public static ewi.a<?> a(dgg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewd($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
