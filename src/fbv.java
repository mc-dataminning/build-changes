import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbv extends fau {
   public static final MapCodec<fbv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcn.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fat.a.forGetter($$0x -> $$0x.c))).apply($$0, fbv::new)
   );
   private final List<asi<wy>> b;
   private final fat c;

   protected fbv(List<fcq> $$0, List<asi<wy>> $$1, fat $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czd a(czd $$0, ezh $$1) {
      $$0.a(kj.V, dcn.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dcn a(dcn $$0) {
      List<asi<wy>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public faw<fbv> b() {
      return fax.N;
   }
}
