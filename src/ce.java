import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ce extends dl<ce.a> {
   @Override
   public Codec<ce.a> a() {
      return ce.a.a;
   }

   public void a(arv $$0, daa $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cn> c) implements dl.a {
      public static final Codec<ce.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(ce.a::a), cn.a.optionalFieldOf("item").forGetter(ce.a::b)).apply($$0, ce.a::new)
      );

      public static ar<ce.a> a(cn.a $$0) {
         return aq.k.a(new ce.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(daa $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cn> b() {
         return this.c;
      }
   }
}
