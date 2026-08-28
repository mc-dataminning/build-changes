import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class esp extends esy {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evt.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kb.a(lu.aL).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, esp::new)
   );
   private final evs b;
   private final Optional<jq<daa>> c;

   esp(List<euw> $$0, evs $$1, Optional<jq<daa>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eta<esp> b() {
      return etb.g;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.a();
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      ayv $$2 = $$1.b();
      ka $$3 = $$1.d().H_();
      return dac.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static esp.a a(jo.a $$0, evs $$1) {
      return new esp.a($$1).a($$0.b(lu.aL).b(awg.n));
   }

   public static class a extends esy.a<esp.a> {
      private final evs a;
      private Optional<jq<daa>> b = Optional.empty();

      public a(evs $$0) {
         this.a = $$0;
      }

      protected esp.a a() {
         return this;
      }

      public esp.a a(jq<daa> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public esz b() {
         return new esp(this.g(), this.a, this.b);
      }
   }
}
