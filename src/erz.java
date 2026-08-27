import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erz extends esh {
   public static final Codec<erz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akt.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erz::new)
   );
   private final akt j;

   private erz(akt $$0, int $$1, int $$2, List<euu> $$3, List<etb> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esg a() {
      return esd.e;
   }

   @Override
   public void a(Consumer<cuh> $$0, erp $$1) {
      $$1.a(this.j, $$0);
   }

   public static esh.a<?> a(akt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erz($$0, $$1, $$2, $$3, $$4));
   }
}
