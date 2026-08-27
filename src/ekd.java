import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekd(Optional<Long> b, egv c) implements ejv {
   public static final Codec<ekd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atw.a(Codec.LONG, "period").forGetter(ekd::c), egv.a.fieldOf("value").forGetter(ekd::d)).apply($$0, ekd::new)
   );

   @Override
   public ejw b() {
      return ejx.r;
   }

   @Override
   public Set<eje<?>> a() {
      return this.c.a();
   }

   public boolean a(egw $$0) {
      and $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ekd.a a(egv $$0) {
      return new ekd.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public egv d() {
      return this.c;
   }

   public static class a implements ejv.a {
      private Optional<Long> a = Optional.empty();
      private final egv b;

      public a(egv $$0) {
         this.b = $$0;
      }

      public ekd.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ekd a() {
         return new ekd(this.a, this.b);
      }
   }
}
