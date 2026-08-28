import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ext extends eyc {
   public static final MapCodec<ext> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fav.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kf.a(mb.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, ext::new)
   );
   private final fau b;
   private final Optional<ju<ddz>> c;

   ext(List<ezy> $$0, fau $$1, Optional<ju<ddz>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eye<ext> b() {
      return eyf.g;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      bam $$2 = $$1.b();
      ke $$3 = $$1.d().K_();
      return deb.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static ext.a a(js.a $$0, fau $$1) {
      return new ext.a($$1).a($$0.d(mb.aO).b(axx.n));
   }

   public static class a extends eyc.a<ext.a> {
      private final fau a;
      private Optional<ju<ddz>> b = Optional.empty();

      public a(fau $$0) {
         this.a = $$0;
      }

      protected ext.a a() {
         return this;
      }

      public ext.a a(ju<ddz> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public eyd b() {
         return new ext(this.g(), this.a, this.b);
      }
   }
}
