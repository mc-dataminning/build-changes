import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends cx<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(aox $$0, ij<cqz> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ij<cqz>> c) implements cx.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avq.a(br.b, "player").forGetter(ax.a::a), avq.a(kf.i.r(), "potion").forGetter(ax.a::c)).apply($$0, ax.a::new)
      );

      public static an<ax.a> b() {
         return am.l.a(new ax.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(ij<cqz> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
