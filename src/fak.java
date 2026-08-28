import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fak extends fam {
   public static final MapCodec<fak> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eyy.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, fak::new));
   private final eyy b;

   private fak(List<fci> $$0, eyy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fak> b() {
      return fap.w;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static fam.a<?> a(eyy $$0) {
      return a($$1 -> new fak($$1, $$0));
   }
}
