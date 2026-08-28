import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class di extends dj<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(arr $$0, czd $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<cl> c) implements dj.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(di.a::a), cl.a.optionalFieldOf("item").forGetter(di.a::b)).apply($$0, di.a::new)
      );

      public static aq<di.a> a(Optional<cl> $$0) {
         return ap.G.a(new di.a(Optional.empty(), $$0));
      }

      public static aq<di.a> a(jf<cyz> $$0, diz $$1) {
         return ap.G.a(new di.a(Optional.empty(), Optional.of(cl.a.a().a($$0, $$1).b())));
      }

      public boolean a(czd $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cl> b() {
         return this.c;
      }
   }
}
