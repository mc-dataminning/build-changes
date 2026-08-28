import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erf extends erm {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, erf::new));

   private erf(int $$0, int $$1, List<euf> $$2, List<esi> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public erl a() {
      return eri.b;
   }

   @Override
   public void a(Consumer<cuc> $$0, equ $$1) {
   }

   public static erm.a<?> b() {
      return a(erf::new);
   }
}
