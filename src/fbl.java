import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fbl extends fbu {
   public static final MapCodec<fbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fen.a.fieldOf("levels").forGetter($$0x -> $$0x.b), ju.a(mh.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbl::new)
   );
   private final fem b;
   private final Optional<jj<dgl>> c;

   fbl(List<fdq> $$0, fem $$1, Optional<jj<dgl>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbw<fbl> b() {
      return fbx.g;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.a();
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      azx $$2 = $$1.b();
      jt $$3 = $$1.d().J_();
      return dgn.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fbl.a a(jh.a $$0, fem $$1) {
      return new fbl.a($$1).a($$0.e(mh.aR).b(axg.n));
   }

   public static class a extends fbu.a<fbl.a> {
      private final fem a;
      private Optional<jj<dgl>> b = Optional.empty();

      public a(fem $$0) {
         this.a = $$0;
      }

      protected fbl.a a() {
         return this;
      }

      public fbl.a a(jj<dgl> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fbv b() {
         return new fbl(this.g(), this.a, this.b);
      }
   }
}
