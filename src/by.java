import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class by extends dl<by.a> {
   @Override
   public Codec<by.a> a() {
      return by.a.a;
   }

   public void a(arv $$0, bvk $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bj> b, Optional<bm> c) implements dl.a {
      public static final Codec<by.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(by.a::a), bm.a.optionalFieldOf("damage").forGetter(by.a::c)).apply($$0, by.a::new)
      );

      public static ar<by.a> b() {
         return aq.i.a(new by.a(Optional.empty(), Optional.empty()));
      }

      public static ar<by.a> a(bm $$0) {
         return aq.i.a(new by.a(Optional.empty(), Optional.of($$0)));
      }

      public static ar<by.a> a(bm.a $$0) {
         return aq.i.a(new by.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(arv $$0, bvk $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
