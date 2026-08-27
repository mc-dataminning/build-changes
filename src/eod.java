import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eod(Optional<Long> b, ekv c) implements env {
   public static final Codec<eod> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(Codec.LONG, "period").forGetter(eod::c), ekv.a.fieldOf("value").forGetter(eod::d)).apply($$0, eod::new)
   );

   @Override
   public enw b() {
      return enx.r;
   }

   @Override
   public Set<ene<?>> a() {
      return this.c.a();
   }

   public boolean a(ekw $$0) {
      apf $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eod.a a(ekv $$0) {
      return new eod.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ekv d() {
      return this.c;
   }

   public static class a implements env.a {
      private Optional<Long> a = Optional.empty();
      private final ekv b;

      public a(ekv $$0) {
         this.b = $$0;
      }

      public eod.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eod a() {
         return new eod(this.a, this.b);
      }
   }
}
