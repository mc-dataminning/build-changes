import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbm extends fam {
   public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dch.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fal.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fbm::new)
   );
   private final List<asi<String>> b;
   private final fal c;

   protected fbm(List<fci> $$0, List<asi<String>> $$1, fal $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cyy a(cyy $$0, eyz $$1) {
      $$0.a(kj.U, dch.a, this::a);
      return $$0;
   }

   public dch a(dch $$0) {
      List<asi<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fao<fbm> b() {
      return fap.O;
   }
}
