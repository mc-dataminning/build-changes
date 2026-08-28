import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fal extends fau {
   public static final MapCodec<fal> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdn.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jt.a(mg.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, fal::new)
   );
   private final fdm b;
   private final Optional<ji<dfq>> c;

   fal(List<fcq> $$0, fdm $$1, Optional<ji<dfq>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public faw<fal> b() {
      return fax.g;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      azv $$2 = $$1.b();
      js $$3 = $$1.d().F_();
      return dfs.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fal.a a(jg.a $$0, fdm $$1) {
      return new fal.a($$1).a($$0.e(mg.aR).b(axe.n));
   }

   public static class a extends fau.a<fal.a> {
      private final fdm a;
      private Optional<ji<dfq>> b = Optional.empty();

      public a(fdm $$0) {
         this.a = $$0;
      }

      protected fal.a a() {
         return this;
      }

      public fal.a a(ji<dfq> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fav b() {
         return new fal(this.g(), this.a, this.b);
      }
   }
}
