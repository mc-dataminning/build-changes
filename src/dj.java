import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends cx<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(apv $$0, crs $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cc> c) implements cx.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(dj.a::a), awu.a(cc.a, "item").forGetter(dj.a::b)).apply($$0, dj.a::new)
      );

      public static an<dj.a> a(cc $$0) {
         return am.C.a(new dj.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<dj.a> a(czf $$0) {
         return am.C.a(new dj.a(Optional.empty(), Optional.of(cc.a.a().a($$0).b())));
      }

      public boolean a(crs $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cc> b() {
         return this.c;
      }
   }
}
