import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejw(Optional<Long> b, ego c) implements ejo {
   public static final Codec<ejw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.a(Codec.LONG, "period").forGetter(ejw::c), ego.a.fieldOf("value").forGetter(ejw::d)).apply($$0, ejw::new)
   );

   @Override
   public ejp b() {
      return ejq.r;
   }

   @Override
   public Set<eix<?>> a() {
      return this.c.a();
   }

   public boolean a(egp $$0) {
      amz $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ejw.a a(ego $$0) {
      return new ejw.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ego d() {
      return this.c;
   }

   public static class a implements ejo.a {
      private Optional<Long> a = Optional.empty();
      private final ego b;

      public a(ego $$0) {
         this.b = $$0;
      }

      public ejw.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ejw a() {
         return new ejw(this.a, this.b);
      }
   }
}
