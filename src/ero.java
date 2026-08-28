import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ero extends ert {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cp.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), erw.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ero::new)
   );
   private final cp b;
   private final eru c;

   private ero(List<etr> $$0, cp $$1, eru $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erv<ero> b() {
      return erw.v;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eqn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
