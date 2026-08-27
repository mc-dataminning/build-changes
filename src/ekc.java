import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekc(Optional<Long> b, egu c) implements eju {
   public static final Codec<ekc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atv.a(Codec.LONG, "period").forGetter(ekc::c), egu.a.fieldOf("value").forGetter(ekc::d)).apply($$0, ekc::new)
   );

   @Override
   public ejv b() {
      return ejw.r;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.c.a();
   }

   public boolean a(egv $$0) {
      and $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ekc.a a(egu $$0) {
      return new ekc.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public egu d() {
      return this.c;
   }

   public static class a implements eju.a {
      private Optional<Long> a = Optional.empty();
      private final egu b;

      public a(egu $$0) {
         this.b = $$0;
      }

      public ekc.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ekc a() {
         return new ekc(this.a, this.b);
      }
   }
}
