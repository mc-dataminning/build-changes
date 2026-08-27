import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class elk extends elr {
   public static final Codec<elk> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, elk::new));

   private elk(int $$0, int $$1, List<env> $$2, List<emj> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public elq a() {
      return eln.b;
   }

   @Override
   public void a(Consumer<cqm> $$0, ekw $$1) {
   }

   public static elr.a<?> b() {
      return a(elk::new);
   }
}
