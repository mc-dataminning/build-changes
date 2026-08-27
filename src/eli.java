import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eli extends elp {
   public static final Codec<eli> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eli::new));

   private eli(int $$0, int $$1, List<ent> $$2, List<emh> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public elo a() {
      return ell.b;
   }

   @Override
   public void a(Consumer<cqk> $$0, eku $$1) {
   }

   public static elp.a<?> b() {
      return a(eli::new);
   }
}
