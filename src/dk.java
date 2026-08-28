import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dk extends dl<dk.a> {
   @Override
   public Codec<dk.a> a() {
      return dk.a.a;
   }

   public void a(arv $$0, daa $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cn> c) implements dl.a {
      public static final Codec<dk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(dk.a::a), cn.a.optionalFieldOf("item").forGetter(dk.a::b)).apply($$0, dk.a::new)
      );

      public static ar<dk.a> a(Optional<cn> $$0) {
         return aq.G.a(new dk.a(Optional.empty(), $$0));
      }

      public static ar<dk.a> a(jh<czw> $$0, djy $$1) {
         return aq.G.a(new dk.a(Optional.empty(), Optional.of(cn.a.a().a($$0, $$1).b())));
      }

      public boolean a(daa $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
