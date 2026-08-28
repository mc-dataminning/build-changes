import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class etx extends eug {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exb.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kc.a(lv.aL).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, etx::new)
   );
   private final exa b;
   private final Optional<jr<daw>> c;

   etx(List<ewe> $$0, exa $$1, Optional<jr<daw>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eui<etx> b() {
      return euj.g;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.a();
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      azk $$2 = $$1.b();
      kb $$3 = $$1.d().F_();
      return day.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static etx.a a(jp.a $$0, exa $$1) {
      return new etx.a($$1).a($$0.b(lv.aL).b(awv.n));
   }

   public static class a extends eug.a<etx.a> {
      private final exa a;
      private Optional<jr<daw>> b = Optional.empty();

      public a(exa $$0) {
         this.a = $$0;
      }

      protected etx.a a() {
         return this;
      }

      public etx.a a(jr<daw> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public euh b() {
         return new etx(this.g(), this.a, this.b);
      }
   }
}
