import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edw extends eed {
   public static final Codec<edw> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, edw::new));

   private edw(int $$0, int $$1, List<egh> $$2, List<eev> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eec a() {
      return edz.b;
   }

   @Override
   public void a(Consumer<ckj> $$0, edi $$1) {
   }

   public static eed.a<?> b() {
      return a(edw::new);
   }
}
