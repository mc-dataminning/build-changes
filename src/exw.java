import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exw extends eyd {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, exw::new));

   private exw(int $$0, int $$1, List<fau> $$2, List<eyz> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eyc a() {
      return exz.b;
   }

   @Override
   public void a(Consumer<cxy> $$0, exl $$1) {
   }

   public static eyd.a<?> b() {
      return a(exw::new);
   }
}
