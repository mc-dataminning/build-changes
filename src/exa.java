import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exa extends exh {
   public static final MapCodec<exa> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, exa::new));

   private exa(int $$0, int $$1, List<ezy> $$2, List<eyd> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public exg a() {
      return exd.b;
   }

   @Override
   public void a(Consumer<cxp> $$0, ewp $$1) {
   }

   public static exh.a<?> b() {
      return a(exa::new);
   }
}
