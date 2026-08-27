import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqt(Optional<Long> b, enj c) implements eql {
   public static final Codec<eqt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(Codec.LONG, "period").forGetter(eqt::c), enj.a.fieldOf("value").forGetter(eqt::d)).apply($$0, eqt::new)
   );

   @Override
   public eqm b() {
      return eqn.r;
   }

   @Override
   public Set<epu<?>> a() {
      return this.c.a();
   }

   public boolean a(enk $$0) {
      apu $$1 = $$0.d();
      long $$2 = $$1.Z();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eqt.a a(enj $$0) {
      return new eqt.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public enj d() {
      return this.c;
   }

   public static class a implements eql.a {
      private Optional<Long> a = Optional.empty();
      private final enj b;

      public a(enj $$0) {
         this.b = $$0;
      }

      public eqt.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eqt a() {
         return new eqt(this.a, this.b);
      }
   }
}
