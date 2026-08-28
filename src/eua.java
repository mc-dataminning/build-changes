import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eua(Optional<Long> b, eqh c) implements ets {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(eua::c), eqh.a.fieldOf("value").forGetter(eua::d)).apply($$0, eua::new)
   );

   @Override
   public ett b() {
      return etu.s;
   }

   @Override
   public Set<etb<?>> a() {
      return this.c.a();
   }

   public boolean a(eqi $$0) {
      arf $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eua.a a(eqh $$0) {
      return new eua.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqh d() {
      return this.c;
   }

   public static class a implements ets.a {
      private Optional<Long> a = Optional.empty();
      private final eqh b;

      public a(eqh $$0) {
         this.b = $$0;
      }

      public eua.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eua a() {
         return new eua(this.a, this.b);
      }
   }
}
