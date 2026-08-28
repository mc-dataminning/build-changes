import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erz extends esh {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akr.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erz::new)
   );
   private final akr j;

   private erz(akr $$0, int $$1, int $$2, List<eva> $$3, List<etd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esg a() {
      return esd.e;
   }

   @Override
   public void a(Consumer<cuq> $$0, erp $$1) {
      $$1.a(this.j, $$0);
   }

   public static esh.a<?> a(akr $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erz($$0, $$1, $$2, $$3, $$4));
   }
}
