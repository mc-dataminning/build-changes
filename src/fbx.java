import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fbx extends fcg {
   public static final MapCodec<fbx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fez.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jv.a(mi.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbx::new)
   );
   private final fey b;
   private final Optional<jk<dgx>> c;

   fbx(List<fec> $$0, fey $$1, Optional<jk<dgx>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fci<fbx> b() {
      return fcj.g;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.a();
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      bai $$2 = $$1.b();
      ju $$3 = $$1.d().J_();
      return dgz.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fbx.a a(ji.a $$0, fey $$1) {
      return new fbx.a($$1).a($$0.e(mi.aR).b(axp.n));
   }

   public static class a extends fcg.a<fbx.a> {
      private final fey a;
      private Optional<jk<dgx>> b = Optional.empty();

      public a(fey $$0) {
         this.a = $$0;
      }

      protected fbx.a a() {
         return this;
      }

      public fbx.a a(jk<dgx> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fch b() {
         return new fbx(this.g(), this.a, this.b);
      }
   }
}
