import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efx(efp b, List<efx.a> c) {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efp.a.fieldOf("fallback").forGetter(efx::a), efx.a.a.listOf().fieldOf("rules").forGetter(efx::b)).apply($$0, efx::new)
   );

   public static efx a(efp $$0) {
      return new efx($$0, List.of());
   }

   public static efx a(dfh $$0) {
      return a(efp.a($$0));
   }

   public dsk a(ddb $$0, ayo $$1, ja $$2) {
      for (efx.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public efp a() {
      return this.b;
   }

   public List<efx.a> b() {
      return this.c;
   }

   public static record a(dzm b, efp c) {
      public static final Codec<efx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzm.b.fieldOf("if_true").forGetter(efx.a::a), efp.a.fieldOf("then").forGetter(efx.a::b)).apply($$0, efx.a::new)
      );

      public dzm a() {
         return this.b;
      }

      public efp b() {
         return this.c;
      }
   }
}
