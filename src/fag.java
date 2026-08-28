import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fag extends fam {
   public static final MapCodec<fag> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eyz.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, fag::new)
   );
   private final eyz.b b;

   public fag(List<fci> $$0, eyz.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fag> b() {
      return fap.B;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.a(czc.vs) && $$1.c(this.b.a()) instanceof cqy $$2) {
         $$0.b(kj.ak, new dby($$2.gh()));
      }

      return $$0;
   }

   public static fam.a<?> a(eyz.b $$0) {
      return a($$1 -> new fag($$1, $$0));
   }
}
