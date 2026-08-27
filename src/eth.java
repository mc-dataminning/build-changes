import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eth extends eta {
   public static final Codec<eth> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(dps.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eth::new)
   );
   private final dps b;
   private final boolean c;

   eth(List<euu> $$0, dps $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      if (this.c) {
         $$0.a(ke.W, dps.a, this.b, ($$0x, $$1x) -> new dps.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ke.W, this.b);
      }

      return $$0;
   }

   @Override
   public etc b() {
      return etd.B;
   }

   public static eth.a a(boolean $$0) {
      return new eth.a($$0);
   }

   public static class a extends eta.a<eth.a> {
      private final dps.a a = new dps.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eth.a a() {
         return this;
      }

      @Override
      public etb b() {
         return new eth(this.g(), this.a.a(), this.b);
      }

      public eth.a a(ja<dpr> $$0, csy $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
