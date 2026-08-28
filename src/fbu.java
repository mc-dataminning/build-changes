import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbu extends fau {
   public static final MapCodec<fbu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcm.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fat.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fbu::new)
   );
   private final List<asi<String>> b;
   private final fat c;

   protected fbu(List<fcq> $$0, List<asi<String>> $$1, fat $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czd a(czd $$0, ezh $$1) {
      $$0.a(kj.U, dcm.a, this::a);
      return $$0;
   }

   public dcm a(dcm $$0) {
      List<asi<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public faw<fbu> b() {
      return fax.O;
   }
}
