import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record emj(Optional<Long> b, ejb c) implements emb {
   public static final Codec<emj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avq.a(Codec.LONG, "period").forGetter(emj::c), ejb.a.fieldOf("value").forGetter(emj::d)).apply($$0, emj::new)
   );

   @Override
   public emc b() {
      return emd.r;
   }

   @Override
   public Set<elk<?>> a() {
      return this.c.a();
   }

   public boolean a(ejc $$0) {
      aow $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static emj.a a(ejb $$0) {
      return new emj.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ejb d() {
      return this.c;
   }

   public static class a implements emb.a {
      private Optional<Long> a = Optional.empty();
      private final ejb b;

      public a(ejb $$0) {
         this.b = $$0;
      }

      public emj.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public emj a() {
         return new emj(this.a, this.b);
      }
   }
}
