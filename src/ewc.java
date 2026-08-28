import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewc extends ewh {
   public static final MapCodec<ewc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwj.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewc::new)
   );
   private final jr<cwj> j;

   private ewc(jr<cwj> $$0, int $$1, int $$2, List<eyy> $$3, List<exd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewg a() {
      return ewd.c;
   }

   @Override
   public void a(Consumer<cwn> $$0, evp $$1) {
      $$0.accept(new cwn(this.j));
   }

   public static ewh.a<?> a(dgf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewc($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
