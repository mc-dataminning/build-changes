import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehm extends ehr {
   public static final Codec<ehm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehm::new)
   );
   private final ih<cmt> j;

   private ehm(ih<cmt> $$0, int $$1, int $$2, List<ejv> $$3, List<eij> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehq a() {
      return ehn.c;
   }

   @Override
   public void a(Consumer<cmy> $$0, egw $$1) {
      $$0.accept(new cmy(this.j));
   }

   public static ehr.a<?> a(cto $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehm($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
