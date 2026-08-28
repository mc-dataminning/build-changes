import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends dj<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(arr $$0, cis $$1) {
      eyz $$2 = bx.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dj.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dt.a::a), bx.b.optionalFieldOf("entity").forGetter(dt.a::c)).apply($$0, dt.a::new)
      );

      public static aq<dt.a> b() {
         return ap.y.a(new dt.a(Optional.empty(), Optional.empty()));
      }

      public static aq<dt.a> a(bx.a $$0) {
         return ap.y.a(new dt.a(Optional.empty(), Optional.of(bx.a($$0))));
      }

      public boolean a(eyz $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
