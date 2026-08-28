import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dz extends dl<dz.a> {
   @Override
   public Codec<dz.a> a() {
      return dz.a.a;
   }

   public void a(asc $$0, dak $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cn> c) implements dl.a {
      public static final Codec<dz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(dz.a::a), cn.a.optionalFieldOf("item").forGetter(dz.a::b)).apply($$0, dz.a::new)
      );

      public static ar<dz.a> a(cn $$0) {
         return aq.C.a(new dz.a(Optional.empty(), Optional.of($$0)));
      }

      public static ar<dz.a> a(jh<dag> $$0, dki $$1) {
         return aq.C.a(new dz.a(Optional.empty(), Optional.of(cn.a.a().a($$0, $$1).b())));
      }

      public boolean a(dak $$0) {
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
