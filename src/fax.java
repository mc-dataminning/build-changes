import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fax extends fbg {
   public static final MapCodec<fax> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdz.a.fieldOf("levels").forGetter($$0x -> $$0x.b), ju.a(mh.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, fax::new)
   );
   private final fdy b;
   private final Optional<jj<dga>> c;

   fax(List<fdc> $$0, fdy $$1, Optional<jj<dga>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbi<fax> b() {
      return fbj.g;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      azv $$2 = $$1.b();
      jt $$3 = $$1.d().F_();
      return dgc.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fax.a a(jh.a $$0, fdy $$1) {
      return new fax.a($$1).a($$0.e(mh.aR).b(axe.n));
   }

   public static class a extends fbg.a<fax.a> {
      private final fdy a;
      private Optional<jj<dga>> b = Optional.empty();

      public a(fdy $$0) {
         this.a = $$0;
      }

      protected fax.a a() {
         return this;
      }

      public fax.a a(jj<dga> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fbh b() {
         return new fax(this.g(), this.a, this.b);
      }
   }
}
