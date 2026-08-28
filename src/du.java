import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class du extends dk<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(art $$0, cjk $$1) {
      fah $$2 = by.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(du.a::a), by.b.optionalFieldOf("entity").forGetter(du.a::c)).apply($$0, du.a::new)
      );

      public static ar<du.a> b() {
         return aq.y.a(new du.a(Optional.empty(), Optional.empty()));
      }

      public static ar<du.a> a(by.a $$0) {
         return aq.y.a(new du.a(Optional.empty(), Optional.of(by.a($$0))));
      }

      public boolean a(fah $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
