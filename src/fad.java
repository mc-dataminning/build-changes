import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fad extends fam {
   public static final MapCodec<fad> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdf.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jt.a(mg.aQ).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, fad::new)
   );
   private final fde b;
   private final Optional<ji<dfl>> c;

   fad(List<fci> $$0, fde $$1, Optional<ji<dfl>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fao<fad> b() {
      return fap.g;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      azv $$2 = $$1.b();
      js $$3 = $$1.d().F_();
      return dfn.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fad.a a(jg.a $$0, fde $$1) {
      return new fad.a($$1).a($$0.e(mg.aQ).b(axe.n));
   }

   public static class a extends fam.a<fad.a> {
      private final fde a;
      private Optional<ji<dfl>> b = Optional.empty();

      public a(fde $$0) {
         this.a = $$0;
      }

      protected fad.a a() {
         return this;
      }

      public fad.a a(ji<dfl> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fan b() {
         return new fad(this.g(), this.a, this.b);
      }
   }
}
