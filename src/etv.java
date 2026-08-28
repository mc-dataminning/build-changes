import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etv(Optional<Long> b, eqc c) implements etn {
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(etv::c), eqc.a.fieldOf("value").forGetter(etv::d)).apply($$0, etv::new)
   );

   @Override
   public eto b() {
      return etp.s;
   }

   @Override
   public Set<esw<?>> a() {
      return this.c.a();
   }

   public boolean a(eqd $$0) {
      arb $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static etv.a a(eqc $$0) {
      return new etv.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqc d() {
      return this.c;
   }

   public static class a implements etn.a {
      private Optional<Long> a = Optional.empty();
      private final eqc b;

      public a(eqc $$0) {
         this.b = $$0;
      }

      public etv.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public etv a() {
         return new etv(this.a, this.b);
      }
   }
}
