import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erv extends esd {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erv::new)
   );
   private final akq j;

   private erv(akq $$0, int $$1, int $$2, List<euw> $$3, List<esz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esc a() {
      return erz.e;
   }

   @Override
   public void a(Consumer<cuo> $$0, erl $$1) {
      $$1.a(this.j, $$0);
   }

   public static esd.a<?> a(akq $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erv($$0, $$1, $$2, $$3, $$4));
   }
}
