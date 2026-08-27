import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eoo extends eov {
   public static final Codec<eoo> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eoo::new));

   private eoo(int $$0, int $$1, List<erh> $$2, List<epp> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eou a() {
      return eor.b;
   }

   @Override
   public void a(Consumer<csd> $$0, eoa $$1) {
   }

   public static eov.a<?> b() {
      return a(eoo::new);
   }
}
