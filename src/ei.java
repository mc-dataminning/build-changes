import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ei extends dz<ei.a> {
   @Override
   public Codec<ei.a> a() {
      return ei.a.a;
   }

   public void a(are $$0, cgy $$1) {
      evr $$2 = bx.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dz.a {
      public static final Codec<ei.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(ei.a::a), bx.b.optionalFieldOf("entity").forGetter(ei.a::c)).apply($$0, ei.a::new)
      );

      public static aq<ei.a> b() {
         return ap.y.a(new ei.a(Optional.empty(), Optional.empty()));
      }

      public static aq<ei.a> a(bx.a $$0) {
         return ap.y.a(new ei.a(Optional.empty(), Optional.of(bx.a($$0))));
      }

      public boolean a(evr $$0) {
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
   }
}
