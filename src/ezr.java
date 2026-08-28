import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ezr extends faa {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fct.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jt.a(mg.aP).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, ezr::new)
   );
   private final fcs b;
   private final Optional<ji<dff>> c;

   ezr(List<fbw> $$0, fcs $$1, Optional<ji<dff>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fac<ezr> b() {
      return fad.g;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.a();
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      azt $$2 = $$1.b();
      js $$3 = $$1.d().F_();
      return dfh.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static ezr.a a(jg.a $$0, fcs $$1) {
      return new ezr.a($$1).a($$0.e(mg.aP).b(axc.n));
   }

   public static class a extends faa.a<ezr.a> {
      private final fcs a;
      private Optional<ji<dff>> b = Optional.empty();

      public a(fcs $$0) {
         this.a = $$0;
      }

      protected ezr.a a() {
         return this;
      }

      public ezr.a a(ji<dff> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fab b() {
         return new ezr(this.g(), this.a, this.b);
      }
   }
}
