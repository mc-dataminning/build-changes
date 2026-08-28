import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ea extends dl<ea.a> {
   @Override
   public Codec<ea.a> a() {
      return ea.a.a;
   }

   public void a(arv $$0, daa $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cn> c) implements dl.a {
      public static final Codec<ea.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(ea.a::a), cn.a.optionalFieldOf("item").forGetter(ea.a::b)).apply($$0, ea.a::new)
      );

      public static ar<ea.a> a(bz.a $$0, cn.a $$1) {
         return aq.W.a(new ea.a(Optional.of(bz.a($$0)), Optional.of($$1.b())));
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
