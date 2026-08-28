import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class etv extends eud {
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, etv::new)
   );
   private final ale j;

   private etv(ale $$0, int $$1, int $$2, List<eww> $$3, List<euz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public euc a() {
      return etz.e;
   }

   @Override
   public void a(Consumer<cvs> $$0, etl $$1) {
      $$1.a(this.j, $$0);
   }

   public static eud.a<?> a(ale $$0) {
      return a(($$1, $$2, $$3, $$4) -> new etv($$0, $$1, $$2, $$3, $$4));
   }
}
