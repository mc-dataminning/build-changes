import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ety extends eud {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lv.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ety::new)
   );
   private final jo<cvn> j;

   private ety(jo<cvn> $$0, int $$1, int $$2, List<eww> $$3, List<euz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public euc a() {
      return etz.c;
   }

   @Override
   public void a(Consumer<cvs> $$0, etl $$1) {
      $$0.accept(new cvs(this.j));
   }

   public static eud.a<?> a(dei $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ety($$0.q().n(), $$1, $$2, $$3, $$4));
   }
}
