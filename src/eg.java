import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eg extends dz<eg.a> {
   @Override
   public Codec<eg.a> a() {
      return eg.a.a;
   }

   public void a(are $$0, bva $$1) {
      ewo $$2 = bx.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dz.a {
      public static final Codec<eg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(eg.a::a), bx.b.optionalFieldOf("entity").forGetter(eg.a::b)).apply($$0, eg.a::new)
      );

      public static aq<eg.a> a(bx.a $$0) {
         return ap.o.a(new eg.a(Optional.empty(), Optional.of(bx.a($$0))));
      }

      public boolean a(ewo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }
   }
}
