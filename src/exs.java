import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class exs extends eyb {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fau.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kf.a(mb.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, exs::new)
   );
   private final fat b;
   private final Optional<ju<ddy>> c;

   exs(List<ezx> $$0, fat $$1, Optional<ju<ddy>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eyd<exs> b() {
      return eye.g;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      bam $$2 = $$1.b();
      ke $$3 = $$1.d().K_();
      return dea.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static exs.a a(js.a $$0, fat $$1) {
      return new exs.a($$1).a($$0.d(mb.aO).b(axx.n));
   }

   public static class a extends eyb.a<exs.a> {
      private final fat a;
      private Optional<ju<ddy>> b = Optional.empty();

      public a(fat $$0) {
         this.a = $$0;
      }

      protected exs.a a() {
         return this;
      }

      public exs.a a(ju<ddy> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public eyc b() {
         return new exs(this.g(), this.a, this.b);
      }
   }
}
