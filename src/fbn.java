import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fbn extends fbw {
   public static final MapCodec<fbn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fep.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jv.a(mi.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbn::new)
   );
   private final feo b;
   private final Optional<jk<dgn>> c;

   fbn(List<fds> $$0, feo $$1, Optional<jk<dgn>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fby<fbn> b() {
      return fbz.g;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.a();
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      azz $$2 = $$1.b();
      ju $$3 = $$1.d().J_();
      return dgp.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fbn.a a(ji.a $$0, feo $$1) {
      return new fbn.a($$1).a($$0.e(mi.aR).b(axi.n));
   }

   public static class a extends fbw.a<fbn.a> {
      private final feo a;
      private Optional<jk<dgn>> b = Optional.empty();

      public a(feo $$0) {
         this.a = $$0;
      }

      protected fbn.a a() {
         return this;
      }

      public fbn.a a(jk<dgn> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fbx b() {
         return new fbn(this.g(), this.a, this.b);
      }
   }
}
