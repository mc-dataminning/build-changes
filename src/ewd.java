import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewd extends ewk {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ewd::new));

   private ewd(int $$0, int $$1, List<ezb> $$2, List<exg> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ewj a() {
      return ewg.b;
   }

   @Override
   public void a(Consumer<cwq> $$0, evs $$1) {
   }

   public static ewk.a<?> b() {
      return a(ewd::new);
   }
}
