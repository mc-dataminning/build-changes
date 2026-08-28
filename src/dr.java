import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends dj<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(arr $$0, bwd $$1) {
      eyz $$2 = bx.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dj.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dr.a::a), bx.b.optionalFieldOf("entity").forGetter(dr.a::b)).apply($$0, dr.a::new)
      );

      public static aq<dr.a> a(bx.a $$0) {
         return ap.o.a(new dr.a(Optional.empty(), Optional.of(bx.a($$0))));
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

      public Optional<bi> b() {
         return this.c;
      }
   }
}
