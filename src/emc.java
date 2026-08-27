import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record emc(Optional<Long> b, eiu c) implements elu {
   public static final Codec<emc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avp.a(Codec.LONG, "period").forGetter(emc::c), eiu.a.fieldOf("value").forGetter(emc::d)).apply($$0, emc::new)
   );

   @Override
   public elv b() {
      return elw.r;
   }

   @Override
   public Set<eld<?>> a() {
      return this.c.a();
   }

   public boolean a(eiv $$0) {
      aov $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static emc.a a(eiu $$0) {
      return new emc.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eiu d() {
      return this.c;
   }

   public static class a implements elu.a {
      private Optional<Long> a = Optional.empty();
      private final eiu b;

      public a(eiu $$0) {
         this.b = $$0;
      }

      public emc.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public emc a() {
         return new emc(this.a, this.b);
      }
   }
}
