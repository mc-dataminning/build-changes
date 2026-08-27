import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ect extends edb {
   public static final Codec<ect> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ect::new)
   );
   private final aer j;

   private ect(aer $$0, int $$1, int $$2, List<eff> $$3, List<edt> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eda a() {
      return ecx.e;
   }

   @Override
   public void a(Consumer<cix> $$0, ecg $$1) {
      $$1.a(this.j, $$0);
   }

   public static edb.a<?> a(aer $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ect($$0, $$1, $$2, $$3, $$4));
   }
}
