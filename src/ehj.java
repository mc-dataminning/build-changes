import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehj extends ehr {
   public static final Codec<ehj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehj::new)
   );
   private final ahg j;

   private ehj(ahg $$0, int $$1, int $$2, List<ejv> $$3, List<eij> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehq a() {
      return ehn.e;
   }

   @Override
   public void a(Consumer<cmy> $$0, egw $$1) {
      $$1.a(this.j, $$0);
   }

   public static ehr.a<?> a(ahg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehj($$0, $$1, $$2, $$3, $$4));
   }
}
