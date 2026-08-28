import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erj extends ero {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.g.s().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erj::new)
   );
   private final jj<cty> j;

   private erj(jj<cty> $$0, int $$1, int $$2, List<euh> $$3, List<esk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ern a() {
      return erk.c;
   }

   @Override
   public void a(Consumer<cud> $$0, eqw $$1) {
      $$0.accept(new cud(this.j));
   }

   public static ero.a<?> a(dcf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erj($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
