import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecu extends edc {
   public static final Codec<ecu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ecu::new)
   );
   private final aer j;

   private ecu(aer $$0, int $$1, int $$2, List<efg> $$3, List<edu> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edb a() {
      return ecy.e;
   }

   @Override
   public void a(Consumer<ciy> $$0, ech $$1) {
      $$1.a(this.j, $$0);
   }

   public static edc.a<?> a(aer $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ecu($$0, $$1, $$2, $$3, $$4));
   }
}
