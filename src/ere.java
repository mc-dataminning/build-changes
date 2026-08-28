import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ere extends erm {
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ere::new)
   );
   private final akk j;

   private ere(akk $$0, int $$1, int $$2, List<euf> $$3, List<esi> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erl a() {
      return eri.e;
   }

   @Override
   public void a(Consumer<cuc> $$0, equ $$1) {
      $$1.a(this.j, $$0);
   }

   public static erm.a<?> a(akk $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ere($$0, $$1, $$2, $$3, $$4));
   }
}
