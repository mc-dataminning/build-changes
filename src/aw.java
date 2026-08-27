import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aw extends cv<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(ana $$0, ih<cop> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ih<cop>> c) implements cv.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(aw.a::a), atq.a(kd.i.r(), "potion").forGetter(aw.a::c)).apply($$0, aw.a::new)
      );

      public static an<aw.a> b() {
         return am.l.a(new aw.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(ih<cop> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
