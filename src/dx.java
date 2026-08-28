import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dx extends dj<dx.a> {
   @Override
   public Codec<dx.a> a() {
      return dx.a.a;
   }

   public void a(arr $$0, cyy $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<cl> c) implements dj.a {
      public static final Codec<dx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dx.a::a), cl.a.optionalFieldOf("item").forGetter(dx.a::b)).apply($$0, dx.a::new)
      );

      public static aq<dx.a> a(cl $$0) {
         return ap.C.a(new dx.a(Optional.empty(), Optional.of($$0)));
      }

      public static aq<dx.a> a(jf<cyu> $$0, diu $$1) {
         return ap.C.a(new dx.a(Optional.empty(), Optional.of(cl.a.a().a($$0, $$1).b())));
      }

      public boolean a(cyy $$0) {
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
