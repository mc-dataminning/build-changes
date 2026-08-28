import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erg extends ero {
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erg::new)
   );
   private final akk j;

   private erg(akk $$0, int $$1, int $$2, List<euh> $$3, List<esk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ern a() {
      return erk.e;
   }

   @Override
   public void a(Consumer<cud> $$0, eqw $$1) {
      $$1.a(this.j, $$0);
   }

   public static ero.a<?> a(akk $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erg($$0, $$1, $$2, $$3, $$4));
   }
}
