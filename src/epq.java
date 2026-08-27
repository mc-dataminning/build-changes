import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class epq extends epx {
   public static final MapCodec<epq> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, epq::new));

   private epq(int $$0, int $$1, List<esl> $$2, List<eqr> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public epw a() {
      return ept.b;
   }

   @Override
   public void a(Consumer<cto> $$0, epf $$1) {
   }

   public static epx.a<?> b() {
      return a(epq::new);
   }
}
