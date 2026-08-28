import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ewt extends exc {
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezv.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewt::new)
   );
   private final ezu b;
   private final Optional<jv<dcx>> c;

   ewt(List<eyy> $$0, ezu $$1, Optional<jv<dcx>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exe<ewt> b() {
      return exf.g;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.a();
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      azg $$2 = $$1.b();
      kf $$3 = $$1.d().K_();
      return dcz.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static ewt.a a(jt.a $$0, ezu $$1) {
      return new ewt.a($$1).a($$0.d(mc.aO).b(awr.n));
   }

   public static class a extends exc.a<ewt.a> {
      private final ezu a;
      private Optional<jv<dcx>> b = Optional.empty();

      public a(ezu $$0) {
         this.a = $$0;
      }

      protected ewt.a a() {
         return this;
      }

      public ewt.a a(jv<dcx> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public exd b() {
         return new ewt(this.g(), this.a, this.b);
      }
   }
}
