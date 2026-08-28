import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewc extends ewj {
   public static final MapCodec<ewc> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ewc::new));

   private ewc(int $$0, int $$1, List<eza> $$2, List<exf> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ewi a() {
      return ewf.b;
   }

   @Override
   public void a(Consumer<cwp> $$0, evr $$1) {
   }

   public static ewj.a<?> b() {
      return a(ewc::new);
   }
}
