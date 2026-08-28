import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class equ extends erb {
   public static final MapCodec<equ> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, equ::new));

   private equ(int $$0, int $$1, List<ett> $$2, List<erw> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public era a() {
      return eqx.b;
   }

   @Override
   public void a(Consumer<cuq> $$0, eqj $$1) {
   }

   public static erb.a<?> b() {
      return a(equ::new);
   }
}
